package Stage3.My_posts.ASC.DESC;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class GetPosts_User1Test extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running test");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void GetPostsUser1_DescTest() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", 1)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());
			Assertions.assertEquals(body.asString().contains("authorId\":4520"), true);

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer count = jsonPathEvaluator.get("meta.count");
			Assertions.assertEquals(20, count);

			//Проверяем что id автора = 4520
			Integer a = jsonPathEvaluator.get("data[0].authorId");
			System.out.println(a);
			Assertions.assertEquals(4520, a);

			//Проверяем что сортировка DESC
			Integer id2 = jsonPathEvaluator.get("data[2].id");
			Integer id3 = jsonPathEvaluator.get("data[3].id");
			System.out.println(id2);
			System.out.println(id3);

			Assertions.assertTrue(id2 > id3);
	  }

	  @Test
	  @Order(2)
	  void GetPosts_User1_DescCopyTest() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", 1)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());
			Assertions.assertEquals(body.asString().contains("authorId\":4520"), true);

			JsonPath jsonPathEvaluator = body.jsonPath();
			String description = jsonPathEvaluator.get("data[1].description");
			Assertions.assertEquals("This is my first Post", description);

	  }

	  @Test
	  @Order(3)
	  void GetPosts_User1_not_existTest() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", 45)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			//System.out.println("Response Body is: " + body.asString());
		//	Assertions.assertEquals(body.asString().contains("authorId\":4520"), true);

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer prevPage = jsonPathEvaluator.get("meta.prevPage");
			Assertions.assertEquals(44, prevPage);
	  }
}

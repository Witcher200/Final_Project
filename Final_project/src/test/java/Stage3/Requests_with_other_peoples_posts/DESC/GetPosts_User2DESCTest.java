package Stage3.Requests_with_other_peoples_posts.DESC;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetPosts_User2DESCTest extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running test");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void GetPosts_User2_DESCTest() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", 22)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer labels = jsonPathEvaluator.get("data[4].labels");
			Assertions.assertEquals(null, labels);

			//Проверяем что сортировка DESC
			Integer id2 = jsonPathEvaluator.get("data[2].id");
			Integer id3 = jsonPathEvaluator.get("data[3].id");
			System.out.println(id2);
			System.out.println(id3);

			Assertions.assertTrue(id2 > id3);
	  }

	  @Test
	  @Order(2)
	  void GetPosts_User2_DESC_not_existTest() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", -1)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer title = jsonPathEvaluator.get("data[4].title");
			Assertions.assertEquals(null, title);
	  }

	  @Test
	  @Order(3)
	  void GetPosts_2_User2_DESCTest() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", 222)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer count = jsonPathEvaluator.get("meta.count");
			Assertions.assertEquals(6557, count);
	  }

	  @Test
	  @Order(4)
	  void GetPosts3_User2_DESCTest() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", "10000000000000000")
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer description = jsonPathEvaluator.get("data[1].description");
			Assertions.assertEquals(null, description);
	  }
}

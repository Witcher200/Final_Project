package Stage3.Requests_with_other_peoples_posts.ASC;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class GetPosts_User2Test extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running test");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void GetPostsUser2Test() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 1)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());
			//Assertions.assertEquals(body.asString().contains("authorId\":4663"), true);

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer count = jsonPathEvaluator.get("meta.count");
			Assertions.assertEquals(6557, count);

			Integer b = jsonPathEvaluator.get("meta.count");
			System.out.println(b);
			Assertions.assertTrue(b >10 | b < 100);

			//Проверяем что сортировка ASC
			Integer id0 = jsonPathEvaluator.get("data[0].id");
			Integer id1 = jsonPathEvaluator.get("data[1].id");
			System.out.println(id0);
			System.out.println(id1);

			Assertions.assertTrue(id0 < id1);
	  }

	  @Test
	  @Order(2)
	  void GetPosts_User2not_existTest() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 1)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer id = jsonPathEvaluator.get("data[3].id");
			Assertions.assertEquals(15, id);

	  }

	  @Test
	  @Order(3)
	  void GetPosts2_User2Test() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 2)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer nextPage = jsonPathEvaluator.get("meta.nextPage");
			Assertions.assertEquals(3, nextPage);
	  }

	  @Test
	  @Order(4)
	  void GetPosts3_User2Test() {
			ResponseBody body = given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 0)
				.headers("X-Auth-Token", getToken())
				.expect().statusCode(200)
				.when()
				.get(getPostsURL()).getBody();

			System.out.println("Response Body is: " + body.asString());

			JsonPath jsonPathEvaluator = body.jsonPath();
			Integer nextPage = jsonPathEvaluator.get("meta.nextPage");
			Assertions.assertEquals(1, nextPage);
	  }
}

package Stage3.Requests_with_other_peoples_posts.ALL;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetPosts_User2ALLTest extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running test");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void GetPosts_User2_ALLTest() {
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ALL")
				.queryParam("page", 1111)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(500);
	  }

	  @Test
	  @Order(2)
	  void GetPosts_User2_not_exist_ALLTest() {
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ALL")
				.queryParam("page", -11)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(500);
	  }

	  @Test
	  @Order(3)
	  void GetPosts3_User2_ALLTest() {
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ALL")
				.queryParam("page", "0000")
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(500);
	  }

	  @Test
	  @Order(4)
	  void GetPosts2_User2_ALLTest() {
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ALL")
				.queryParam("page", 212)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(500);
	  }
}

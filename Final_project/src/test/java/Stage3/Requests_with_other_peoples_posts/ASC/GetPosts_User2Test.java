package Stage3.Requests_with_other_peoples_posts.ASC;

import io.restassured.RestAssured;
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
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 1)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void GetPosts_User2not_existTest() {
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 1)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(3)
	  void GetPosts2_User2Test() {
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 2)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(4)
	  void GetPosts3_User2Test() {
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 0)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }
}

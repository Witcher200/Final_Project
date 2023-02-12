package Stage3.My_posts.ASC.ASC;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetPostsUser1Test extends AbstractPageTest {

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)

	  void GetPosts_User1Test() {
			System.out.println( getToken());
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 1)
				.headers("Accept","*/*")
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void GetPosts_User1_CopyTest() {
			given()
				.log()
				.all()
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
	  @Order(3)
	  void GetPosts_User1not_existsTest() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 10)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }
}

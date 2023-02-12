package Stage3.My_posts.ASC.ASC;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetPosts_User1_IncorectToken extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void GetPosts_User1IncorectTokenTest() {
			System.out.println( tokenIncorect());
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", 1)
				.headers("Accept","*/*")
				.headers("X-Auth-Token", tokenIncorect())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(401);
	  }
}

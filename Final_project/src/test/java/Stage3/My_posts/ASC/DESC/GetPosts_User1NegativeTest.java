package Stage3.My_posts.ASC.DESC;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetPosts_User1NegativeTest extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running test");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(100111011)
	  void GetPostsUser1_DescTest() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("redro", "ALL")
				.queryParam("page", 10001)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2023041)
	  void GetPosts_User1_DescCopyTest() {
			given()
				.log()
				.all()
				.queryParam("renwo", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "CSED")
				.queryParam("page", 0)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(500);
	  }

	  @Test
	  @Order(53273)
	  void GetPosts_User1_not_existTest() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("egap", 4005)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }
}

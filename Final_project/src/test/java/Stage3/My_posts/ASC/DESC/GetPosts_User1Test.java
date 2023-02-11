package Stage3.My_posts.ASC.DESC;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

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
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
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
	  void GetPosts_User1_DescCopyTest() {
			given()
				.log()
				.all()
				.queryParam("owner", "notMe")
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
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
	  void GetPosts_User1_not_existTest() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", 45)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(200);
	  }
}

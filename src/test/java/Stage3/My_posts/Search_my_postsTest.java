package Stage3.My_posts;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Search_my_postsTest extends AbstractPageTest{

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void Search_postsTest() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", "1")
				.expect()
				.when()
				.get(PostsURL()+"my_publication")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(2)
	  void Search_posts2Test() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "ASC")
				.queryParam("page", "2")
				.expect()
				.when()
				.get(PostsURL()+"my_publication2")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(3)
	  void Search_posts3Test() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", "1")
				.expect()
				.when()
				.get(PostsURL()+"my_publication3")
				.then()
				.statusCode(404);
	  }
}

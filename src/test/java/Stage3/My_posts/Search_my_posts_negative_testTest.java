package Stage3.My_posts;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Search_my_posts_negative_testTest extends AbstractPageTest{

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(13)
	  void Search_postsTest() {
			given()
				.log()
				.all()
				.queryParam("tros", "tAdetaerc")
				.queryParam("reder", "CSA")
				.queryParam("egap", "0")
				.expect()
				.when()
				.get(PostsURL()+"noitacilbup_ym")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(215)
	  void Search_posts2Test() {
			given()
				.log()
				.all()
				.queryParam("share", "rule")
				.queryParam("catdog", "dogcat")
				.queryParam("age", "5000")
				.expect()
				.when()
				.get(PostsURL()+"his_broken_logic")
				.then()
				.statusCode(404);
	  }
}

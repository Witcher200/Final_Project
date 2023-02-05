package Stage3.Requests_with_other_peoples_posts;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Look_for_someone_elsss_publication_negative_testTest extends AbstractPageTest{

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(78)
	  void Look_someone_publicationTest() {
			given()
				.log()
				.all()
				.queryParam("owner", "notingMe")
				.queryParam("sorted", "createdTag")
				.queryParam("order", "1")
				.queryParam("page", "la-la-la")
				.expect()
				.when()
				.get(CatURL()+"someone_nose")
				.then()
				.statusCode(403);
	  }

	  @Test
	  @Order(52)
	  void Look_someone_publication2Test() {
			given()
				.log()
				.all()
				.queryParam("OWL", "createdMe")
				.queryParam("bla-bla", "1000")
				.queryParam("cucumber", "Skedaddle")
				.queryParam("book", "BU-GA-Ga-GA-GA")
				.expect()
				.when()
				.get(CatURL()+"slime")
				.then()
				.statusCode(403);
	  }
}

package Stage3.Login;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTest extends AbstractPageTest {

	  @BeforeEach
	  void setUp() {
			System.out.println(" ");
			System.out.println("Start running tests");
			/*RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();*/
	  }

	  @Test
	  @Order(1)
	  void Enter_usernameTest() {
			given()
				.log()
				.all()
				.queryParam("query", "28022023")
				.expect()
				.when()
				.post(getloginURL())
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void Enter_passwordTest() {
			given()
				.log()
				.all()
				.queryParam("query", "2be9e97498")
				.expect()
				.when()
				.get(getloginURL())
				.then()
				.statusCode(200);
	  }

	  @Test
	  @Order(2)
	  void Click_on_loginTest() {
			given()
				.log()
				.all()
				.queryParam("query", "click")
				.expect()
				.when()
				.post(getloginURL())
				.then()
				.statusCode(200);
	  }
}

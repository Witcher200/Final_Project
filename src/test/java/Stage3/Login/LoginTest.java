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
				.queryParam("query", "autotest")
				.queryParam("page", 1)
				.expect()
				.when()
				.post(getloginURL()+"Enter_username")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(2)
	  void Enter_passwordTest() {
			given()
				.log()
				.all()
				.queryParam("query", "4956318935")
				.queryParam("page", 1)
				.expect()
				.when()
				.get(getloginURL()+"Enter_password")
				.then()
				.statusCode(404);
	  }

	  @Test
	  @Order(2)
	  void Click_on_loginTest() {
			given()
				.log()
				.all()
				.queryParam("query", "click")
				.queryParam("page", 1)
				.expect()
				.when()
				.post(getloginURL()+"Click_on_login")
				.then()
				.statusCode(404);
	  }
}

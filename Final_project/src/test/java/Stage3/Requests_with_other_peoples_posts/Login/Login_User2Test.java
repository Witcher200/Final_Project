package Stage3.Requests_with_other_peoples_posts.Login;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Login_User2Test extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void LoginUser2Test() {
			given()
				.log()
				.all()
				.queryParam("username", "jfFe73hyy2")
				.queryParam("password", "n293DY21l")
				.expect()
				.when()
				.post(getLogin_with_wrong_credURL())
				.then()
				.statusCode(400);
	  }
}

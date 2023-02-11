package Stage3.My_posts.ASC.Login;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

;

public class Login_User1NegativeTest extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void LoginUser1Test() {
			given()
				.log()
				.all()
				.queryParam("nameuser", "32022082")
				.queryParam("drowssap", "89479e9eb2")
				.expect()
				.when()
				.post(getLoginURL())
				.then()
				.statusCode(200);
	  }
}

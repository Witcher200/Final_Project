package Stage3.My_posts.ASC.Login;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class Login_User1Test extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void LoginUser_Ok() {
			given()
				.log()
				.all()
				.params("username","28022023")
				.params("password","2be9e97498")
				.post("https://test-stand.gb.ru/gateway/login")
				.then()
				.assertThat()
				.body(containsString("token"))
				.statusCode(200)
				.log()
				.all();
	  }

	  @Test
	  @Order(2)
	  void LoginUser_Wrong_creds() {
			given()
				.log()
				.all()
				.params("username","dfsfsdf")
				.params("password","sdffsdfs")
				.post("https://test-stand.gb.ru/gateway/login")
				.then()
				.assertThat()
				.body(containsString("Invalid credentials"))
				.statusCode(401)
				.log()
				.all();
	  }

	  @Test
	  @Order(3)
	  void LoginUser_Wrong_params() {
			given()
				.log()
				.all()
				.params("username","dfsfsdf")
				.post("https://test-stand.gb.ru/gateway/login")
				.then()
				.assertThat()
				.statusCode(400)
				.log()
				.all();
	  }
}

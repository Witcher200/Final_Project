package Stage3.My_posts.ASC.Login;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
;
import static io.restassured.RestAssured.given;

public class Login_User1Test extends AbstractPageTest{

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(1)
	  void LoginUser1Test() {

		//	JSONObject requestBody = new JSONObject();
		//	requestBody.put("username", "28022023");
	//		requestBody.put("password", "2be9e97498");
//			RequestSpecification request = RestAssured.given();
//			request.header("Content-Type", "application/json");
//			request.body(requestBody.toJSONString());
//			Response response = request.post("https://webhook.site/a18a23cb-e9a0-4f03-a7fa-cdfcfa76ca98");
//			int statusCode = response.getStatusCode();
//			Assert.assertEquals(statusCode, 200);
//			System.out.println("The status code recieved: " + statusCode);

			given()
				.header("Content-Type", "application/json")
				.body("{\"username\":\"28022023\",\"password\":\"2be9e97498\"}")
				.log()
				.all()
				.post(getLoginURL())
				//		.queryParam("username", "28022023")
		//		.queryParam("password", "2be9e97498")
		//		.body()
			//	.expect()
			//	.when()
				.then()
				.statusCode(1200);
	  }
}

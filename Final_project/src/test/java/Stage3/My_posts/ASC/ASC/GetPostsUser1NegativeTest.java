package Stage3.My_posts.ASC.ASC;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static Stage3.My_posts.ASC.DESC.AbstractPageTest.getToken;
import static io.netty.channel.group.ChannelMatchers.is;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetPostsUser1NegativeTest extends AbstractPageTest {

	  @BeforeEach
	  void setup() {
			System.out.println(" ");
			System.out.println("Start running tests");
			RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	  }

	  @Test
	  @Order(936)
	  void GetPosts_User1Test() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "ALL")
				.queryParam("page", -10)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(500);
	  }

	  @Test
	  @Order(263)
	  void GetPosts_User1_CopyTest() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "DESC")
				.queryParam("page", -2000)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then().assertThat().statusCode(200);
				//and().body("prevPage", equalTo(1));
			//	.assertThat(.body("meta.prevPage"),1);
	  }

	  @Test
	  @Order(3926)
	  void GetPosts_User1not_existsTest() {
			given()
				.log()
				.all()
				.queryParam("sort", "createdAt")
				.queryParam("order", "ALL")
				.queryParam("page", 10-20)
				.headers("X-Auth-Token", getToken())
				.expect()
				.when()
				.get(getPostsURL())
				.then()
				.statusCode(500);
	  }

	  }

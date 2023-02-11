package Stage3.Requests_with_other_peoples_posts.Login;

import org.junit.jupiter.api.BeforeAll;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AbstractPageTest {

	  static Properties prop = new Properties();
	  private static String Login_with_wrong_cred;

	  @BeforeAll
	  static void initTest() throws IOException {
			InputStream confFile = new FileInputStream("src/test/resources/my.properties");
			prop.load(confFile);

			Login_with_wrong_cred = prop.getProperty("Login_with_wrong_cred");
	  }

	  public static String getLogin_with_wrong_credURL() {
			return Login_with_wrong_cred;
	  }

}

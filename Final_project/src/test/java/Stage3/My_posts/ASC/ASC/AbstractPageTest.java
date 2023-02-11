package Stage3.My_posts.ASC.ASC;

import org.junit.jupiter.api.BeforeAll;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AbstractPageTest {

	  static Properties prop = new Properties();
	  private static String PostsURL;
	  private static String xToken;

	  @BeforeAll
	  static void initTest() throws IOException {
			InputStream confFile = new FileInputStream("src/test/resources/my.properties");
			prop.load(confFile);

			PostsURL = prop.getProperty("PostsURL");
			xToken = prop.getProperty("X_Auth_Token");
	  }

	  public static String getPostsURL() {
			return PostsURL;
	  }
	  public static String getToken() {
			return xToken;
	  }
}

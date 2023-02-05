package Stage3.Requests_with_other_peoples_posts;

import org.junit.jupiter.api.BeforeAll;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AbstractPageTest {

	  static Properties prop = new Properties();
	  private static String PostsURL;
	  private static String CatURL;

	  @BeforeAll
	  static void initTest() throws IOException {
			InputStream confFile = new FileInputStream("src/test/java/resources/my.properties");
			prop.load(confFile);

			PostsURL = prop.getProperty("PostsURL");
			CatURL = prop.getProperty("CatUrl");
	  }

	  public static String PostsURL() {
			return PostsURL;
	  }
	  public static String CatURL() {
			return CatURL;
	  }
}

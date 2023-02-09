package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Post_previewTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Post_preview test")
	  void Post_preview() {
			WebElement username_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div/label"));
			username_input.sendKeys("28022023");

			//Ввод password "2be9e97498" в поле "Password"
			WebElement password_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input"));
			password_input.sendKeys("2be9e97498");

			//Клик на кнопку "Login"
			WebElement click_btn_login = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[3]/button"));
			click_btn_login.click();

			//Клик на кнопку "Home"
			WebElement click_on_icon = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div[2]/div[2]/div[1]/button"));
			click_on_icon.click();
	  }
 }

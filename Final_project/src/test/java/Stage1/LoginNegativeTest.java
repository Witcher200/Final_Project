package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginNegativeTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Login test")
	  void LoginNegative() {
			//Ввод username "2083016820" в поле "Username"
			WebElement username_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div/label"));
			username_input.sendKeys("28022023");

			//Ввод password "2be9e97498" в поле "Password"
			WebElement password_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input"));
			password_input.sendKeys("1lsi6wp0cmg8b0e");

			//Клик на кнопку "Login"
			WebElement click_btn_login = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[3]/button"));
			click_btn_login.click();

	  }
}

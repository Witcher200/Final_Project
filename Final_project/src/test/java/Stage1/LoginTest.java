package Stage1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Login test")
	  void Login() {
			//Ввод username "28022023" в поле "Username"
			WebElement username_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div/label"));
			username_input.sendKeys("28022023");

			//Ввод password "2be9e97498" в поле "Password"
			WebElement password_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input"));
			password_input.sendKeys("2be9e97498");

			WebElement copyright = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/footer/div"));
			Assertions.assertEquals("Copyright ⓒ 2022 . Geekbrains", copyright.getText());

			//Клик на кнопку "Login"
			WebElement btn_login = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[3]/button"));
			btn_login.click();

			WebElement  Hello = getWebDriver().findElement(By.xpath("//*[@id=\"app\"]/main/nav/ul/li[3]/a"));
			Assertions.assertEquals("Hello, 28022023", Hello.getText());
	  }
}

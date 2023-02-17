package Stage4.sign_in;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthorizationsTest extends AbstractPageTest {

	  @Test
	  @DisplayName("sign_in")
	  @Description("Выполнение авторизации")
	  void Authorization_execution() {
			//Ввод имени в поле "Username"
			WebElement Entering_name_in_field_Username = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div/label[1]"));
			Entering_name_in_field_Username.sendKeys("28022023");

			//Ввод пароля в поле "Password"
			WebElement Entering_password_in_field_Password = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div[2]/label"));
			Entering_password_in_field_Password.sendKeys("2be9e97498");

			WebElement copyright = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/footer/div"));
			Assertions.assertEquals("Copyright ⓒ 2022 . Geekbrains", copyright.getText());

			//Клик на кнопку "Login"
			WebElement Click_on_btn_Login = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div[3]/button"));
			Click_on_btn_Login.click();

			WebElement  Hello = getWebDriver().findElement(By.xpath("//*[@id=\"app\"]/main/nav/ul/li[3]/a"));
			Assertions.assertEquals("Hello, 28022023", Hello.getText());

	  }

}

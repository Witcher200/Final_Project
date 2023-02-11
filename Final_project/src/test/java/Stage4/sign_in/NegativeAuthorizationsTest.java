package Stage4.sign_in;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NegativeAuthorizationsTest extends AbstractPageTest {

	  @Test
	  @DisplayName("sign_in")
	  @Description("Выполнение авторизации")
	  void Authorization_execution() {
			//Ввод имени в поле "Username"
			WebElement Entering_name_in_field_Username = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div/label[1]"));
			Entering_name_in_field_Username.sendKeys("Igor");

			//Ввод пароля в поле "Password"
			WebElement Entering_password_in_field_Password = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div[2]/label"));
			Entering_password_in_field_Password.sendKeys("123");

			//Клик на кнопку "Login"
			WebElement Click_on_btn_Login = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div[3]/button"));
			Click_on_btn_Login.click();
	  }
}

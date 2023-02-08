package Stage4.Create_new_post;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Moving_around_thePage extends AbstractPageTest{

	  @Test
	  @DisplayName("moving_around_page")
	  @Description("Переход между страницами")
	  void moving() {
			/***
			 * Для успешного выполнения этого теста, я добавил сюда регистрацию
			 ***/
			//Ввод имени в поле "Username"
			WebElement Entering_name_in_field_Username = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div/label[1]"));
			Entering_name_in_field_Username.sendKeys("28022023");

			//Ввод пароля в поле "Password"
			WebElement Entering_password_in_field_Password = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div[2]/label"));
			Entering_password_in_field_Password.sendKeys("2be9e97498");

			//Клик на кнопку "Login"
			WebElement Click_on_btn_Login = getWebDriver().findElement(By.xpath("//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div[3]/button"));
			Click_on_btn_Login.click();

			//Клик на кнопку "Next Page"
			WebElement click_on_nextPage = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div[3]/div[2]/div/a[2]"));
			click_on_nextPage.click();

			//Клик на кнопу "Previous Page"
			WebElement click_on_btn_PreviousPage = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div[3]/div[2]/div/a[1]"));
			click_on_btn_PreviousPage.click();
	  }

}

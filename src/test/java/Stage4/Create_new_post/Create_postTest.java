package Stage4.Create_new_post;

import jdk.jfr.Description;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Create_postTest extends AbstractPageTest{

	  @Test
	  @DisplayName("creating_post")
	  @Description("Создание поста")
	  void Create_post() {
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

			//Клик на иконку "Плюс"
			WebElement click_on_plus = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div[2]/div/button"));
			click_on_plus.click();

			//Ввод заголовка в поле "Title"
			WebElement enter_title = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[1]/div/label"));
			enter_title.sendKeys("test");

			//Ввод описания в поле "Description"
			WebElement enter_description = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[2]/div/label/span/textarea"));
			enter_description.sendKeys("I never used this web site");

			//Ввод контента в поле "Content"
			WebElement enter_content = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[3]/div/label/span/textarea"));
			enter_content.sendKeys("contents");

			//Клик на иконку "Календарь" для выбора даты
			WebElement date_picker = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[5]/div/div/label/input"));
			date_picker.click();

			//Клик на кнопку "Save"
			WebElement save_post = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[7]/div/button"));
			save_post.click();

			//Переход на главную страницу
			WebElement click_on_mainPage = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/nav/a"));
			click_on_mainPage.click();
	  }
}

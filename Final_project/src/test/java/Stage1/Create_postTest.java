package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Create_postTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Create_post test")
	  void Create_post() {
			WebElement username_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div/label"));
			username_input.sendKeys("28022023");

			//Ввод password "2be9e97498" в поле "Password"
			WebElement password_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input"));
			password_input.sendKeys("2be9e97498");

			//Клик на кнопку "Login"
			WebElement click_btn_login = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[3]/button"));
			click_btn_login.click();

			//Клик на кнопку "Плюс"
			WebElement click_on_plus = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/button"));
			click_on_plus.click();

			//Ввод заголовка "First Post" в поле ввода "Title"
			WebElement enter_title_FirstPost = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div/div/label/input"));
			enter_title_FirstPost.click();

			//Ввод описание "This is my first Post" в поле ввода "Description"
			WebElement enter_description_This_isMyFirsPost = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[2]/div/label/span/textarea"));
			enter_description_This_isMyFirsPost.click();

			//Ввод контента "test" в поле ввода "Content"
			WebElement content_entry_test = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[3]/div/label/span/textarea"));
			content_entry_test.click();

			//Клик на иконку "Календарь" для выбора даты
			WebElement click_on_the_calendar_icon = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[5]/div/div/label/input"));
			click_on_the_calendar_icon.click();

			//Клик в поле "New image" для добавления изображения
			WebElement click_in_the_newimage_box = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[6]/div/div/label"));
			//click_in_the_newimage_box.click();

			//Клик на кнопку "Save"
			WebElement click_save_btn = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[7]/div/button/span"));
			click_save_btn.click();
	  }
}

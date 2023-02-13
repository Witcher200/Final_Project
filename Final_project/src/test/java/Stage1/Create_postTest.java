package Stage1;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class Create_postTest extends AbstractPageTest {

	  static EventFiringWebDriver eventDriver;
	  @Test
	  @DisplayName("Create_post test")
	  void Create_post() throws InterruptedException {
			WebElement username_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div/label"));
			username_input.sendKeys("28022023");

			//Ввод password "2be9e97498" в поле "Password"
			WebElement password_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input"));
			password_input.sendKeys("2be9e97498");

			//Клик на кнопку "Login"
			WebElement btn_login = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[3]/button"));
			btn_login.click();

			WebElement  Hello = getWebDriver().findElement(By.xpath("//*[@id=\"app\"]/main/nav/ul/li[3]/a"));
			Assert.assertEquals("Hello, 28022023", Hello.getText());

			//Клик на кнопку "Плюс"
			WebElement Button_plus = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/button"));
			Button_plus.click();

			WebElement Header = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/h1"));
			Assertions.assertEquals("Create Post", Header.getText());

			//Ввод заголовка "First Post" в поле ввода "Title"
			WebElement enter_title_FirstPost = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div/div/label/input"));
			enter_title_FirstPost.sendKeys("First Post");

			//Ввод описание "This is my first Post" в поле ввода "Description"
			WebElement enter_description_This_isMyFirsPost = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[2]/div/label/span/textarea"));
			enter_description_This_isMyFirsPost.sendKeys("This is my first Post");

			//Ввод контента "test" в поле ввода "Content"
			WebElement content_entry_test = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[3]/div/label/span/textarea"));
			content_entry_test.sendKeys("test");

			//Клик на иконку "Календарь" для выбора даты
			WebElement calendar_icon = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[5]/div/div/label/input"));
			calendar_icon.click();

			//Клик в поле "New image" для добавления изображения
			WebElement click_in_the_newimage_box = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[6]/div/div/label"));
			//click_in_the_newimage_box.click();

			//Клик на кнопку "Save"
			WebElement save_btn = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/form/div/div/div[7]/div/button/span"));
			save_btn.click();

			TimeUnit.SECONDS.sleep(3);
			WebElement Header_new = getWebDriver().findElement(By.xpath("//*[@id=\"app\"]/main/div/div[1]/h1"));
			Assertions.assertEquals("First Post", Header_new.getText());
	  }
}

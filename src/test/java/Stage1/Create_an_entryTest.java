package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Create_an_entryTest extends AbstractPageTest{

	  @Test
	  @DisplayName("Test 1 Create_an_entry")
	  void Create_an_entry() {
			//Ввод email в поле "Введите номер телефона или email"
			WebElement Write_Email = getWebDriver().findElement(By.xpath("//div[@id=\"index_rcolumn\"]/div/div/form/input[1]"));
			Write_Email.sendKeys("igor.h8k@gmail.com");

			//Клик на кнопку Войти
			WebElement Click_enter = getWebDriver().findElement(By.xpath("//div[@id=\"index_rcolumn\"]/div/div/form/button[1]"));
			Click_enter.click();

			//Ввод пароля
			WebElement Write_Password = getWebDriver().findElement(By.xpath("//div[@class=\"vkc__Password__Wrapper\"]/div/div/input"));
			Write_Password.sendKeys("Ig0R844!2#");

			//Клик на кнопку Продолжить
			WebElement Click_continue = getWebDriver().findElement(By.xpath("//div[@class=\"vkc__EnterPasswordNoUserInfo__buttonWrap\"]/button/span"));
			Click_continue.click();

			//Ввод текста в поле ввода текста "Это мой кот, по имени Аксель"
			WebElement click_on_whats_news = getWebDriver().findElement(By.xpath("//div[@id=\"post_field\"]"));
			click_on_whats_news.sendKeys("This is my cat named Axel");

			//Клик на иконку смайлик
			WebElement click_on_emoji = getWebDriver().findElement(By.xpath("//div[@class=\"emoji_smile_icon_inline_svg emoji_smile_icon\"]"));
			click_on_emoji.click();

			//Клик на смайлик
			WebElement click_emoji = getWebDriver().findElement(By.xpath("//div[@class=\"EmojiPickerSection-module__item--vop9Q EmojiItem-module__item--yFc2D\"][10]"));
			click_emoji.click();

			//Клик на аккордеон "Видно всем"
			WebElement Click_on_the_accordion_Seen_to_all = getWebDriver().findElement(By.xpath("//div[@class=\"post_action_btn_layout\"]"));
			Click_on_the_accordion_Seen_to_all.click();

			//Клик на кнопку "Видно друзьям"
			WebElement Click_on_the_See_to_friends_button = getWebDriver().findElement(By.xpath("//div[text()=\"Видно друзьям\"]"));
			Click_on_the_See_to_friends_button.click();

			//Клик на аккордеон "Тематика"
			WebElement Click_on_the_Theme_accordion = getWebDriver().findElement(By.xpath("//div[@class=\"post_action_btn\"]"));
			Click_on_the_Theme_accordion.click();

			//Клик на кнопку "IT"
			WebElement Click_on_the_IT_button = getWebDriver().findElement(By.xpath("//div[@class=\"FancyElementTT__item radiobtn\"][2]"));
			Click_on_the_IT_button.click();

			//Клик на иконку "Фотоаппарата"
			WebElement Click_on_the_Camera_icon = getWebDriver().findElement(By.xpath("//span[@class=\"MediaSelector__mediaIcon\"]"));
			Click_on_the_Camera_icon.click();

			//Клик на сохраненную фотографию
			WebElement Click_on_saved_photo = getWebDriver().findElement(By.xpath("//div[@class=\"box_layout\"]/div[2]/div/div[2]/div[3]/a[29]"));
			Click_on_saved_photo.click();

			//Клик на кнопку "Отправить"
			WebElement Click_on_the_Submit_button = getWebDriver().findElement(By.xpath("//div[@id=\"submit_post\"]/div/button"));
			Click_on_the_Submit_button.click();
 	  }
}

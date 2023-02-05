package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Section_ClipsTest extends AbstractPageTest{
	  @Test
	  @DisplayName("Test 5 Section_Clips")
	  void Section_Clips() {
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

			//Клик в раздел "Клипы"
			WebElement Click_to_Clips_section = getWebDriver().findElement(By.xpath("//div[@id=\"side_bar\"]/div/nav/ol/li[10]/a"));
			Click_to_Clips_section.click();

			//Клик на кнопку "Подписаться"
			WebElement Click_on_the_Subscribe_button = getWebDriver().findElement(By.xpath("//button[@class=\"flat_button button_small ShortVideoPost__subscribe\"]"));
			Click_on_the_Subscribe_button.click();

			//Клик на иконку "Сердечко"
			WebElement Click_on_the_Heart_icon = getWebDriver().findElement(By.xpath("//div[@class=\"like_btns\"]/div/span[1]"));
			Click_on_the_Heart_icon.click();

			//Клик на иконку "Комментария"
			WebElement Click_on_the_comment_icon = getWebDriver().findElement(By.xpath("//div[@class=\"like_btns\"]/div[2]/span"));
			Click_on_the_comment_icon.click();

			//Клик на поле "Написать комментарий"
			WebElement Click_on_the_field_Write_a_comment = getWebDriver().findElement(By.xpath("//div[@class=\"reply_form\"]/div/div/div[2]"));
			Click_on_the_field_Write_a_comment.sendKeys("Вау, круто");

			//Клик на кнопку "Отправить"
			WebElement Click_on_the_Submit_button = getWebDriver().findElement(By.xpath("//button[@class=\"FlatButton FlatButton--primary FlatButton--size-m addpost_button\"]"));
			Click_on_the_Submit_button.click();

			//Клик на иконку "Крестика"
			WebElement Click_on_the_Cross_icon = getWebDriver().findElement(By.xpath("//div[@class=\"VerticalVideoLayerInfo__topControlsWrap\"]/div/div/div[1]"));
			Click_on_the_Cross_icon.click();
	  }
}

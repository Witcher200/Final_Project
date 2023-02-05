package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Section_VideoTest extends AbstractPageTest{
	  @Test
	  @DisplayName("Test 10 Section_Video")
	  void Section_Video() {
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

			//Клик в раздел "Видео"
			WebElement Click_in_the_section_Video = getWebDriver().findElement(By.xpath("//div[@id=\"side_bar\"]/div/nav/ol/li[9]/a"));
			Click_in_the_section_Video.click();

			//Клик на видео
			WebElement Click_on_video = getWebDriver().findElement(By.xpath("//div[@class=\"video_items_list _video_type_trends_list VideoGrid\"]/div/a[1]"));
			Click_on_video.click();

			//Открыть видео на весь экран
			WebElement Click_on_the_button_Open_video_in_full_screen = getWebDriver().findElement(By.xpath("//div[@class=\"videoplayer_controls _has_fullscreen\"]/div[13]"));
			Click_on_the_button_Open_video_in_full_screen.click();

			//Клик на иконку "Нравится"
			WebElement Click_on_the_Like_icon = getWebDriver().findElement(By.xpath("//div[@class=\"videoplayer_share_actions\"]/div[2]"));
			Click_on_the_Like_icon.click();

			//Клик на иконку "Сохранить в закладки"
			WebElement Click_on_the_Save_to_bookmarks_icon = getWebDriver().findElement(By.xpath("//div[@class=\"videoplayer_share_actions\"]/div[4]"));
			Click_on_the_Save_to_bookmarks_icon.click();

			//Клик на иконку "Добавить к себе"
			WebElement Click_on_the_Add_to_me_icon = getWebDriver().findElement(By.xpath("//div[@class=\"videoplayer_share_actions\"]/div[5]"));
			Click_on_the_Add_to_me_icon.click();

			//Клик на кнопку "Свернуть"
			WebElement Click_on_the_Expand_button = getWebDriver().findElement(By.xpath("//div[@class=\"videoplayer_controls _has_fullscreen\"]/div[13]"));
			Click_on_the_Expand_button.click();

			//Клик на кнопку "Нравится"
			WebElement Click_on_the_Like_button = getWebDriver().findElement(By.xpath("//div[@class=\"videoplayer_share_actions\"]/div[2]"));
			Click_on_the_Like_button.click();

			//Клик на поле "Написать комментарий" и ввод текста "Мое любимое шоу, с моим любимым шефом Ивлевым"
			WebElement Entering_text_in_the_text_input_field = getWebDriver().findElement(By.xpath("//div[@class=\"reply_form\"]/div/div/div[2][1]"));
			Entering_text_in_the_text_input_field.sendKeys("Круто!");

			//Клик на "Стрелочку"
			WebElement Click_on_the_Arrow = getWebDriver().findElement(By.xpath("//button[@class=\"FlatButton FlatButton--primary FlatButton--size-m addpost_button\"]/SPAN"));
			Click_on_the_Arrow.click();

			//Клик на иконку "Крестик"
			WebElement Click_on_the_Cross_icon = getWebDriver().findElement(By.xpath("//div[@class=\"VideoLayerInfo__topControlsWrap\"]/div/div[1]"));
			Click_on_the_Cross_icon.click();
	  }
}

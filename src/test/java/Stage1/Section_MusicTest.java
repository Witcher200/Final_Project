package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Section_MusicTest extends AbstractPageTest{
	  @Test
	  @DisplayName("Test 7 Section_Music")
	  void Section_Music() {
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

			//Клик в раздел "Музыка"
			WebElement Click_in_the_section_Music = getWebDriver().findElement(By.xpath("//div[@id=\"side_bar\"]/div/nav/ol/li[8]/a"));
			Click_in_the_section_Music.click();

			//Клик в подраздел "Обзор"
			WebElement Click_on_the_Overview_subsection = getWebDriver().findElement(By.xpath("//div[@id=\"content\"]/div/div[3]/div/h2/ul/li[3]/a"));
			Click_on_the_Overview_subsection.click();

			//Клик на музыку в разделе "Новинки"
			WebElement Click_to_music_in_the_New_section = getWebDriver().findElement(By.xpath("//div[@class=\"audio_row__cover_back _audio_row__cover_back\"]"));
			Click_to_music_in_the_New_section.click();

			//Клик в поле "Поиск музыки" и ввод поискового запроса "Дискотека авария"
			WebElement Click_in_the_Search_of_music_field = getWebDriver().findElement(By.xpath("//div[@class=\"audio_search_wrapper audio_search_wrapper_new\"]/div/div/div/form/input"));
			Click_in_the_Search_of_music_field.click();
	  }
}

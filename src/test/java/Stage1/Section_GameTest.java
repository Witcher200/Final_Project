package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Section_GameTest extends AbstractPageTest{
	  @Test
	  @DisplayName("Test 6 Section_Game")
	  void Section_Game() {
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

			//Клик на раздел "Игры"
			WebElement Click_to_the_Game_section = getWebDriver().findElement(By.xpath("//div[@id=\"side_bar_inner\"]/nav/ol/li[11]/a"));;
			Click_to_the_Game_section.click();

			//Клик на кнопку "Показать все"
			WebElement Click_on_the_ShowAll_button = getWebDriver().findElement(By.xpath("//div[@id=\"wrap3\"]/div/div/div[2]/div/div/div[2]/h2/a/div[2]"));
			Click_on_the_ShowAll_button.click();

			//Клик на игру
			WebElement Click_on_game = getWebDriver().findElement(By.xpath("//div[text()=\"Отряд Сакура\"]"));
			Click_on_game.click();
	  }
}

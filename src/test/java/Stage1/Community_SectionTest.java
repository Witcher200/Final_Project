package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Community_SectionTest extends AbstractPageTest {
	  @Test
	  @DisplayName("Test 4 Community_Section")
	  void Community_Section() {
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

			//Клик в раздел "Сообщества"
			WebElement Click_in_the_section_Communities = getWebDriver().findElement(By.xpath("//div[@id=\"side_bar_inner\"]/nav/ol/li[6]/a/span[1]"));
			Click_in_the_section_Communities.click();

			//Клик в поле "Поиск сообщества" и ввод текста "Готовь Как Шеф Ивлев!"
			WebElement Click_in_the_field_Search_community = getWebDriver().findElement(By.xpath("//div[@class=\"page_block\"]/div/div/div/div/form/input"));
			Click_in_the_field_Search_community.sendKeys("Готовь Как Шеф Ивлев!");

			//Клик на иконку "Лупы"
			WebElement Click_on_the_icon_Lupa = getWebDriver().findElement(By.xpath("//div[@class=\"page_block\"]/div/div/div/button"));
			Click_on_the_icon_Lupa.click();

			//Клик на сообщество
			WebElement Click_on_community = getWebDriver().findElement(By.xpath("//div[@id=\"gl_groups26480817\"]/div[3]/div/a"));
			Click_on_community.click();
	  }
}

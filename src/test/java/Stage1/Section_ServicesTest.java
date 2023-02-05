package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Section_ServicesTest extends AbstractPageTest{
	  @Test
	  @DisplayName("Test 9 Section_Services")
	  void Section_Services() {
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

			//Клик на раздел "Сервис"
			WebElement Click_on_the_service_section = getWebDriver().findElement(By.xpath("//div[@id=\"page_layout\"]/div/div/nav/ol/li[14]/a"));
			Click_on_the_service_section.click();

			//Клик на сервис
			WebElement Click_on_the_Service_icon = getWebDriver().findElement(By.xpath("//div[@class=\"AppsCatalogMainPage\"]/section[6]/div[2]/div[5]/div/div/div/a[1]"));
			Click_on_the_Service_icon.click();
	  }
}

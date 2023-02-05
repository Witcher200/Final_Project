package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Click_on_historyTest extends AbstractPageTest{

	  @Test
	  @DisplayName("Test 2 Click_on_history")
	  void Click_on_history() {
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

			//Клик на историю
			WebElement Click_on_history = getWebDriver().findElement(By.xpath("//div[@class=\"stories_feed_items_wrap\"]/div/div[3]/a[3]"));
			Click_on_history.click();

			//Клик на икону "Сердечко"
			WebElement Click_on_the_Heart_icon = getWebDriver().findElement(By.xpath("//div[@id=\"stories_list\"]/div[2]/div/div[4]/div/div/div[1]/div[1]/div"));
			Click_on_the_Heart_icon.click();

			//Клик на "Крестик"
			WebElement Click_on_Cross = getWebDriver().findElement(By.xpath("//div[@class=\"stories_layer shown\"]/div/div[4]"));
			Click_on_Cross.click();
	  }
}

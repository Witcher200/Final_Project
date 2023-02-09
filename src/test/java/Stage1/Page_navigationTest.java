package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page_navigationTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Page_navigation test")
	  void Page_navigation() {
			WebElement username_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div/label"));
			username_input.sendKeys("28022023");

			//Ввод password "2be9e97498" в поле "Password"
			WebElement password_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input"));
			password_input.sendKeys("2be9e97498");

			//Клик на кнопку "Login"
			WebElement click_btn_login = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[3]/button"));
			click_btn_login.click();

			//Клик на кнопку "Home"
			WebElement click_on_Home_btn = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/nav/a"));
			click_on_Home_btn.click();

			//Клик на кнопку "Next Page"
			WebElement click_on_NextPage_btn = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div[3]/div[2]/div/a[2]"));
			click_on_NextPage_btn.click();

			//Клик на кнопку "Previous Page"
			WebElement click_on_PreviousPage_btn = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div[3]/div[2]/div/a[1]"));
			click_on_PreviousPage_btn.click();
	  }
}

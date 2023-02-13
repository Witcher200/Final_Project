package Stage1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class View_created_postTest extends AbstractPageTest {

	  @Test
	  @DisplayName("View_created_post")
	  void View_created_post() {
			//Ввод username "28022023" в поле "Username"
			WebElement username_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div/label"));
			username_input.sendKeys("28022023");

			//Ввод password "2be9e97498" в поле "Password"
			WebElement password_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input"));
			password_input.sendKeys("2be9e97498");

			//Клик на кнопку "Login"
			WebElement btn_login = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[3]/button"));
			btn_login.click();

			//Клик на кнопку "Home"
			WebElement btn_Hellow_280022023 = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/nav/ul/li[3]/a"));
			btn_Hellow_280022023.click();

			WebElement Profile_btn = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/nav/ul/li[3]/div/ul/li[1]/span[2]"));
			Profile_btn.click();

			WebElement full_name = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/div/div[2]/div/div[1]/div[2]"));
			Assertions.assertEquals("Kruck Igor", full_name.getText());

			WebElement btn_SeeMyPosts = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div[1]/div/div[1]/div/div/div/div[3]/div[1]/button[1]/span"));
			btn_SeeMyPosts.click();

			WebElement creating_post = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div[3]/div/a[1]/img"));
			creating_post.click();

	  }
}

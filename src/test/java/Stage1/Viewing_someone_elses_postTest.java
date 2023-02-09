package Stage1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Viewing_someone_elses_postTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Viewing_someone_elses_post")
	  void Viewing_someone_elses_post() {
			WebElement username_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div/label"));
			username_input.sendKeys("28022023");

			//Ввод password "2be9e97498" в поле "Password"
			WebElement password_input = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input"));
			password_input.sendKeys("2be9e97498");

			//Клик на кнопку "Login"
			WebElement click_btn_login = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div/form/div[3]/button"));
			click_btn_login.click();

			//Клик на кнопку "Home"
			WebElement click_on_btn_Hellow_280022023 = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/nav/ul/li[3]/a"));
			click_on_btn_Hellow_280022023.click();

			WebElement click_on_Profile_btn = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/nav/ul/li[3]/div/ul/li[1]/span[2]"));
			click_on_Profile_btn.click();

			WebElement click_on_SeeNot_MyPosts = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div/div[1]/div/div[1]/div/div/div/div[3]/div[1]/button[2]/span"));
			click_on_SeeNot_MyPosts.click();

			WebElement click_on_post = getWebDriver().findElement(By.xpath("//div[@id=\"app\"]/main/div/div[3]/div/a[1]/h2[1]"));
			click_on_post.click();
	  }
}

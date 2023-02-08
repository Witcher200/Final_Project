package Stage4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authorization extends AbstractPage{

	  public WebDriver driver;

	  public Authorization(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div/label[1]")
	  private static WebElement Entering_name_in_field_Username;

	  @FindBy(xpath = "//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div[2]/label")
	  private static WebElement Entering_password_in_field_Password;

	  @FindBy(xpath = "//div[@class=\"container svelte-1pbgeyl\"]/div/div/form/div[3]/button/div")
	  private static WebElement Click_on_btn_Login;

	  public Authorization Entering_name_in_field_Username() {
			Entering_name_in_field_Username.sendKeys("autotest");
			return this;
	  }

	  public Authorization Entering_password_in_field_Password() {
			Entering_password_in_field_Password.sendKeys("4956318935");
			return this;
	  }

	  public Authorization Click_on_btn_Login() {
			Click_on_btn_Login.click();
			return this;
	  }
}

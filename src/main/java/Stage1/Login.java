package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends AbstractPage {

	  public WebDriver driver;

	  public Login(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/div/form/div/label")
	  private WebElement username_input;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/div/form/div[2]/label/input")
	  private WebElement password_input;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/div/form/div[3]/button")
	  private WebElement click_btn_login;

	  public Login username_input() {
			username_input.sendKeys("28022023");
			return this;
	  }

	  public Login password_input() {
			password_input.sendKeys("2be9e97498");
			return this;
	  }

	  public Login click_btn_login() {
			click_btn_login.click();
			return this;
	  }


}

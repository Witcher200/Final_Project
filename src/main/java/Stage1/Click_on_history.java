package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_on_history extends AbstractPage{

	  public WebDriver driver;

	  public Click_on_history(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@id=\"index_rcolumn\"]/div/div/form/input[1]")
	  private WebElement Write_Email;

	  @FindBy(xpath = "//div[@id=\"index_rcolumn\"]/div/div/form/button[1]")
	  private WebElement Click_enter;

	  @FindBy(xpath = "//div[@class=\"vkc__Password__Wrapper\"]/div/div/input")
	  private WebElement Write_Password;

	  @FindBy(xpath = "//div[@class=\"vkc__EnterPasswordNoUserInfo__buttonWrap\"]/button/span")
	  private WebElement Click_continue;

	  @FindBy(xpath = "//div[@class=\"stories_feed_items_wrap\"]/div/div[3]/a[3]")
	  private WebElement Click_on_history;

	  @FindBy(xpath = "//div[@id=\"wl_post_actions_wrap\"]/div[2]/div/div/div/div")
	  private WebElement Click_on_the_Heart_icon;

	  @FindBy(xpath = "//div[@class=\"wk_right_nav no_select\"]/div/div")
	  private WebElement Click_on_Cross;

	  public Stage1.Click_on_history Write_Email() {
			Write_Email.sendKeys("igor.h8k@gmail.com");
			return this;
	  }

	  public Stage1.Click_on_history Click_enter() {
			Click_enter.click();
			return this;
	  }

	  public Stage1.Click_on_history Write_Password() {
			Write_Password.sendKeys("Ig0R844!2#");
			return this;
	  }

	  public Stage1.Click_on_history Click_continue() {
			Click_continue.click();
			return this;
	  }

	  public Click_on_history Click_history() {
			Click_on_history.click();
			return this;
	  }

	  public Click_on_history Click_on_the_Heart_icon() {
			Click_on_the_Heart_icon.click();
			return this;
	  }

	  public Click_on_history Click_on_Cross() {
			Click_on_Cross.click();
			return this;
	  }
}

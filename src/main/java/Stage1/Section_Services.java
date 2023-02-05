package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Section_Services extends AbstractPage{

	  public WebDriver driver;

	  public Section_Services(WebDriver driver) {
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

	  @FindBy(xpath = "//div[@id=\"page_layout\"]/div/div/nav/ol/li[14]/a")
	  private WebElement Click_on_the_service_section;

	  @FindBy(xpath = "//div[@class=\"AppsCatalogMainPage\"]/section[6]/div[2]/div[5]/div/div/div/a[1]")
	  private WebElement Click_on_the_Service_icon;

	  public Section_Services Write_Email() {
			Write_Email.sendKeys("igor.h8k@gmail.com");
			return this;
	  }

	  public Section_Services Click_enter() {
			Click_enter.click();
			return this;
	  }

	  public Section_Services Write_Password() {
			Write_Password.sendKeys("Ig0R844!2#");
			return this;
	  }

	  public Section_Services Click_continue() {
			Click_continue.click();
			return this;
	  }

	  public Section_Services Click_on_the_service_section() {
			Click_on_the_service_section.click();
			return this;
	  }

	  public Section_Services Click_on_the_Service_icon() {
			Click_on_the_Service_icon.click();
			return this;
	  }
}

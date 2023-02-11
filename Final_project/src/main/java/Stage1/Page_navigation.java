package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_navigation extends AbstractPage {

	  public WebDriver driver;

	  public Page_navigation(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@id=\"app\"]/main/nav/a")
	  private WebElement click_on_Home_btn;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div[3]/div[2]/div/a[2]")
	  private WebElement click_on_NextPage_btn;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div[3]/div[2]/div/a[1]")
	  private WebElement click_on_PreviousPage_btn;

	  public Page_navigation click_on_Home_btn() {
			click_on_Home_btn.click();
			return this;
	  }

	  public Page_navigation click_on_NextPage_btn() {
			click_on_NextPage_btn.click();
			return this;
	  }

	  public Page_navigation click_on_PreviousPage_btn() {
			click_on_PreviousPage_btn.click();
			return this;
	  }
}

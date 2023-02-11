package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post_preview extends AbstractPage {

	  public WebDriver driver;

	  public Post_preview(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div[2]/div[2]/div[1]/button")
	  private WebElement click_on_icon;

	  public Post_preview click_on_icon() {
			click_on_icon.click();
			return this;
	  }
}

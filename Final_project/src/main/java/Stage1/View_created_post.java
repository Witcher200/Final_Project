package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class View_created_post extends AbstractPage {

	  public WebDriver driver;

	  public View_created_post(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@id=\"app\"]/main/nav/ul/li[3]/a")
	  private WebElement click_on_btn_Hellow_280022023;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/nav/ul/li[3]/div/ul/li[1]/span[1]")
	  private WebElement click_on_Profile_btn;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/nav/ul/li[3]/a")
	  private WebElement click_on_btn_SeeMyPosts;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/nav/ul/li[3]/a")
	  private WebElement click_on_creating_post;

	  public View_created_post click_on_btn_Hellow_280022023() {
			click_on_btn_Hellow_280022023.click();
			return this;
	  }

	  public View_created_post click_on_Profile_btn() {
			click_on_Profile_btn.click();
			return this;
	  }

	  public View_created_post click_on_btn_SeeMyPosts() {
			click_on_btn_SeeMyPosts.click();
			return this;
	  }

	  public View_created_post click_on_creating_post() {
			click_on_creating_post.click();
			return this;
	  }
}

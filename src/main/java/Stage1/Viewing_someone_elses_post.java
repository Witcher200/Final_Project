package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Viewing_someone_elses_post extends AbstractPage {

	  public WebDriver driver;

	  public Viewing_someone_elses_post(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@id=\"app\"]/main/nav/ul/li[3]/a")
	  private WebElement click_on_btn_Hellow_280022023;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/nav/ul/li[3]/div/ul/li[1]/span[1]")
	  private WebElement click_on_Profile;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/div/div/div/div/div/div/div[3]/div[1]/button[2]")
	  private WebElement click_on_SeeNot_MyPosts;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div[3]/div/a[1]/h2[1]")
	  private WebElement click_on_post;

	  private Viewing_someone_elses_post click_on_btn_Hellow_280022023() {
			click_on_btn_Hellow_280022023.click();
			return this;
	  }

	  private Viewing_someone_elses_post click_on_Profile() {
			click_on_Profile.click();
			return this;
	  }

	  private Viewing_someone_elses_post click_on_SeeNot_MyPosts() {
			click_on_SeeNot_MyPosts.click();
			return this;
	  }

	  private Viewing_someone_elses_post click_on_post() {
			click_on_post.click();
			return this;
	  }
}
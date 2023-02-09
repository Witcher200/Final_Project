package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_post extends AbstractPage {

	  public WebDriver driver;

	  public Create_post(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/div/button")
	  private WebElement click_on_plus;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/form/div/div/div/div/label/input")
	  private WebElement enter_title_FirstPost;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/form/div/div/div[2]/div/label/span/textarea")
	  private WebElement enter_description_This_isMyFirsPost;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/form/div/div/div[3]/div/label/span/textarea")
	  private WebElement content_entry_test;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/form/div/div/div[5]/div/div/label/input")
	  private WebElement click_on_the_calendar_icon;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/form/div/div/div[6]/div/div/label")
	  private WebElement click_in_the_newimage_box;

	  @FindBy(xpath = "//div[@id=\"app\"]/main/div/div/form/div/div/div[7]/div/button/span")
	  private WebElement click_save_btn;

	  public Create_post click_on_plus() {
			click_on_plus.click();
			return this;
	  }

	  public Create_post enter_title_FirstPost() {
			enter_title_FirstPost.sendKeys("First Post");
			return this;
	  }

	  public Create_post enter_description_This_isMyFirsPost() {
			enter_description_This_isMyFirsPost.sendKeys("This is my first Post");
			return this;
	  }

	  public Create_post content_entry_test() {
			content_entry_test.sendKeys("test");
			return this;
	  }

	  public Create_post click_on_the_calendar_icon() {
			click_on_the_calendar_icon.click();
			return this;
	  }

	  public Create_post click_in_the_newimage_box() {
			click_in_the_newimage_box.click();
			return this;
	  }

	  public Create_post click_save_btn() {
			click_save_btn.click();
			return this;
	  }
}

package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_an_entry extends AbstractPage {

	  public WebDriver driver;

	  public Create_an_entry(WebDriver driver) {
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

	  @FindBy(xpath = "//div[@id=\"post_field\"]")
	  private WebElement click_on_whats_news;

	  @FindBy(xpath = "//div[@class=\"emoji_smile_icon_inline_svg emoji_smile_icon\"]")
	  private WebElement click_on_emoji;

	  @FindBy(xpath = "//div[@class=\"EmojiPickerSection-module__item--vop9Q EmojiItem-module__item--yFc2D\"][10]")
	  private WebElement click_emoji;

	  @FindBy(xpath = "//div[@class=\"post_action_btn_layout\"]")
	  private WebElement Click_on_the_accordion_Seen_to_all;

	  @FindBy(xpath = "//div[text()=\"Видно друзьям\"]")
	  private WebElement Click_on_the_See_to_friends_button;

	  @FindBy(xpath = "//div[@class=\"post_action_btn\"]")
	  private WebElement Click_on_the_Theme_accordion;

	  @FindBy(xpath = "//div[@class=\"FancyElementTT__item radiobtn\"][2]")
	  private WebElement Click_on_the_IT_button;

	  @FindBy(xpath = "//span[@class=\"MediaSelector__mediaIcon\"]")
	  private WebElement Click_on_the_Camera_icon;

	  @FindBy(xpath = "//div[@id=\"photos_choose_rows\"]/a[@id=\"photos_choose_row272300066_457240483_\"]")
	  private WebElement Click_on_saved_photo;

	  @FindBy(xpath = "//div[@class=\"poster__sidebar\"]/div[2]/button")
	  private WebElement Click_on_the_Submit_button;

	  public Create_an_entry Write_Email() {
			Write_Email.sendKeys("igor.h8k@gmail.com");
			return this;
	  }

	  public Create_an_entry Click_enter() {
			Click_enter.click();
			return this;
	  }

	  public Create_an_entry Write_Password() {
			Write_Password.sendKeys("Ig0R844!2#");
			return this;
	  }

	  public Create_an_entry Click_continue() {
			Click_continue.click();
			return this;
	  }

	  public Create_an_entry click_on_whats_news() {
			click_on_whats_news.sendKeys("This is my cat named Axel");
			  return this;
	  }

	  public Create_an_entry click_on_emoji() {
			click_on_emoji.click();
			return this;
	  }

	  public Create_an_entry click_emoji() {
			click_emoji.click();
			return this;
	  }

	  public Create_an_entry Click_on_the_accordion_Seen_to_all() {
			Click_on_the_accordion_Seen_to_all.click();
			return this;
	  }

	  public Create_an_entry Click_on_the_See_to_friends_button() {
			Click_on_the_See_to_friends_button.click();
			return this;
	  }

	  public Create_an_entry Click_on_the_Theme_accordion() {
			Click_on_the_Theme_accordion.click();
			return this;
	  }

	  public Create_an_entry Click_on_the_IT_button() {
			Click_on_the_IT_button.click();
			return this;
	  }

	  public Create_an_entry Click_on_the_Camera_icon() {
			Click_on_the_Camera_icon.click();
			return this;
	  }

	  public Create_an_entry Click_on_saved_photo() {
			Click_on_saved_photo.click();
			return  this;
	  }

	  public Create_an_entry Click_on_the_Submit_button() {
			Click_on_the_Submit_button.click();
			return this;
	  }
}

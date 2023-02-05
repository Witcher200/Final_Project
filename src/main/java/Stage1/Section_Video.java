package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Section_Video extends AbstractPage{

	  public WebDriver driver;

	  public Section_Video(WebDriver driver) {
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

	  @FindBy(xpath = "//div[@id=\"side_bar\"]/div/nav/ol/li[9]/a")
	  private WebElement Click_in_the_section_Video;

	  @FindBy(xpath = "//div[@class=\"video_items_list _video_type_trends_list VideoGrid\"]/div/a[1]")
	  private WebElement Click_on_video;

	  @FindBy(xpath = "//div[@class=\"videoplayer_controls _has_fullscreen\"]/div[13]")
	  private WebElement Click_on_the_button_Open_video_in_full_screen;

	  @FindBy(xpath = "//div[@class=\"videoplayer_share_actions\"]/div[2]")
	  private WebElement Click_on_the_Like_icon;

	  @FindBy(xpath = "//div[@class=\"videoplayer_share_actions\"]/div[4]")
	  private WebElement Click_on_the_Save_to_bookmarks_icon;

	  @FindBy(xpath = "//div[@class=\"videoplayer_share_actions\"]/div[5]")
	  private WebElement Click_on_the_Add_to_me_icon;

	  @FindBy(xpath = "//div[@class=\"videoplayer_controls _has_fullscreen\"]/div[13]")
	  private WebElement Click_on_the_Expand_button;

	  @FindBy(xpath = "//div[@id=\"wl_post_actions_wrap\"]/div[2]/div/div/div/div")
	  private WebElement Click_on_the_Like_button;

	  @FindBy(xpath = "//div[@id=\"reply_field-193616150_551969\"]")
	  private WebElement Entering_text_in_the_text_input_field;

	  @FindBy(xpath = "//button[@id=\"reply_button-193616150_551969\"]")
	  private WebElement Click_on_the_Arrow;

	  @FindBy(xpath = "//div[@class=\"videoplayer_share_actions\"]/div[2]")
	  private WebElement Click_on_the_Cross_icon;

	  public Section_Video  Write_Email() {
			Write_Email.sendKeys("igor.h8k@gmail.com");
			return this;
	  }

	  public Section_Video Click_enter() {
			Click_enter.click();
			return this;
	  }

	  public Section_Video Write_Password() {
			Write_Password.sendKeys("Ig0R844!2#");
			return this;
	  }

	  public Section_Video Click_continue() {
			Click_continue.click();
			return this;
	  }

	  public Section_Video Click_in_the_section_Video() {
			Click_in_the_section_Video.click();
			return this;
	  }

	  public Section_Video Click_on_video(){
			Click_on_video.click();
			return this;
	  }

	  public Section_Video Click_on_the_button_Open_video_in_full_screen(){
			Click_on_the_button_Open_video_in_full_screen.click();
			return this;
	  }

	  public Section_Video Click_on_the_Like_icon(){
			Click_on_the_Like_icon.click();
			return this;
	  }

	  public Section_Video Click_on_the_Save_to_bookmarks_icon(){
			Click_on_the_Save_to_bookmarks_icon.click();
			return this;
	  }

	  public Section_Video Click_on_the_Add_to_me_icon(){
			Click_on_the_Add_to_me_icon.click();
			return this;
	  }

	  public Section_Video Click_on_the_Expand_button(){
			Click_on_the_Expand_button.click();
			return this;
	  }

	  public Section_Video Click_on_the_Like_button(){
			Click_on_the_Like_button.click();
			return this;
	  }

	  public Section_Video Entering_text_in_the_text_input_field(){
			Entering_text_in_the_text_input_field.click();
			return this;
	  }

	  public Section_Video Click_on_the_Arrow(){
			Click_on_the_Arrow.click();
			return this;
	  }

	  public Section_Video Click_on_the_Cross_icon(){
			Click_on_the_Cross_icon.click();
			return this;
	  }
}

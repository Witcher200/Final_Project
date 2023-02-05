package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Section_Clips extends AbstractPage{

	  public WebDriver driver;

	  public Section_Clips(WebDriver driver) {
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

	  @FindBy(xpath = "//div[@id=\"side_bar\"]/div/nav/ol/li[10]/a")
	  private WebElement Click_to_Clips_section;

	  @FindBy(xpath = "//button[@class=\"flat_button button_small ShortVideoPost__subscribe\"]")
	  private WebElement Click_on_the_Subscribe_button;

	  @FindBy(xpath = "//div[@class=\"like_btns\"]/div/span[1]")
	  private WebElement Click_on_the_Heart_icon;

	  @FindBy(xpath = "//div[@class=\"like_btns\"]/div[2]/span")
	  private WebElement Click_on_the_comment_icon;

	  @FindBy(xpath = "//div[@class=\"reply_form\"]/div/div/div[2]")
	  private WebElement Click_on_the_field_Write_a_comment;

	  @FindBy(xpath = "//button[@class=\"FlatButton FlatButton--primary FlatButton--size-m addpost_button\"]")
	  private WebElement Click_on_the_Submit_button;

	  @FindBy(xpath = "//div[@class=\"VerticalVideoLayerInfo__topControlsWrap\"]/div/div/div[1]")
	  private WebElement Click_on_the_Cross_icon;

	  public Section_Clips Write_Email() {
			Write_Email.sendKeys("igor.h8k@gmail.com");
			return this;
	  }

	  public Section_Clips Click_enter() {
			Click_enter.click();
			return this;
	  }

	  public Section_Clips Write_Password() {
			Write_Password.sendKeys("Ig0R844!2#");
			return this;
	  }

	  public Section_Clips Click_continue() {
			Click_continue.click();
			return this;
	  }


	  public Section_Clips Click_to_Clips_section() {
			Click_to_Clips_section.click();
			return this;
	  }

	  public Section_Clips Click_on_the_Subscribe_button() {
			Click_on_the_Subscribe_button.click();
			return this;
	  }

	  public Section_Clips Click_on_the_Heart_icon() {
			Click_on_the_Heart_icon.click();
			return this;
	  }

	  public Section_Clips Click_on_the_comment_icon() {
			Click_on_the_comment_icon.click();
			return this;
	  }

	  public Section_Clips Click_on_the_field_Write_a_comment() {
			Click_on_the_field_Write_a_comment.click();
			return this;
	  }

	  public Section_Clips Click_on_the_Submit_button() {
			Click_on_the_Submit_button.click();
			return this;
	  }

	  public Section_Clips Click_on_the_Cross_icon() {
			Click_on_the_Cross_icon.click();
			return this;
	  }
}

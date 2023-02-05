package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Community_Section extends AbstractPage{

	  public WebDriver driver;

	  public Community_Section(WebDriver driver) {
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

	  @FindBy(xpath = "//div[@id=\"side_bar_inner\"]/nav/ol/li[6]/a/span[1]")
	  private WebElement Click_in_the_section_Communities;

	  @FindBy(xpath = "//div[@class=\"page_block\"]/div/div/div/div/form/input")
	  private WebElement Click_in_the_field_Search_community;

	  @FindBy(xpath = "//div[@class=\"page_block\"]/div/div/div/button")
	  private WebElement Click_on_the_icon_Lupa;

	  @FindBy(xpath = "//div[@id=\"gl_groups26480817\"]/div[3]/div/a")
	  private WebElement Click_on_community;

	  public Community_Section Write_Email() {
			Write_Email.sendKeys("igor.h8k@gmail.com");
			return this;
	  }

	  public Community_Section Click_enter() {
			Click_enter.click();
			return this;
	  }

	  public Community_Section Write_Password() {
			Write_Password.sendKeys("Ig0R844!2#");
			return this;
	  }

	  public Community_Section Click_continue() {
			Click_continue.click();
			return this;
	  }

	  public Community_Section Click_in_the_section_Communities() {
			Click_in_the_section_Communities.click();
			return this;
	  }

	  public Community_Section Click_in_the_field_Search_community() {
			Click_in_the_field_Search_community.click();
			return this;
	  }

	  public Community_Section Click_on_the_icon_Lupa() {
			Click_on_the_icon_Lupa.click();
			return this;
	  }

	  public Community_Section Click_on_community() {
			Click_on_community.click();
			return this;
	  }
}

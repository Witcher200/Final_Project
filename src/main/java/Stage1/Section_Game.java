package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Section_Game extends AbstractPage{

	  public WebDriver driver;

	  public Section_Game(WebDriver driver) {
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

	  @FindBy(xpath = "//div[@id=\"side_bar_inner\"]/nav/ol/li[11]/a")
	  private WebElement Click_to_the_Game_section;

	  @FindBy(xpath = "//div[@id=\"wrap3\"]/div/div/div[2]/div/div/div[2]/h2/a/div[2]")
	  private WebElement Click_on_the_ShowAll_button;

	  @FindBy(xpath = "//div[text()=\"Отряд Сакура\"]")
	  private WebElement Click_on_game;

	  public Section_Game Write_Email() {
			Write_Email.sendKeys("igor.h8k@gmail.com");
			return this;
	  }

	  public Section_Game Click_enter() {
			Click_enter.click();
			return this;
	  }

	  public Section_Game Write_Password() {
			Write_Password.sendKeys("Ig0R844!2#");
			return this;
	  }

	  public Section_Game Click_continue() {
			Click_continue.click();
			return this;
	  }

	  public Section_Game Click_to_the_Game_section() {
			Click_to_the_Game_section.click();
			return  this;
	  }

	  public Section_Game Click_on_the_ShowAll_button() {
			Click_on_the_ShowAll_button.click();
			return this;
	  }

	  public Section_Game Click_on_game() {
			Click_on_game.click();
			return this;
	  }
}

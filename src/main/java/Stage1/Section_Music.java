package Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Section_Music extends AbstractPage{

	  public WebDriver driver;

	  public Section_Music(WebDriver driver) {
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

	  @FindBy(xpath = "//div[@id=\"side_bar\"]/div/nav/ol/li[8]/a")
	  private WebElement Click_in_the_section_Music;

	  @FindBy(xpath = "//div[@id=\"content\"]/div/div[3]/div/h2/ul/li[3]/a")
	  private WebElement Click_on_the_Overview_subsection;

	  @FindBy(xpath = "//div[@class=\"audio_row__cover_back _audio_row__cover_back\"]")
	  private WebElement Click_to_music_in_the_New_section;

	  @FindBy(xpath = "//div[@class=\"audio_search_wrapper audio_search_wrapper_new\"]/div/div/div/form/input")
	  private WebElement Click_in_the_Search_of_music_field;

	  public Section_Music Write_Email() {
			Write_Email.sendKeys("igor.h8k@gmail.com");
			return this;
	  }

	  public Section_Music Click_enter() {
			Click_enter.click();
			return this;
	  }

	  public Section_Music Write_Password() {
			Write_Password.sendKeys("Ig0R844!2#");
			return this;
	  }

	  public Section_Music Click_continue() {
			Click_continue.click();
			return this;
	  }

	  public Section_Music Click_in_the_section_Music() {
			Click_in_the_section_Music.click();
			return this;
	  }

	  public Section_Music Click_on_the_Overview_subsection() {
			Click_on_the_Overview_subsection.click();
			return this;
	  }

	  public Section_Music Click_to_music_in_the_New_section() {
			Click_to_music_in_the_New_section.click();
			return this;
	  }

	  public Section_Music Click_in_the_Search_of_music_field() {
			Click_in_the_Search_of_music_field.sendKeys("Дискотека Авария");
			return this;
	  }
}

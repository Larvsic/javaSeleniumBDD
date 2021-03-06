package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Class used for elements and actions in the LandingPage 
 */

public class LandingPage {
	public WebDriver ldriver;
	
	//constructor to initialize driver
	public LandingPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Elements locators
	@FindBy(id="shellmenu_1") //Office
	WebElement buttonOffice;
	
	@FindBy(id= "shellmenu_2") //Office
	WebElement buttonWindows;
	
	@FindBy(id= "shellmenu_3") //Office
	WebElement buttonSurface;
	
	@FindBy(id= "shellmenu_4") //Office
	WebElement buttonXbox;
	
	@FindBy(id= "shellmenu_5") //Office
	WebElement buttonDeals;
	
	@FindBy(id= "l1_support") //Office
	WebElement buttonSupport;
	
	@FindBy(id= "search") //Office
	WebElement buttonSearch;
	
	@FindBy(id= "cli_shellHeaderSearchInput") //Office
	WebElement txtFieldSearch;
	
	@FindBy(id= "R1MarketRedirect-submit") //Office
	WebElement buttonMexico;
	
	@FindBy(id= "c-shellmenu_54") //Office
	WebElement buttonWindows10;
	
	@FindBy(xpath= "/html/body/div[2]/section/div[1]/div[1]/div[3]/div/div/ul/li[1]/div/a/div[1]") //Office
	WebElement firstDiv;
	
	
	// Action Methods used in this page
	public void verifyMenu() {
		buttonOffice.isDisplayed();
		buttonWindows.isDisplayed();
		buttonSurface.isDisplayed();
		buttonXbox.isDisplayed();
		buttonDeals.isDisplayed();
		buttonSupport.isDisplayed();
	}
	
	public void clickSearch() {
		buttonSearch.click();
	}
	
	public void clickWindows() {
		buttonWindows.click();
	}
	
	public void clickWindows10() {
		buttonWindows10.click();
	}
	
	public void search(String visual) {
		txtFieldSearch.clear();
		txtFieldSearch.sendKeys(visual);
	}
	
	public void clickMexico() {
		buttonMexico.click();
	}
	
	public void getDropDownList() {
		buttonMexico.click();
	}
	
	public void firstDiv() {
		firstDiv.click();
	}
	
	@FindBy(xpath= "//*[@class='c-price']/span/span[@itemprop='price'[1]")
	WebElement priceCatalog;
	
	
	
}

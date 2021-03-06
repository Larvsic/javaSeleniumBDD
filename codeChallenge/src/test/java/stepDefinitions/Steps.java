package stepDefinitions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.*;

import pageObjects.LandingPage;
import pageObjects.VisualStudioPage;
import pageObjects.WindowsPage;
import org.junit.Assert;

public class Steps {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public VisualStudioPage visualStudioPage;
	public WindowsPage windowsPage;
	
	public String priceFirst;
	
	
	/**
	 * This class is used for support all the steps (Given, When ,Then) used in the Feature file with gherkin - natural languaje for business purposes.
	 * @throws InterruptedException
	 */
	
	@Given("I open Chrome")
	public void i_launch() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    landingPage = new LandingPage(driver);
	    visualStudioPage = new VisualStudioPage(driver);
	    windowsPage = new WindowsPage(driver);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
	
	@Given("^I launch \"(.*?)\"$")
	public void navigates_url(String url) throws InterruptedException {
	    driver.get(url);
	    Thread.sleep(3000);
	}

	@Then("User validate all menu items are present")
	public void user_validate_all_menu_items_are_present() {
		try {
			landingPage.verifyMenu();
		}catch(Exception e)
		{
			Assert.assertTrue(false);
		}
	}

	@When("User go to Windows")
	public void user_go_to_windows() {
		landingPage.clickWindows();
	}

	@When("User click on Windows 10 Menu and print values")
	public void user_click_on_windows_menu() throws InterruptedException {
		landingPage.clickWindows10();
		Thread.sleep(3000);
		List<WebElement> listOfElementsWindows = driver.findElements(By.xpath("//*[@class='js-nav-menu single-link']/a"));
		Iterator<WebElement> elementsWindows = listOfElementsWindows.iterator();
		while(elementsWindows.hasNext()) {
		    System.out.println("Windows10 Elements from Dropdown : "+ elementsWindows.next().getText());
		}
		
	}

	@When("User go to Search next to the shopping cart")
	public void user_go_to_search_next_to_the_shopping_cart() {
	    landingPage.clickSearch();
	}

	@Then("User search for \"(.*?)\"$")
	public void user_search_for(String visual) throws InterruptedException {
	   landingPage.search(visual);
	   landingPage.clickSearch();
	   Thread.sleep(3000);
	   landingPage.clickMexico();
	}

	@Then("Click on the first one to go to the details page and Validate prices")
	public void click_on_the_first_one_to_go_to_the_details_page() throws InterruptedException {
		visualStudioPage.priceVisualFirst();
		List<WebElement> listOfElements = driver.findElements(By.xpath("//*[@class=\"c-price\"]/span/span[@itemprop=\"price\"]"));
		Iterator<WebElement> itr = listOfElements.iterator();
		while(itr.hasNext()) {
		    System.out.println("Prices printed : "+ itr.next().getText());
		}
		windowsPage.visualStudioClick();
		Thread.sleep(3000);
		visualStudioPage.cancelPopup();
		visualStudioPage.priceVisualSelect();
		visualStudioPage.validateSamePrices();

	}

	@When("Click Add To Cart")
	public void click_add_to_cart() throws InterruptedException {
	    visualStudioPage.addToCart();
		Thread.sleep(3000);
	}

	@Then("Verify all 3 price amounts are the same")
	public void verify_all_price_amounts_are_the_same() {
	    visualStudioPage.validate3prices();
	}
	
	@Then("Select 20 items")
	public void selectItems() throws InterruptedException {
		visualStudioPage.dropDown20();
	    
	}
	
	@Then("Validate new amount of price")
	public void validateAmount() throws InterruptedException {
		visualStudioPage.ValidateNewTotal();
		Thread.sleep(5000);
	    
	}
	
	@Then("Close browser")
	public void closingBrowser() {
		driver.quit();
	    
	}

}

package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowsPage {
	/*
	 * Class used for elements and actions in the Windows Page
	 */
	
	public WebDriver ldriver;
	
	//constructor to initialize driver
	public WindowsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id= "ProductPrice_productPrice_PriceContainer-0")
	WebElement priceVisual;
	
	@FindBy(xpath= "//*[@id=\"email-newsletter-dialog\"]/div[3]/div[1]")
	WebElement cancelPopup;
	
	@FindBy(xpath= "//div[@class='c-channel-placement-image'][1]")
	WebElement visualStudio;
	
	public void priceVisual() {
		priceVisual.getText();
	}
	
	public void cancelPopup() {
		cancelPopup.click();
	}
	
	public void visualStudioClick() {
		if (visualStudio.isDisplayed()){
			visualStudio.click();
		
		}else{
         System.out.println("Visual Studio is not displayed");
     }
	}
	
	
}



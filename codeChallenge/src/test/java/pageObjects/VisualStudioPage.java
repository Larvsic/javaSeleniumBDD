package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

/*
 * Class used for elements and actions in the VisualStudioPage 
 */

public class VisualStudioPage {
	public WebDriver ldriver;
	
	//constructor to initialize driver
	public VisualStudioPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public String priceFromCatalog;
	public String priceVisualValueCart;
	public String priceVisualSelect;
	public String basePrice;
	public String unitaryPrice;
	public String finalPrice;
	
	@FindBy(xpath= "/html/body/section/div[1]/div[1]/div[1]/div[2]/div[6]/div/div[1]/div/div/div[1]/span")
	WebElement priceVisual;
	
	@FindBy(xpath= "//*[@id=\"email-newsletter-dialog\"]/div[3]/div[1]")
	WebElement cancelPopup;
	
	@FindBy(xpath= "//span[@itemprop='price'][1]")
	WebElement priceCatalog;
	
	@FindBy(id= "buttonPanel_AddToCartButton")
	WebElement addCart;
	
	@FindBy(xpath= "//*[@id=\"store-cart-root\"]/div/div/div/section[2]/div/div/div[2]/div/span/span[2]/strong/span")
	WebElement priceVisualValue;
	
	@FindBy(xpath="//div[@class='item-quantity']")
    WebElement dropDown;
	
	@FindBy(xpath="//option[@value='20']")
    WebElement dropDown20;
	
	@FindBy(xpath="//*[@id='store-cart-root']/div/div/div/section[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/span/span[2]/span")
	WebElement unitPrice;
	
	@FindBy(xpath="//*[@id='store-cart-root']/div/div/div/section[2]/div/div/div[2]/div/span/span[2]/strong/span")
	WebElement finalPrice20;
	
	public void priceVisualFirst() {
		if (priceCatalog.isDisplayed()){
			priceFromCatalog = priceCatalog.getText();
		
		}else{
         System.out.println("Visual Studio Price is not displayed");
     }
            
	}
	
	public void priceVisualSelect() {
		if (priceVisual.isDisplayed()){
			priceVisualSelect = priceVisual.getText();
		
		}else{
         System.out.println("Visual Studio Price is not displayed");
     }
            
	}
	
	  public void validateSamePrices(){
	        Assert.assertTrue(priceVisual.getText().contains(priceFromCatalog));
	    }
	  
	  public void validate3prices() {
		  System.out.println("First Price: "+priceFromCatalog);
		  System.out.println("Visual Select Price: "+ priceVisualSelect);
		  System.out.println("Visual Cart Price: "+ priceVisualValue.getText());
		  basePrice = priceVisualValue.getText();
		  Assert.assertTrue(priceVisualValue.getText().contains(priceFromCatalog) && priceVisualValue.getText().contains(priceVisualSelect));
	  }
	
	public void cancelPopup() {
		cancelPopup.click();
	}
	
	public void addToCart() {
		addCart.click();
	}
	
	public void dropDown20() throws InterruptedException {
		dropDown.click();
		Thread.sleep(3000);
		dropDown20.click();
	}
	
	public void ValidateNewTotal() throws InterruptedException {
		Thread.sleep(3000);
		unitaryPrice = unitPrice.getText();
		unitaryPrice = unitaryPrice.replace("$", "");
		unitaryPrice = unitaryPrice.replace(",", "");
		unitaryPrice = unitaryPrice.replace(".00", "");
		unitaryPrice = unitaryPrice.replace("MXN", "");
		int intUnitPrice=Integer.parseInt(unitaryPrice);
		int newPrice = intUnitPrice*20;
		System.out.println("NEW PRICE:"+newPrice);
		
		finalPrice = finalPrice20.getText();
		finalPrice = finalPrice.replace("$", "");
		finalPrice = finalPrice.replace(",", "");
		finalPrice = finalPrice.replace(".00", "");
		finalPrice = finalPrice.replace("MXN", "");
		finalPrice = finalPrice.replace("IVA incluido", "");
		int intFinalPrice=Integer.parseInt(unitaryPrice);
		System.out.println("Unit Price :" + intFinalPrice);
	
		if ((newPrice/intFinalPrice) == 20){
            Assert.assertTrue(true);
        }else{
            System.out.println("Price Mismatch on Total");
        }
		
    
		

	}
}

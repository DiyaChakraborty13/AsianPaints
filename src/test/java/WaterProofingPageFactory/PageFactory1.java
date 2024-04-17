package WaterProofingPageFactory;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactory1 {
	
WebDriver driver;
	
	public PageFactory1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//li[@class=\"nav-item\"][3]")
	@FindBy(xpath="//a[@data-target=\"#WATERPROOFING\"]/span[1]")
	WebElement waterproofing;
	
   @FindBy(id="enquire-name")
	WebElement name;
	
	@FindBy(id="enquire-mobile")
	WebElement mobilenumber;
	
	@FindBy(id="enquire-pincode")
	WebElement pincode;
	
	@FindBy(id="enquire-email")
	WebElement email;

	@FindBy(xpath="//button[@class=\"ctaText enquireForm--step-1-submit track_form_submit animated-arrow-btn yellow-gradient\"]")
	
    WebElement sitevisit;
	
	@FindBy(xpath="//div[@class=\"thank-you-left-content\"]//h2")
	WebElement text;
	
	public void waterproofingclick()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].click();", waterproofing);        
		
	}
	
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
	}
	public void SwitchToWaterProofing() {
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);

		    }
		}
	}
	
	public void typedata(String Name, String Mobilenumber, String Pincode, String Email) throws InterruptedException {
		name.sendKeys(Name);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(mobilenumber));
		mobilenumber.sendKeys(Mobilenumber);
		Thread.sleep(1000);
		pincode.sendKeys(Pincode);
		Thread.sleep(1000);
		email.sendKeys(Email);
	}
	public void bookFreeSiteVisit() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", sitevisit);        
		
	}
    
	public String text() throws InterruptedException {
	Thread.sleep(5000);
	return text.getText();
	}
}




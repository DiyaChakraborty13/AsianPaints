package WaterProofingPageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactory4 {

WebDriver driver;
	
	public PageFactory4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-target=\"#WATERPROOFING\"]/span[1]")
	WebElement waterproofing;
	
	@FindBy(xpath="//a[@href=\"https://www.asianpaints.com/products/waterproofing-solutions/terrace-and-tanks.html\"]")
	WebElement TerraceTanks;
	
	@FindBy(xpath="(//div[@class=\"leftAlign\"]//a)[2]")
	WebElement calculatenow;
	
	@FindBy(xpath="(//div[@class=\"hobbies-icon\"]//img)[1]")
	WebElement yoursurface;
	
	@FindBy(xpath="//input[@value=\"Fresh Painting\"]")
	WebElement yourtypeofproject;
	
	@FindBy(xpath="//input[@id=\"area\"]")
	WebElement area;
	
	@FindBy(xpath="//div[@class=\"cta animated-btn-white round-corner-radius-button waterproofing\"]")
	WebElement calculate;
	
	@FindBy(xpath="(//input[@id=\"enquire-name\"])[1]")
	WebElement name;
	
	@FindBy(xpath="(//input[@id=\"enquire-email\"])[1]")
	WebElement email;
	
	@FindBy(xpath="(//input[@id=\"enquire-mobile\"])[1]")
	WebElement mobileno;
	
	@FindBy(xpath="(//input[@id=\"enquire-pincode\"])[1]")
	WebElement pincode;
	
	@FindBy(xpath="//button[@class=\"ctaText track_form_submit animated-arrow-btn yellow-gradient\"]")
	WebElement estimate;
	
	@FindBy(xpath="//div[@class=\"info-section-wraper\"]//h2")
	WebElement text;
	
	public void hover() {
		Actions act=new Actions(driver);
		act.moveToElement(waterproofing).build().perform();
	}

	public void TerraceTanksclick()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].click();",TerraceTanks);        
		
	}
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1700)");
}
	public void calculatenowclick()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",calculatenow);	}
	
	public void yoursurfaceclick()
	{
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",yoursurface);
	}
	public void yourtypeofprojectclick()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",yourtypeofproject);
	}
	public void details(String Area) {
		area.sendKeys(Area);
	}
	public void calculateNow()
	{
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",calculate);	}
	
	public void form(String Name, String Email, String Mobileno, String Pincode) throws InterruptedException {
		Thread.sleep(1000);
		name.sendKeys(Name);
		email.sendKeys(Email);
		mobileno.sendKeys(Mobileno);
		pincode.sendKeys(Pincode);
	}
	public void getEstimate()
	{
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",estimate);
	}
	public String text() throws InterruptedException {
		Thread.sleep(7000);
	    return text.getText();
	}
}

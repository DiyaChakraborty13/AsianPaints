package WaterProofingPageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory5 {
 
WebDriver driver;
	
	public PageFactory5(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-target=\"#WATERPROOFING\"]/span[1]")
	WebElement waterproofing;
	
	@FindBy(xpath="//a[@href=\"https://www.asianpaints.com/products/waterproofing-solutions/terrace-and-tanks.html\"]")
	WebElement TerraceTanks;
	
	@FindBy(xpath="(//div[@class=\"image-container\"])[8]")
	WebElement Product;
	
	@FindBy(xpath="(//a[@class=\"ctaText\"])[2]")
	WebElement sheet;
	
	@FindBy(xpath="//div[@class=\"shotTitle title\"]//h2")
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
	public void SmartCareTerraceTilePrimer()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].click();",Product);        
		
	}
	public void Informationsheet()
	{
		
		sheet.click();
	}
	public String text() {
	return text.getText();
	}
}

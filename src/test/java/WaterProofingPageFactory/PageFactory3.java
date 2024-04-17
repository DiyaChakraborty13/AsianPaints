package WaterProofingPageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory3 {

WebDriver driver;
	
	public PageFactory3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-target=\"#WATERPROOFING\"]/span[1]")
	WebElement waterproofing;
	
	@FindBy(xpath="//a[@href=\"https://www.asianpaints.com/products/waterproofing-solutions/bathrooms.html\"]")
	WebElement bathrooms;
	
	@FindBy(xpath="//span[@class=\"label-name\"]")
	WebElement filters;
	
	public void hover() {
		Actions act=new Actions(driver);
		act.moveToElement(waterproofing).build().perform();
	}

	public void bathroomsclick()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].click();", bathrooms);        
		
	}
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,400)");
}
	public void filtersclick()
	{
		
	 filters.click();
	}
	
}

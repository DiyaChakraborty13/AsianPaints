package Step_Definition;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import DriverSetup.SetupDriver;
import WaterProofingPageFactory.PageFactory1;
import WaterProofingPageFactory.PageFactory2;
import WaterProofingPageFactory.PageFactory3;
import WaterProofingPageFactory.PageFactory4;
import WaterProofingPageFactory.PageFactory5;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaterProofingSteps {

	static WebDriver driver;
	PageFactory1 page;
    PageFactory2 page1;
	PageFactory3 page2;
	PageFactory4 page3;
	PageFactory5 page4;
	@Given("User is on homepage of Asian Paints")
	public void user_is_on_homepage_of_asian_paints() {
		driver = SetupDriver.chromedriver();
		page = new PageFactory1(driver);
		page1 = new PageFactory2(driver);
		page2 = new PageFactory3(driver);
		page3 = new PageFactory4(driver);
		page4 = new PageFactory5(driver);
	}

	@When("Click on Waterproofing")
	public void click_on_waterproofing()  {
	page.waterproofingclick();
	page.SwitchToWaterProofing();
	}

	@And("user scroll downward")
	public void user_scroll_downward() throws InterruptedException {
	Thread.sleep(1000);
	page.scroll();
	}

	@And("^user enters (.*),(.*),(.*) and (.*)$")
	public void user_enters_and(String Name, String MobileNumber, String PINcode, String Email) throws InterruptedException {
    page.typedata(Name, MobileNumber, PINcode, Email);
    }

	@And("Click on Book Free Site Visit")
	public void click_on_book_free_site_visit() {
		page.bookFreeSiteVisit();
	}

	@Then("it should schedule a visit by an expert")
	public void it_should_schedule_a_visit_by_an_expert() throws InterruptedException{
		String Title="Thank you!";
		String verifyTitle=page.text();
	    Assert.assertEquals(Title, verifyTitle);
	}
	



//=============================Scenario2===================================================================

@When("Click on Waterproofing1")
public void click_on_waterproofing1() {
    page1.waterproofingclick();
    page1.SwitchToWaterProofing();
}

@And("user scroll downward1")
public void user_scroll_downward1() {
	page1.scroll();
}
@And("^user enters details(.*),(.*),(.*) and (.*)$")
public void user_enters_details (String Name, String MobileNumber , String PINcode, String Email ) throws InterruptedException {
	 page1.typedata(Name, MobileNumber, PINcode, Email);
}
@And("Click on Book Free Site Visit1")
public void click_on_book_free_site_visit1() {
	page1.bookFreeSiteVisit();
}

@Then("it give an error message")
public void it_give_an_error_message() throws InterruptedException {
	String Title="Email is invalid";
	String verifyTitle=page.text();
    Assert.assertEquals(Title, verifyTitle);
}




//=================================Scenario3=====================================================
	

@When("User hover on Waterproofing and Click on Bathroom option")
public void user_hover_on_waterproofing_and_click_on_bathroom_option() {
	page2.hover();
	page2.bathroomsclick();
}
@When("User scroll downward2")
public void user_scroll_downward2() {
    page2.scroll();
}
@And("User click on Filters option")
public void user_click_on_filters_option() {
   page2.filtersclick();
}

@Then("it should show products as per the preferable filters")
public void it_should_show_products_as_per_the_preferable_filters() {
 Assert.assertEquals("https://www.asianpaints.com/products/waterproofing-solutions/bathrooms.html?f=problem%3Arepair", driver.getCurrentUrl());

	
}
//==========================================Scenario4=====================================================
	@When("User hover on Waterproofing and Click on Terrace & Tanks option")
	public void user_hover_on_waterproofing_and_click_on_terrace_tanks_option() {
		page3.hover();
		page3.TerraceTanksclick();
	   
	}
	@And("User scroll downward3")
	public void user_scroll_downward3() {
	    page3.scroll();
	}

   @And("Click on Calculate Now for Home Waterproofing Expenses option")
	public void click_on_calculate_now_for_home_waterproofing_expenses_option() {
	    page3.calculatenowclick();
	}

	@And("User select your surface, your type of project")
	public void user_select_your_surface_your_type_of_project() {
	   page3.yoursurfaceclick();
	   page3.yourtypeofprojectclick();
	}

	@And("User enter SQFT Area")
	public void user_enter_sqft_area(DataTable dataTable) {
		List<List<String>> cells = dataTable.cells();
		page3.details(cells.get(0).get(0));
	}


	@And("Click on Calculate Now for WaterProofing Calculator")
	public void click_on_calculate_now_for_water_proofing_calculator() {
	  page3.calculateNow();
	  
	}

	@And("User enters Name, Email, MobileNumber, PINCode")
	public void user_enters_name_email_mobile_number_pin_code(DataTable dataTable1) throws InterruptedException {
	   List<List<String>> cells = dataTable1.cells();
	   page3.form(cells.get(0).get(0), cells.get(0).get(1), cells.get(0).get(2), cells.get(0).get(3));
	}


	@And("Click on Get an estimate option")
	public void click_on_get_an_estimate_option() {
	    page3.getEstimate();
	}

	@Then("it should show expert recommendation")
	public void it_should_show_expert_recommendation() throws InterruptedException {
		String Title="Our expert recommendation";
		String verifyTitle=page3.text();
	    Assert.assertEquals(Title, verifyTitle);
	}
	
//===================================Scenario5======================================================
	@When("User hover on Waterproofing and Click on Terrace & Tanks")
	public void user_hover_on_waterproofing_and_click_on_terrace_tanks() {
		page4.hover();
    	page4.TerraceTanksclick();
	}

	@When("User click on SmartCare Terrace Tile Primer product")
	public void user_click_on_smart_care_terrace_tile_primer_product() {
	    page4.SmartCareTerraceTilePrimer();
	}

	@When("User click on Product Information Sheet to download")
	public void user_click_on_product_information_sheet_to_download() {
	    page4.Informationsheet();
	}

	@Then("It should download the sheet")
	public void it_should_download_the_sheet() {
		String Title="";
	    String verifyTitle=page4.text();
	    Assert.assertEquals(Title, verifyTitle);
	}

	@AfterStep
    public static void takeScreendown(Scenario scenerio) {
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		 scenerio.attach(src, "image/png",scenerio.getName());
	}
	}

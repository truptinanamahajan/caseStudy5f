package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver driver;
	@Given("user open application newtours.demoaut.com")
	public void user_open_application_newtours_demoaut_com() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
	}

	@When("User clicks on registration")
	public void user_clicks_on_registration() {
		//Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.partialLinkText("REGISTER"))).click().perform();
		//driver.findElement(By.xpath("a[mercuryregister.php?osCsid=f19b65e4d52379b17086c780dd751ea1]"));
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@Then("User validates registration page")
	public void user_validates_registration_page() {
		//Assert.assertTrue(driver.getTitle().contains("Register"));
	}

	@When("User enter firstname")
	public void user_enter_firstname() {
	//WebElement wb = driver.findElement(By.name("firstName"));
	//wb.sendKeys("Trupti");	
	//System.out.println("User fname get printed");
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Trupti");
	
	}

	@When("User enter lastname")
	public void user_enter_lastname() {
		driver.findElement(By.name("lastName")).sendKeys("Mahajan");
	}

	@When("User enter password")
	public void user_enter_password() {
		driver.findElement(By.name("password")).sendKeys("Trupti");
	}

	@When("User enter confirm password")
	public void user_enter_confirm_password() {
		driver.findElement(By.name("confirmPassword")).sendKeys("Trupti");

	}

	@When("user click on Register button")
	public void user_click_on_Register_button() {
	}

	@Then("User validates Registration success")
	public void user_validates_Registration_success() {
	}

}

package STEPS01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NationalitiesSD {
	
	
	WebDriver driver;
	  
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		 driver=new ChromeDriver();
		  driver.manage().window().maximize();
	}
		  
	@When("User opens URL {string}")	  public void user_opens_url(String TestURL) {
				
			  driver.get(TestURL);
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	  
	   
	}
	
	
	
	
	@Then("Log in to Website with below credentials.")
	public void log_in_to_website_with_below_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	  
		String username1=dataTable.cell(0, 0);
		String password1=dataTable.cell(0, 1);
		
		 driver.findElement(By.name("username")).sendKeys(username1);
		 driver.findElement(By.name("password")).sendKeys(password1);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 
		
	}
	@Then("Create Nationality records")
	public void create_nationality_records(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	  
	List<List<String>> JobsData=dataTable.cells();
		
		for(int i=0;i<JobsData.size();i++) {  //0<3,1<3,2<3,3<3
			
			String NationalityText=JobsData.get(i).get(0); 
	
			  driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
			  driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
			  driver.findElement(By.xpath("//button[text()=' Add ']")).click();
			
			  driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(NationalityText);
			  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
			
			 Thread.sleep(5000);
		
		
		
		}}}


package STEPS02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sptDef {
	
	WebDriver driver;
	 


@Given("user lanch browser and maximize the page")
public void user_lanch_browser_and_maximize_the_page() {
    
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
}
@When("User opens URL {string}")
public void user_opens_url(String TestURL) { 
	
	driver.get(TestURL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
}
@When("User enters username as {string} and password as {string}")
public void user_enters_username_as_and_password_as(String username, String password) {
	
	 driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	
}
@Then("Go to the admin page")
public void go_to_the_admin_page() {
    
	
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
	
}
@Then("Go to skills page")
public void go_to_skills_page() {
   
	 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
	
	
}
@Then("Add skills with skillname as {string} and skilldescription as {string}")
public void add_skills_with_skillname_as_and_skilldescription_as(String skillName, String skillDecr) {
   
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(skillName);

	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(skillDecr);

	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	
}
@When("User click logout")
public void user_click_logout() {
   
	
	
}
@Then("close the Browser")
public void close_the_browser() {
    
	
	driver.quit();
}

	
	
	
}
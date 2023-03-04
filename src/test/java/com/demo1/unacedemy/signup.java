package com.demo1.unacedemy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws InterruptedException {
	System.out.println("===============================Launching the browser=========================================");
	// Set the system property for the Chrome driver
	System.setProperty("Webdriver.chrome.driver", "‪C:\\drivers\\chromedriver.exe");
	// Initialize the Chrome driver
	// driver = new ChromeDriver()
	driver = new ChromeDriver();
	 driver.get("https://unacademy.com/");
	 Thread.sleep(2000);
	driver.manage().window().maximize();
	}
	
	@After
	public void closingBroswer() {
	// Close the browser
	driver.close();
	System.out.println("===============================Closing the browser=========================================");
}
	
	/*Created by : Dinesh Varma S
	 * Reviewed by:Roopanandh
	 */
	
	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		//System.setProperty("Webdriver.chrome.driver", "‪C:\\drivers\\chromedriver.exe");
		//  driver = new ChromeDriver();
		// driver.get("https://unacademy.com/");
		// Thread.sleep(2000);
		// Initialize a new instance of the WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the website URL
		driver.get("http://www.example.com");

		// Get the current URL of the website
		String currentUrl = driver.getCurrentUrl();

		// Validate the website URL
		if (currentUrl.equals("http://www.example.com")) {
		    System.out.println("Website URL is correct");
		} else {
		    System.out.println("Website URL is incorrect");
		}

		// Close the WebDriver instance
		driver.quit();
		
		
	}
	/*Created by : Dinesh Varma S
	 * Reviewed by:Roopanandh
	 */
	@When("user clicks join for free")
	public void user_clicks_join_for_free() throws InterruptedException {
		 
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[2]/div/button[2]/span")).click();
		
		Thread.sleep(1000);
		
	}
	/*Created by : Dinesh Varma S
	 * Reviewed by:Roopanandh
	 */
	@When("user enters mobile number")
	public void user_enters_mobile_number() throws InterruptedException {
	     //Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your mobile number\"]")).sendKeys("9738325512");
		
		Thread.sleep(3000);
		
	}
	/*Created by : Dinesh Varma S
	 * Reviewed by:Roopanandh
	 */
	@When("user clicks on submit buttom")
	public void user_clicks_on_submit_buttom() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=' css-1uhmx9i-StyledButton e1wp3nh0']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@class=' e52pvpx3 css-1dk3nw2-StyledButton-VerifyButton e1wp3nh0']")).click();
		Thread.sleep(4000);
	
	}
	/*Created by : Dinesh Varma S
	 * Reviewed by:Roopanandh
	 */

	@When("user enters email address")
	public void user_enters_email_address() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@placeholder='Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("varmadinesh");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("dinesh9738325512@gmail.com");
		
		Thread.sleep(4000);
		
	  
	}
	/*Created by : Dinesh Varma S
	 * Reviewed by:Roopanandh
	 */

	@When("user needs to select the state from dropdown menu")
	public void user_needs_to_select_the_state_from_dropdown_menu() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@class='dropdown-button css-1lj5w5g-DropDownButton e1v4hctf0']")).click();
		driver.findElement(By.xpath("//span[text()='Arunachal Pradesh']")).click();
		Thread.sleep(4000);
	}
	/*Created by : Dinesh Varma S
	 * Reviewed by:Roopanandh
	 */
	@When("user clicks on contiune buttom")
	public void user_clicks_on_contiune_buttom() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@class=' e52pvpx3 css-1dk3nw2-StyledButton-VerifyButton e1wp3nh0']")).click();
		Thread.sleep(4000);
	}

	@Then("user is in home page")
	public void user_is_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String data1 = driver.findElement(By.xpath("//div[@class='css-9hlkmq-TabLabel e1qfn6d713']")).getText();
		Assert.assertEquals("Get started",data1);
		
	}

	@Then("user should see an error message indicating the email is already registered")
	public void user_should_see_an_error_message_indicating_the_email_is_already_registered() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should see an error message indicating the mobile no is already registered")
	public void user_should_see_an_error_message_indicating_the_mobile_no_is_already_registered() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should see an error message indicating the opt is invaild")
	public void user_should_see_an_error_message_indicating_the_opt_is_invaild() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

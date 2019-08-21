package mysteppeddefination;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Reports {
	WebDriver driver;
	@Given("User launched the test me app")
	public void user_launched_the_test_me_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	}

	@Then("user logged in with valid credentials")
	public void user_logged_in_with_valid_credentials() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    
	}

	@Then("verifies for login status in his credentials")
	public void verifies_for_login_status_in_his_credentials() {
		String expected="SignOut";
		String actual=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
	Assert.assertEquals(expected, actual);
	driver.close();
	   
	}

}

package CASESTUDY.PracticeOnlineshopping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestmeApp {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
  
  @Test(priority=3)
	public void testCart()
	{
	  
  }
  public void testlogin()
  {
	  
  }
  public void testRegistration() throws Exception
  {
	  Actions a=new Actions(driver);
		driver.findElement(By.linkText("SignUp")).click();
		//System.out.println(str);
		driver.findElement(By.name("userName")).sendKeys("dugguu153");
		
		a.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(2000);
		String Expected=driver.findElement(By.xpath("//*[@id=\"err\"]")).getText();
		String Actual="Available";
		Assert.assertEquals(Expected,Actual);
		

		
		driver.findElement(By.name("firstName")).sendKeys("Johnqq");
		driver.findElement(By.name("lastName")).sendKeys("Harryff");
		driver.findElement(By.name("password")).sendKeys("abcd1223");
		driver.findElement(By.name("confirmPassword")).sendKeys("abcd1223");
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("haarruy@gmail.com");
		driver.findElement(By.name("mobileNumber")).sendKeys("7623876381");
		driver.findElement(By.name("dob")).sendKeys("10/06/2004");
		driver.findElement(By.name("address")).sendKeys("qwe nagpur");
		
		//driver.findElement(By.name("securityQuestion")).sendKeys(Keys.SHIFT,"What is your Pet Name");
		 //a.sendKeys(Keys.TAB).perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]"))).click();
		a.sendKeys(Keys.DOWN).click().perform();
		a.sendKeys(Keys.DOWN).click().perform();
		
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	  
  }
  public void testPayment()
  {
	  
  }
  @AfterMethod
	public void getResultAfterMethod()
	{
	  
	}
  @BeforeTest
	public void startReportBeforeTest()
	{
	  
	}
  
}

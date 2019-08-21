package TestmeApp.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	WebDriver driver;
	public static WebDriver getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
			return new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver","\"C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\geckodriver.exe\\");
			return new FirefoxDriver();
		}else
		{
		return null;
		}
	}

}

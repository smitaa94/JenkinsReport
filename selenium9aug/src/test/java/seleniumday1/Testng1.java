package seleniumday1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng1 {
  
  @BeforeMethod
  public void openApp() {
	  System.out.println("Inside openApp");
  }
  @Test(priority=2)
  public void Register()
  {
	  System.out.println("Registered");
  }
  @Test(priority=3)
  public void Signout()
  {
	  System.out.println("Inside Signout");
  }

}


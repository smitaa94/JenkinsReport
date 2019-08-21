package seleniumday1;

import org.testng.annotations.Test;

public class Testng {
  
  @Test(priority=1)
  public void openApp() {
	  System.out.println("Inside openApp");
  }
  @Test(priority=2)
  public void login()
  {
	  System.out.println("Login");
  }
  @Test(priority=3)
  public void logout()
  {
	  System.out.println("Inside Logout");
  }

}


package LeafTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LeafAction.HomeMethods;
import Utility.BaseClass;

public class HomeTestCases {

	public HomeMethods homemethods;
	
	
	@BeforeSuite
	public void BeforeSuit() {
		BaseClass.startdriver();
		homemethods = new HomeMethods();
		
	}
	
	
	
	
	@Test
	public void Attest() throws InterruptedException {
		
		homemethods.homemethod.Home();
		BaseClass.Sleep();
		homemethods.homemethod.Dashboard();
		BaseClass.Sleep();
		homemethods.homemethod.EmailId("asdf@gmail.com");
		BaseClass.Sleep();
		homemethods.homemethod.Message("hi how re youuuuuuuu");
		homemethods.homemethod.Home1();
		homemethods.homemethod.Auth();
		
		String parentWindow = BaseClass.getParentWindow();
		homemethods.homemethod.BasicAuth();
		
		BaseClass.switchToNewWindow(parentWindow);
		
		
		homemethods.homemethod.HandleBasicAuth();
		
		BaseClass.switchToParentWindow(parentWindow);
		
		
		System.out.println("it's working");
		
	}
	
}

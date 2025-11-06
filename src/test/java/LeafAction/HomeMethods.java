package LeafAction;

import LeafLocators.HomeLocator;
import Utility.BaseClass;

public class HomeMethods {

	public HomeMethod homemethod;
	
	
	public HomeLocator homelocator = new HomeLocator();
	
	
	public HomeMethods() 
	{
		homemethod = new HomeMethod();
	}
	
	public class HomeMethod{
		
		
		public void Home() {
			homelocator.homeloginlocator.Home.click();
		}
		
		public void Dashboard() {
			homelocator.homeloginlocator.Dashboard.click();
		}
		public void EmailId(String EmailId ) {
			homelocator.homeloginlocator.EmailId.sendKeys(EmailId);
		}
		public void Message(String Message ) {
			homelocator.homeloginlocator.Message.sendKeys(Message);
		}
		
		public void Home1() {
			homelocator.homeloginlocator.Home1.click();
		}
		public void Auth() {
			homelocator.homeloginlocator.Auth.click();
		}
		
		public void BasicAuth() {
			homelocator.homeloginlocator.BasicAuth.click();
		}
		
		public void HandleBasicAuth() {
			 BaseClass.driver.get("http://admin:testleaf@leafground.com:8090/login");

		        // Step 5: Optional - verify page loaded
		        System.out.println("Page title after login: " + BaseClass.driver.getTitle());
		        
		        BaseClass.driver.close();
		}
		
		
	}
}

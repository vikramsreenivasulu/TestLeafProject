package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class HomeLocator {

	public HomeloginLocator homeloginlocator;
	
	public  HomeLocator() {
		homeloginlocator = new HomeloginLocator();
	}
	
	
	public class HomeloginLocator{
		public HomeloginLocator() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		
		@FindBy(xpath = "(//a[@href=\"#\"])[4]")
		public WebElement Home;
		
		@FindBy(xpath = "(//a[ contains(@href,'dashboard.xhtml')])[2]")
		public WebElement Dashboard;
		
		@FindBy(xpath = "//input[@placeholder='E-mail Address']")
		public WebElement EmailId;
		
		@FindBy(xpath = "//textarea[@placeholder=\"Write your message...\"]")
		public WebElement Message;
		
		@FindBy(xpath = "(//a[@href=\"#\"])[4]")
		public WebElement Home1;
		
		@FindBy(xpath = "//a[@href='/auth.xhtml']")
		public WebElement Auth;
		
		@FindBy(xpath = "//span[@class='ui-button-text ui-c']")
		public WebElement BasicAuth;
		
		
		  
	}
	
	
}

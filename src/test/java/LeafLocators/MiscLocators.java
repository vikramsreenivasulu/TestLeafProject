package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class MiscLocators {

	public MiscLocator misclocator;
	public Message message;
	
	
	
	public MiscLocators() {
		misclocator = new MiscLocator();
		message = new Message();
	
	}
	
		public class MiscLocator {

		    public MiscLocator() {
		        PageFactory.initElements(BaseClass.driver, this);
		    }

		@FindBy(xpath="(//a[@href='#'])[9]")
		public WebElement ClickMisc;
	}
	
	public class Message{
		
		public Message() {
			 PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="//li[@id='menuform:m_message']//a[1]")
		public WebElement ClickMessage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//end

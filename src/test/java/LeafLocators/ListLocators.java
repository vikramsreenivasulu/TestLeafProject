package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ListLocators {

	public ListLocator listlocator;
	
	public ListLocators() {
		listlocator = new ListLocator();
	}
	
	
	
	
	public class ListLocator{
		
		public ListLocator() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="")
		public WebElement ClickList;
		
		
		
	}//end ListLocator
	
	
}//end ListLocators

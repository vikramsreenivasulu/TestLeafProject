package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ListLocators {

	public ListLocator listlocator;
	public Menu menu;
	
	public ListLocators() {
		listlocator = new ListLocator();
		menu  = new Menu();
	}
	
	
	
	
	public class ListLocator{
		
		public ListLocator() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="(//li[@id='menuform:j_idt42']//a)[1]")
		public WebElement ClickList;
		
		
	}//end ListLocator
	
	public class Menu{
		public Menu() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		@FindBy(xpath="//li[@id='menuform:m_menu']//a[1]")
		public WebElement ClickMenu;
		
		
	}
	
}//end ListLocators

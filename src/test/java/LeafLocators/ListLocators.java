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
		
		public MenuBar menubar;
		public TabMenu tabmenu;
		public Menu() {
			PageFactory.initElements(BaseClass.driver, this);
			menubar = new MenuBar();
			tabmenu = new TabMenu();
		}
		@FindBy(xpath="//li[@id='menuform:m_menu']//a[1]")
		public WebElement ClickMenu;
		
		public class MenuBar{
			
			public MenuBar() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			@FindBy(xpath="(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[1]")
			public WebElement MenuBarCustomers;
			
			@FindBy(xpath="(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[2]")
			public WebElement MenuBarOrders;
			
			@FindBy(xpath="(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[3]")
			public WebElement MenuBarShipments;
			
			@FindBy(xpath="(//ul//li//span[@class='ui-icon ui-icon-triangle-1-s'])[4]")
			public WebElement MenuBarProfile;
			}
		
		
		public class TabMenu {
			
			public TabMenu() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
		@FindBy(xpath="//li//a[@href='/menu.xhtml?i=0']")
		public WebElement TabMenuOverview;
		
		@FindBy(xpath="//li//a[@href='/menu.xhtml?i=1']")
		public WebElement TabMenuMembers;
		
		@FindBy(xpath="//li//a[@href='/menu.xhtml?i=2']")
		public WebElement TabMenuSales;
		
		@FindBy(xpath="//li//a[@href='/menu.xhtml?i=3']")
		public WebElement TabMenuProfile;
		}
		
	}
}//end ListLocators

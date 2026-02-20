package LeafAction;

import org.openqa.selenium.interactions.Actions;

import LeafLocators.ListLocators;
import Utility.BaseClass;

public class ListMethods {

	public ListMethod listmethod;
	
	public Menu menu;
	
	public ListLocators listlocators = new ListLocators(); 
	
	
	public ListMethods() {
		listmethod = new ListMethod();
		menu = new Menu();
	}
	
	
	public class ListMethod{
		
		public void ClickList() {
			listlocators.listlocator.ClickList.click();
		}
	}
	
	public class Menu{
		
		public void ClickMenu() {
			listlocators.menu.ClickMenu.click();
		}
		
		public void MenuBarCustomers() {
			
			listlocators.menu.menubar.MenuBarCustomers.click();
			
		}
		
		public void MenuBarOrders() {
			listlocators.menu.menubar.MenuBarOrders.click();
			
		}
		
		public void MenuBarShipments() {
			listlocators.menu.menubar.MenuBarShipments.click();
		}
		
		public void MenuBarProfile() {
			listlocators.menu.menubar.MenuBarProfile.click();
		}
		
		public void TabMenuOverview() {
			listlocators.menu.tabmenu.TabMenuOverview.click();
		}
		
		public void TabMenuMembers() {
			listlocators.menu.tabmenu.TabMenuMembers.click();
		}
		
		public void TabMenuSales() {
			listlocators.menu.tabmenu.TabMenuSales.click();
		}
		
		public void TabMenuProfile() {
			listlocators.menu.tabmenu.TabMenuProfile.click();
		}
	}//EndMenu

	
	
	
}//endListMethods

package LeafTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LeafAction.ListMethods;
import Utility.BaseClass;

public class ListTestCases {

	public ListMethods listmethods;
	
	@BeforeSuite
	public void BeforeSuite(){
		BaseClass.startdriver();
		listmethods = new ListMethods();
	}
	
	
	
	@Test()
	public void ATTestList() throws InterruptedException {
		
		BaseClass.Sleep();
		listmethods.listmethod.ClickList();
		BaseClass.Sleep();
		listmethods.menu.ClickMenu();
		BaseClass.Sleep();
//		listmethods.menu.menubar.MenuBarCustomers();
//		BaseClass.Sleep();
//		listmethods.menu.menubar.MenuBarOrders();
//		BaseClass.Sleep();
//		listmethods.menu.menubar.MenuBarShipments();
//		BaseClass.Sleep();
//		listmethods.menu.menubar.MenuBarProfile();
//		BaseClass.Sleep();
//		listmethods.menu.tabMenu.TabMenuOverview();
//		BaseClass.Sleep();
//		listmethods.menu.tabMenu.TabMenuMembers();
//		BaseClass.Sleep();
//		listmethods.menu.tabMenu.TabMenuSales();
//		BaseClass.Sleep();
//		listmethods.menu.tabMenu.TabMenuProfile();
		BaseClass.Sleep();
		listmethods.menu.panelmenu.PanelMenuCustomers();
		BaseClass.Sleep();
		listmethods.menu.panelmenu.PanelMenuOrders();
		BaseClass.Sleep();
		listmethods.menu.panelmenu.PanelMenuShipments();
		BaseClass.Sleep();
		listmethods.menu.panelmenu.PanelMenuProfile();
		
		
		
		
		
		
		
		
		
		
	}
}

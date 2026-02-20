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
		listmethods.menu.MenuBarCustomers();
		BaseClass.Sleep();
		BaseClass.Sleep();
		listmethods.menu.MenuBarOrders();
		BaseClass.Sleep();
		listmethods.menu.MenuBarShipments();
		BaseClass.Sleep();
		listmethods.menu.MenuBarProfile();
		BaseClass.Sleep();
		listmethods.menu.TabMenuOverview();
		BaseClass.Sleep();
		listmethods.menu.TabMenuMembers();
		BaseClass.Sleep();
		listmethods.menu.TabMenuSales();
		BaseClass.Sleep();
		listmethods.menu.TabMenuProfile();
	}
}

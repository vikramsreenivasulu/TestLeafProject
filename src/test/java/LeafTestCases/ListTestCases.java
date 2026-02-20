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
	public void ATTestList() {
		listmethods.listmethod.ClickList();
		listmethods.menu.ClickMenu();
	}
}

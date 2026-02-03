package LeafTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LeafAction.MiscMethods;
import Utility.BaseClass;

public class MiscTestClasses {

	public MiscMethods miscmethods;
	
	@BeforeSuite
	public void BeforeSuite() {
		BaseClass.startdriver();
		
		miscmethods = new MiscMethods();
	}
	
	@Test()
	public void AtTest() {
		
	}
}

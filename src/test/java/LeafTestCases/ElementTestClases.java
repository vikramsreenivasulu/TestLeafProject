package LeafTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LeafAction.ElementMethods;
import Utility.BaseClass;

public class ElementTestClases {

public ElementMethods elementmethods;

	
	@BeforeSuite
	public void BeforeSuit() {
		BaseClass.startdriver();
		elementmethods = new ElementMethods();	
	}
	
	
	@Test
	public void Attest() throws InterruptedException {
		
		elementmethods.elementmethod.ClickElement();
		BaseClass.Sleep();
		//testbox
		BaseClass.Sleep();
		elementmethods.textbox.ClickTextBox();
	}
	
	
	
	
	
}

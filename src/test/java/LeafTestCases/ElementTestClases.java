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
		//DropDown
		BaseClass.Sleep();
		elementmethods.dropdown.ClickDropDown();
		BaseClass.Sleep();
		elementmethods.dropdown.UIAuto();
		BaseClass.Sleep();
		elementmethods.dropdown.Country("India");
		BaseClass.Sleep();
		elementmethods.dropdown.City("Chennai");
		BaseClass.Sleep();
		elementmethods.dropdown.Course("Appium");
		BaseClass.Sleep();
		elementmethods.dropdown.Course("AWS");
		BaseClass.Sleep();
		elementmethods.dropdown.Course("JMeter");
		BaseClass.Sleep();
		elementmethods.dropdown.Language("English");
		BaseClass.Sleep();
		elementmethods.dropdown.LanguageChoosen("Two");
		BaseClass.Sleep();
		
	}
	
	
	
	
	
}

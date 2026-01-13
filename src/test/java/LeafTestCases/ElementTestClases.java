package LeafTestCases;

import org.testng.annotations.AfterSuite;
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
	
	
	@Test()
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
		
		BaseClass.TakeScreenshot("Sample");
		BaseClass.Sleep();
	}
	
	

	@Test
	public void WaitsAtTest() throws InterruptedException {
		
		elementmethods.elementmethod.ClickElement();
		BaseClass.Sleep();
		elementmethods.waits.Clickwaits();
		BaseClass.Sleep();
		elementmethods.waits.WaitforVisibility();
		BaseClass.Sleep();
		elementmethods.waits.WaitforClickability();
		BaseClass.Sleep();
		elementmethods.waits.ClickSecondBtn();
		BaseClass.Sleep();
		elementmethods.waits.WaitforInvisibility();
		BaseClass.Sleep();
		elementmethods.waits.WaitforTextChange();
	}
	
	
	@Test()
	public void RadioBttn() throws InterruptedException 
	{
		
		BaseClass.Sleep();
		elementmethods.elementmethod.ClickElement();
		BaseClass.Sleep();
		elementmethods.radiobttns.ClickRadioBttn();
		BaseClass.Sleep();
		elementmethods.radiobttns.ChromeBrowser();
		BaseClass.Sleep();
		elementmethods.radiobttns.defaultBttn();
		BaseClass.Sleep();
		elementmethods.radiobttns.UnSelected();
		BaseClass.Sleep();
		elementmethods.radiobttns.SelectAgeGrp();
	}
	
	
	@Test()
	public void TextBox() throws InterruptedException 
	{
		
		BaseClass.Sleep();
		elementmethods.elementmethod.ClickElement();
		BaseClass.Sleep();
		elementmethods.textbox.Clicktextbox();
		BaseClass.Sleep();
		elementmethods.textbox.TypeName("vikram sreenivas");
		BaseClass.Sleep();
		elementmethods.textbox.ErroMsg();
		BaseClass.Sleep();
		elementmethods.textbox.AppendCity("Banglore");
		BaseClass.Sleep();
		elementmethods.textbox.PositionChanged();
		BaseClass.Sleep();
		elementmethods.textbox.textboxdisabled();
	}
	
	
	@AfterSuite
	public void AfterSuite() {
		BaseClass.stoptdriver();
		
	}
}

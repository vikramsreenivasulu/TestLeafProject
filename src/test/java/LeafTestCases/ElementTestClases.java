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
	public void DropDownAttest() throws InterruptedException {

		elementmethods.elementmethod.ClickElement();
		BaseClass.Sleep();
		// DropDown
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
	public void RadioBttn() throws InterruptedException {

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
	public void TextBox() throws InterruptedException {

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
		BaseClass.Sleep();
		elementmethods.textbox.chooseThirdOpt("v1");
		BaseClass.Sleep();
		elementmethods.textbox.ClearText();
		BaseClass.Sleep();
		elementmethods.textbox.DOBChoosen("10/16/2000");
		BaseClass.Sleep();
		elementmethods.textbox.Retrieve();
		BaseClass.Sleep();
		elementmethods.textbox.SpintheValue("121");
		BaseClass.Sleep();
		elementmethods.textbox.TypeMail("vikramsreenivasulu@gmail.com");
		BaseClass.Sleep();
		elementmethods.textbox.Abouturself("hi this is vikram sreenivas. Iam working as here L1 Support");
		BaseClass.Sleep();
		elementmethods.textbox.SliderMove("34");
		BaseClass.Sleep();
		elementmethods.textbox.KeyBoardAppead();
		BaseClass.Sleep();
		elementmethods.textbox.KeyboardClose();
		BaseClass.Sleep();
		elementmethods.textbox.TextEditor(
				"Fun Ways to Teach Kids About Cricket | Engaging Cricket FactsCricket is a popular bat-and-ball sport played between two  ");
		BaseClass.Sleep();
		elementmethods.textbox.TextEditor("teams of 11 players on a large oval field with a rectangular 22-yard pitch in the center, where a bowler tries to hit a wicket defended by a batsman, with the goal of scoring runs by hitting the ball and running between wickets, with different formats from short T20s to five-day Test matches. Originating in England, it's now a global sport, especially dominant in Commonwealth nations, featuring elements of batting, bowling, fielding, and complex rules.");
		BaseClass.Sleep();
		elementmethods.textbox.Toolbar("wjehfvuwvefuhwbkeufgyqwkurbkhwrferqgtewhtrh");
	}

	@Test()
	public void Button() throws InterruptedException {
		BaseClass.Sleep();
		elementmethods.elementmethod.ClickElement();
		BaseClass.Sleep();
		elementmethods.button.ClickButton();
		BaseClass.Sleep();
		elementmethods.button.Confirmtitle();
		BaseClass.Sleep();
		elementmethods.button.Sendkeys("possible it");
		BaseClass.Sleep();
		elementmethods.elementmethod.ClickElement();
		BaseClass.Sleep();
		elementmethods.button.ClickButton();
		BaseClass.Sleep();
		elementmethods.button.heightWidth();
		BaseClass.Sleep();
		elementmethods.button.disablebutton();
		BaseClass.Sleep();
		elementmethods.button.SuccessHover();
		BaseClass.Sleep();
		elementmethods.button.FindPosition();
		BaseClass.Sleep();
		elementmethods.button.Image();
		BaseClass.Sleep();
		elementmethods.button.EmptySpace();
		BaseClass.Sleep();
		elementmethods.button.FindColor();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end Button
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 @AfterSuite 
//	 public void AfterSuite() 
//	 { 
//		 BaseClass.stoptdriver();
//	  }

} // Final one

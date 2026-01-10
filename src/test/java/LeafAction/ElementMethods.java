package LeafAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.Select;

import LeafLocators.ElementLocators;
import LeafLocators.ElementLocators.TextBox;
import Utility.BaseClass;

public class ElementMethods {

		public ElementMethod elementmethod;
		public DropDown dropdown;
		
		public Waits waits;
		
		public RadioBttns radiobttns;
		public TextBox textbox;
		
		 public ElementLocators elementlocators = new ElementLocators();
		
		 
		 public ElementMethods() {
			elementmethod = new ElementMethod();
			dropdown = new DropDown();
			waits = new Waits();
			radiobttns = new RadioBttns();
			textbox = new TextBox();
		}
	
		public class ElementMethod{
			
			public void ClickElement(){
				elementlocators.elementlocator.ClickElement.click();
				
			}
		}
		
		
		public class DropDown{
			
			public void ClickDropDown() {
				elementlocators.dropdowns.DropDown.click();
			}
			
			public void UIAuto() throws InterruptedException {	
				Select a = new Select(elementlocators.dropdowns.UIAuto);
				a.selectByIndex(1);		
			}
			
			
			public void Country(String country) throws InterruptedException {
				BaseClass.selectDropdown(elementlocators.dropdowns.Country,country);
				}
			
			public void City(String city) throws InterruptedException {
				BaseClass.selectDropdown(elementlocators.dropdowns.City, city);
			}
			
			public void Course(String course) throws InterruptedException {
				BaseClass.selectCourseDropdown(elementlocators.dropdowns.Course, course);
				
			}
			public void Language(String Lan) throws InterruptedException {
				BaseClass.selectDropdown(elementlocators.dropdowns.Language, Lan);
			}
			
			public void LanguageChoosen(String choosen) throws InterruptedException {
				BaseClass.selectDropdown(elementlocators.dropdowns.LanguageChoosen, choosen);
				
			}
			
		}// closing DropDown
		
		public class Waits{
			
			public void Clickwaits() {
				elementlocators.waits.ClickWaits.click();
			}
			
			public void WaitforVisibility() {
				elementlocators.waits.WaitforVisibility.click();
			}
			
			public void WaitforClickability() {
				elementlocators.waits.WaitforClickability.click();
			}
			
			public void ClickSecondBtn() throws InterruptedException {
				Thread.sleep(5000);
				WebDriverWait w2 = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(90));
				w2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ui-growl-message']")));
				WebElement btn = w2.until(ExpectedConditions.elementToBeClickable(elementlocators.waits.ClickSecondBtn));
				btn.click();
				Thread.sleep(2000);
			}
			
			public void WaitforInvisibility() {
				elementlocators.waits.WaitforInvisibility.click();
				By disappearingElement = By.xpath("//button[contains(.,'I am about to hide')]");
				WebDriverWait w4 = new WebDriverWait(BaseClass.driver,Duration.ofSeconds(30));
				w4.until(ExpectedConditions.invisibilityOfElementLocated(disappearingElement));
			}
			
			public void WaitforTextChange() {
				elementlocators.waits.WaitforTextChange.click();
				WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
				By message = By.xpath("(//span[contains(@class,'ui-button-text')])[7]");
				wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(message, "I am going to change!")));
				String newText = BaseClass.driver.findElement(message).getText();
				System.out.println("Text changed to: " + newText);
			}
			
		}// end of waits
		
		
		public class RadioBttns{
			
			public void ClickRadioBttn() throws InterruptedException {
				BaseClass.Sleep();
				elementlocators.radiobttns.ClickRadioBttn.click();
			}
			
			public void ChromeBrowser() {
				elementlocators.radiobttns.ChromeBrowser.click();
			}
			
			public void defaultBttn() {
				
				//1st style
				boolean selected = elementlocators.radiobttns.defaultBttn.isSelected();
				if(Boolean.TRUE.equals(selected)){
					System.out.println("**Safari radio button is selected by default**");
				}else {
					System.out.println("**Safari button is not selected**");
				}
				
				//2nd Style
				WebElement safariRadio =elementlocators.radiobttns.defaultBttn;
				if(safariRadio.isSelected()){
					System.out.println("**Safari radio button is selected by default**");
				}else {
				    System.out.println("**Safari button is not selected**");
				}

				
				//3rd style
				if (elementlocators.radiobttns.defaultBttn.isSelected()) {
				    System.out.println("**Safari radio button is selected by default**");
				} else {
				    System.out.println("**Safari button is not selected**");
				}
				
			}//closing defaultBttn

			public void UnSelected() {
				
				boolean unSelectable = elementlocators.radiobttns.UnSelectable.isSelected();
				if(unSelectable==false) {
					System.out.println("**Chennai radio button is Unselected**");
				}else {
					System.out.println("**Chennai button is  selected**");
				}
			}
			
			public void SelectAgeGrp() {
				
				boolean selected = elementlocators.radiobttns.SelectAgeGrp.isSelected();
				if(Boolean.TRUE.equals(selected)){
					System.out.println("**Safari radio button is selected by default**");
					WebElement AgeSelector = BaseClass.driver.findElement(By.xpath("//label[normalize-space(text())='1-20 Years']"));
					AgeSelector.click();
					
				}else {
					 elementlocators.radiobttns.SelectAgeGrp.click();
					System.out.println("**Safari button is not selected**");
				}
			}
		}// closing RadioBttns
		
			public class TextBox{
				
				public void Clicktextbox() {
					elementlocators.textbox.ClickTextBox.click();
				}
				
				public void TypeName(String typename) {
					elementlocators.textbox.TypeName.sendKeys(typename);
				}
				
				
			}//Closing TextBox
			
			
		
}

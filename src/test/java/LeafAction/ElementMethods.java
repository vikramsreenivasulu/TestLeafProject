package LeafAction;

import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.support.ui.Select;

import LeafLocators.ElementLocators;
import Utility.BaseClass;

public class ElementMethods {

		public ElementMethod elementmethod;
		public DropDown dropdown;
		
		 public ElementLocators elementlocators = new ElementLocators();
		
		 
		 public ElementMethods() {
			elementmethod = new ElementMethod();
			dropdown = new DropDown();
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
			
			
			
			
			
			
		}
		
}

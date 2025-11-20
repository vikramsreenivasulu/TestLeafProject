package LeafAction;

import LeafLocators.ElementLocators;

public class ElementMethods {

		public ElementMethod elementmethod;
		public TextBox textbox;
		
		 public ElementLocators elementlocators = new ElementLocators();
		
		 
		 public ElementMethods() {
			elementmethod = new ElementMethod();
			textbox = new TextBox();
		}
	
		public class ElementMethod{
			
			public void ClickElement(){
				elementlocators.elementlocator.ClickElement.click();
			}
		}
		
		
		public class TextBox{
			
			public void ClickTextBox() {
				elementlocators.textboxs.ClickTextBox.click();
			}
		}
		
}

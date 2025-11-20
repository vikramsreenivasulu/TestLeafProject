package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ElementLocators {
		
	public ElementLocator elementlocator;
	public TextBoxs textboxs;
	
		public ElementLocators() {
			
			elementlocator = new ElementLocator();
			textboxs = new TextBoxs();
		}
		
		
		public class ElementLocator{
			
			
			public ElementLocator() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath = "(//a[@href='#'])[6]")
			public WebElement ClickElement;
		}
		
		
		
		public class TextBoxs{
			
			public TextBoxs() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath = "//span[normalize-space(text())='Text Box']")
			public WebElement ClickTextBox;
			
		}
}

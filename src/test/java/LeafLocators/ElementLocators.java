package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ElementLocators {
		
	public ElementLocator elementlocator;
	public DropDowns dropdowns;
	
		public ElementLocators() {
			
			elementlocator = new ElementLocator();
			dropdowns = new DropDowns();
		}
		
		
		public class ElementLocator{
			
			
			public ElementLocator() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath = "(//a[@href='#'])[6]")
			public WebElement ClickElement;
		}
		
		
		
		public class DropDowns{
			
			public DropDowns() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath = "//li[@id='menuform:m_dropdown']//a[1]")
			public WebElement DropDown;
			
			@FindBy(xpath = "(//div[@class='col-12']//select)[1]")
			public WebElement UIAuto;
			
			@FindBy(id = "j_idt87:country")
			public WebElement Country;
			
			@FindBy(id = "j_idt87:city_label") 
			public WebElement City;
			
			@FindBy(xpath="//button[@aria-label='Show Options']")
			public WebElement Course;
			
			@FindBy(xpath = "//label[@id='j_idt87:lang_label']") 
			public WebElement Language;
			
			@FindBy(xpath="//label[@id='j_idt87:value_label']")
			public WebElement LanguageChoosen;
			
			
			
		}
}

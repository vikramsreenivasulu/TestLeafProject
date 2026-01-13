package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ElementLocators {
		
	public ElementLocator elementlocator;
	public DropDowns dropdowns;
	public Waits waits;
	public TextBox textbox;
	
	public RadioBttns radiobttns;
	
		public ElementLocators() {
			
			elementlocator = new ElementLocator();
			dropdowns = new DropDowns();
			waits = new Waits();
			radiobttns = new RadioBttns();
			textbox = new TextBox();
			
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
			
		}//closing dropdown
		
		public class Waits{
			
			public  Waits() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath = "//a[contains(@href,'/waits.xhtml')]")
			public WebElement ClickWaits;
			
			@FindBy(xpath = "(//span[@class='ui-button-text ui-c'])[1]")
			public WebElement WaitforVisibility;
			
			@FindBy(xpath = "//span[text()='Click First Button']")
			public WebElement WaitforClickability;
			
			@FindBy(xpath = "//span[text()='Click Second']")
			public WebElement ClickSecondBtn;
			
			@FindBy(xpath = "(//span[contains(text(),'Click')])[2]")
			public WebElement WaitforInvisibility;
			
			@FindBy(xpath = "(//span[contains(text(),'Click')])[5]")
			public WebElement WaitforTextChange;
		}// closinf waits
		
		public class RadioBttns{
			
			public RadioBttns() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath = "//li[@id='menuform:m_radio']//a[1]")
			public WebElement ClickRadioBttn;
			
			@FindBy(xpath = "//table[@id='j_idt87:console1']//td[1]")
			public WebElement ChromeBrowser;
			
			@FindBy(xpath = "(//input[@type='radio'])[21]")
			public WebElement defaultBttn;
			
			@FindBy(xpath = "//input[@value='Chennai']")
			public WebElement UnSelectable;
			
			@FindBy(xpath = "(//input[@name='j_idt87:age'])[2]")
			public WebElement SelectAgeGrp;
			
		}// closing RadioBttns
		
		public class  TextBox{
			
			public TextBox() {
				PageFactory.initElements(BaseClass.driver, this);
			}
			
			@FindBy(xpath = "//li[@id='menuform:m_input']//a[1]")
			public WebElement ClickTextBox;
			
			@FindBy(id="j_idt88:name")
			public WebElement TypeName;
			
			@FindBy(id = "j_idt106:thisform:age")
			public WebElement ErroMsg;  
			
			@FindBy(id = "j_idt88:j_idt91")
			public WebElement AppendCity; 
		}
}

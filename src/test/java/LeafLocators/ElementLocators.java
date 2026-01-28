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
	
	public Button button;
	
	public RadioBttns radiobttns;
	
		public ElementLocators() {
			
			elementlocator = new ElementLocator();
			dropdowns = new DropDowns();
			waits = new Waits();
			radiobttns = new RadioBttns();
			textbox = new TextBox();
			button = new Button();
			
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
			
			@FindBy(id="j_idt106:float-input")
			public WebElement PositionChange;
			
			@FindBy(id="j_idt88:j_idt93")
			public WebElement textboxdisabled;
			
			
			 @FindBy(id ="j_idt106:auto-complete_input")
			 public WebElement ChoosethirdOpt;
			 
			
			
			@FindBy(id = "j_idt88:j_idt95")
			public WebElement ClearText;
			
			@FindBy(id = "j_idt106:j_idt116_input")
			public WebElement DOBChoosen;
			
			@FindBy(xpath = "//input[contains(@class,'ui-spinner-input ui-inputfield')]")
			public WebElement SpintheValue;
			
			@FindBy(xpath = "(//span[contains(@class,'ui-icon ui-c')])[1]")
			public WebElement UpArrowSpin;
			
			@FindBy(id="j_idt88:j_idt97")
			public WebElement Retrieve;
			
			@FindBy(id="j_idt88:j_idt99")
			public WebElement TypeMail;
			
			@FindBy(id="j_idt88:j_idt101")
			public WebElement Abouturself;
			
			@FindBy(id="j_idt106:slider")
			public WebElement SliderMove;
			
			@FindBy(id = "j_idt106:j_idt122")
			public WebElement KeyBoardAppead;
			
			@FindBy(xpath  = "//div[contains(@class,'ui-shadow keypad-popup ui-input-overlay')]")
			public WebElement KeyBoardPopup;
			
			@FindBy(xpath = "//button[contains(@class,'keypad-special keypad-close')]")
			public WebElement KeyboardClose;
			
			@FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
			public WebElement TextEditor;
			
			@FindBy(xpath = "(//button[@class='ql-bold'])[1]")
			public WebElement Bold;
			
			@FindBy(xpath = "(//button[@class='ql-italic'])[1]")
			public WebElement  Italic;
			
			@FindBy(xpath = "(//button[@class='ql-underline'])[1]")
			public WebElement Underline;
			
			
			@FindBy(xpath = "//div[@data-placeholder='Enter your content']//p[1]")
			public WebElement Toolbar;
		}
		 public class Button{
			 
			 public  Button() {
				 PageFactory.initElements(BaseClass.driver, this);
			 }
			 
			 @FindBy(xpath = "//span[normalize-space(text())='Button']")
			 public WebElement ClickButton;
			 
			 @FindBy(xpath = "(//span[@class='ui-button-text ui-c'])[1]")
			 public WebElement  Confirmtitle;
			 
			
			 @FindBy(xpath = "//input[@placeholder='Search...']")
			 public WebElement  SendKeys;
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }//Closing Button
}

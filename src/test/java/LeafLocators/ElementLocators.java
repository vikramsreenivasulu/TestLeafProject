package LeafLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ElementLocators {
		
	public ElementLocator elementlocator;
	public DropDowns dropdowns;
	public Waits waits;
	public TextBox textbox;
	public CheckBox checkbox;
	public Button button;
	public RadioBttns radiobttns;
	public HyperLinks hyperlinks;
	
		public ElementLocators() {
			
			elementlocator = new ElementLocator();
			dropdowns = new DropDowns();
			waits = new Waits();
			radiobttns = new RadioBttns();
			textbox = new TextBox();
			button = new Button();
			checkbox = new CheckBox();
			hyperlinks = new HyperLinks();
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
			 
			 @FindBy(xpath = "//span[contains(@class,'ui-button-icon-right ui-icon')]/following-sibling::span[1]")
			 public WebElement Submit;
			 
			 @FindBy(id = "j_idt88:j_idt92")
			 public WebElement disablebutton;
			 
			 @FindBy(xpath = "//button[@name='j_idt88:j_idt100']//span[1]")
			 public WebElement Success;
			 
			 @FindBy(xpath = "(//span[@class='ui-button-text ui-c'])[3]")
			 public WebElement FindPosition;
			 
			 @FindBy(xpath = "//span[normalize-space(text())='Image']")
			 public WebElement Image;
			 
			 @FindBy(xpath = "//div[@class='grid formgrid']")
			 public WebElement Emptyspace;
			 
			 @FindBy(id = "j_idt88:j_idt96")
			 public WebElement FindColor;
			 
			 @FindBy (xpath = "//button[contains(@class,'rounded-button')]")
			 public List <WebElement> roundedButtons;
		 }//Closing Button
		 
		 
		 
		 public class CheckBox{
			 
			 public  CheckBox() {
				 PageFactory.initElements(BaseClass.driver, this);
			 }
			 
			 @FindBy(xpath="//span[normalize-space(text())='Check Box']")
			 public WebElement ClickCheckBox;
			 
			 @FindBy(xpath="(//div[contains(@class,'ui-chkbox-box ui-widget')])[1]")
			 public WebElement BasicCheckBox;
			 
			 @FindBy(xpath="(//div[@class='ui-toggleswitch ui-widget']//div)[2]")
			 public WebElement ToggleSwitch;
			 
			 @FindBy(xpath="//span[normalize-space(text())='Checked']")
			 public WebElement ToggleChecked;
			 
			 @FindBy(xpath="//span[normalize-space(text())='Ajax']")
			 public WebElement Notification;
			 
			@FindBy(xpath="//span[normalize-space(text())='Checked']")
			public WebElement NotifyCheck;
			 
			 @FindBy(xpath="//input[@id='j_idt87:j_idt102_input']")
			 public WebElement CheckBoxDisabled;
			 
			 
			 @FindBy(xpath = "//table[@id='j_idt87:basic']//div[@class='ui-chkbox ui-widget']")
			 public List<WebElement> FavLang;
			 
			 @FindBy(xpath="//div[@id='j_idt87:multiple']")
			 public WebElement SelectMulti;
			 
			 @FindBy(xpath="(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[9]")
			 public WebElement DropDown;
			 
			 @FindBy(xpath="//span[@class='ui-icon ui-icon-circle-close']")
			 public WebElement DropDownClose;
			 
			 @FindBy(xpath="//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")
			 public WebElement TriStateCheckBox;
			 
			 @FindBy(xpath="//p[contains(text(),'State =')]")
			 public WebElement StateValue;
			 
		 }//Closing CheckBox
		 
		 public class HyperLinks{
			 
			 public  HyperLinks() {
				 PageFactory.initElements(BaseClass.driver, this);
			 }
			 
			 @FindBy(xpath="//li[@id='menuform:m_link']//a[1]")
			 public WebElement ClickHypeLink;
			 
			 @FindBy(xpath="(//a[@class='ui-link ui-widget'])[1]")
			 public WebElement DashBoard;
			 
			 @FindBy(xpath="//a[normalize-space(text())='Find the URL without clicking me.']")
			 public WebElement destination;
			 
			 @FindBy(xpath="//a[normalize-space(text())='How many links in this page?']")
			 public List<WebElement> CountLinks;
			 
			 @FindBy(xpath="(//div[@class='col-12 md:col-6'])[2]//div[@class='col-12']")
			 public List<WebElement> CountLayoutLinks;
			 
			 @FindBy(xpath="//a[@href='lists.xhtml']")
			 public WebElement BrokenLink;
			 
		 }
		 
		 

		 
		 
		 
		 
		 
		 
		 
}//main closing para

package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class MiscLocators {

	public MiscLocator misclocator;
	public Message message;
	
	public File file;
	public Chart chart;
	public Video video;
	
	public MiscLocators() {
		misclocator = new MiscLocator();
		message = new Message();
		file = new File();
		chart = new Chart();
		video = new Video();
	
	}
	
		public class MiscLocator {

		    public MiscLocator() {
		        PageFactory.initElements(BaseClass.driver, this);
		    }

		@FindBy(xpath="(//a[@href='#'])[9]")
		public WebElement ClickMisc;
	}
	
	public class Message{
		
		public Message() {
			 PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="//li[@id='menuform:m_message']//a[1]")
		public WebElement ClickMessage;
		
		@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[1]")
		public WebElement ClickMessageInfo;
		
		@FindBy(xpath="//span[normalize-space(text())='Message Detail']")
		public WebElement CheckMessageInfo;
		
		@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[2]")
		public WebElement ClickMessageWarn;
		
		@FindBy(xpath="//span[normalize-space(text())='Warning']")
		public WebElement CheckMessageWarn;
		
		@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[3]")
		public WebElement ClickMessageError;
		
		@FindBy(xpath="(//span[text()='Error'])[1]")
		public WebElement CheckMessageError;
		
		@FindBy(xpath="//button[@id='j_idt94:j_idt95']//span[1]")
		public WebElement ClickGrowlInfo;
		
		@FindBy(xpath="//div[@class='ui-growl-message']//span[1]")
		public WebElement CheckGrowInfo;
		
		@FindBy(xpath="//button[@id='j_idt94:j_idt96']//span[1]")
		public WebElement ClickGrowWarn;
		
		@FindBy(xpath="//div[@class='ui-growl-message']//span[1]")
		public WebElement CheckGrowWarn;
		
		@FindBy(xpath="//button[@id='j_idt94:j_idt97']//span[1]")
		public WebElement ClickGrowError;
		
		@FindBy(xpath="//div[@class='ui-growl-message']//span[1]")
		public WebElement CheckGrowError;
		
		@FindBy(id="j_idt100:firstname")
		public WebElement InLineFirstName;
		
		@FindBy(id="j_idt100:lastname")
		public WebElement InLineLastName;
		
		@FindBy(id="j_idt100:email")
		public WebElement InLineEmail;
		
		@FindBy(xpath="//span[normalize-space(text())='Submit']")
		public WebElement InLineSubmit;
		
		@FindBy(xpath="//span[text()='First Name is required']")
		public WebElement FirstNameVerify;
		
		@FindBy(xpath="//span[text()='Last Name is required']")
		public WebElement LastNameVerify;
		
		@FindBy(xpath="//span[text()='Email is required']")
		public WebElement EmailVerify;
	} //end Message
	
	
	public class File{
		public File() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="//a[contains(@href,'/file.xhtml')]") 
		public WebElement ClickFile;
		
		
		@FindBy(id="(//span[@class='ui-button-icon-left ui-icon ui-c ui-icon-plusthick'])[1]")
		public WebElement BasicUpload;
		
		@FindBy(xpath="(//span[@class='ui-button-icon-left ui-icon ui-c ui-icon-plusthick'])[2]")
		public WebElement AdvUpload;
		
		@FindBy(xpath="(//span[contains(@class,'ui-button-icon-left ui-icon')])[2]")
		public WebElement BasicDown;
		
		
	}//EndFile
public class Video{
		
		public Video() {
			 PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath="//a[contains(@href,'/video.xhtml')]") 
		public WebElement ClickVideo;
	
	}//endVideo
	
	
public class Chart{
	
	public Chart() {
		 PageFactory.initElements(BaseClass.driver, this);
	}	
	
	@FindBy(xpath="//li[@id='menuform:m_chart']//a[1]")
	public WebElement ClickChart;
	
	@FindBy(xpath="")
	public WebElement ClickLineChart;
	
	}//endofchart
	
}//end

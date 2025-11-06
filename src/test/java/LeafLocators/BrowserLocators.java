package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class BrowserLocators {

	
	public  BrowserLocator browserlocator;
	public  Alerts alerts;
	public Frame frame;
	
	public BrowserLocators(){
		
		browserlocator = new BrowserLocator();
		alerts      =  new Alerts();
		frame		= new Frame();
	}
	
	public class BrowserLocator{
		public BrowserLocator() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath = "(//a[@href='#'])[5]")
		public WebElement Browser;
	
	
	}
	public class Alerts{
		
		public Alerts() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		
		@FindBy(xpath = "//a[starts-with(@href, '/alert.xhtml')]")
		public WebElement Alert;
		
		@FindBy(xpath = "(//span[@class='ui-button-text ui-c'])[1]")
		public WebElement SimpleAlert;
		
		@FindBy(xpath = "(//button[@name='j_idt88:j_idt104']//span)[2]")
		public WebElement PromptAlert;
	
		@FindBy(xpath = "(//span[@class='ui-button-text ui-c'])[2]")
		public WebElement ConfirmAlert;
		
		@FindBy(xpath = "//span[normalize-space(text())='Delete']")
		public WebElement SweetAlertConfirm;
	
		@FindBy(xpath = "//span[normalize-space(text())='No']")
		public WebElement SweetAltgetConfirm;
		
		@FindBy(xpath = "(//span[@class='ui-button-text ui-c'])[3]")
		public WebElement SweetAltSimple;
		
		@FindBy(xpath = "//span[normalize-space(text())='Dismiss']")
		public WebElement SweetAltgetSimple;
	
		@FindBy(xpath = "(//button[@name='j_idt88:j_idt100']//span)[2]")
		public WebElement SweetModal;
		
		@FindBy(xpath = "(//span[@class='ui-icon ui-icon-closethick'])[2]")
		public WebElement SweetModalClose;
		
		@FindBy(xpath = "(//button[@name='j_idt88:j_idt111']//span)[2]")
		public WebElement MaxMin;
		
		@FindBy(xpath = "//span[@class='ui-icon ui-icon-minus']")
		public WebElement MaxMinMinimize;
		
		@FindBy(xpath = "//span[@class='ui-icon ui-icon-plus']")
		public WebElement MaxMinMaximize;
		
		@FindBy(xpath = "(//span[@class='ui-icon ui-icon-closethick'])[3]")
		public WebElement MaxMinClose;
	}
	public class Frame{
		
		public Frame() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(xpath = "//a[contains(@href, '/frame.xhtml')]")
		public WebElement ClickFrame;
		
		@FindBy(xpath = "//iframe[@src='default.xhtml']")
		public WebElement InsideFrame;
		
		
		@FindBy(xpath = "//button[@id='Click']")
		public WebElement InsideFrameButton;
		
		
		
		//frame close
	}
	
		
	
	
	
	
	
	
	
	
	
//main close para
}

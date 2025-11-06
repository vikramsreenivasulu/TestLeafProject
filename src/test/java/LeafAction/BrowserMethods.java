package LeafAction;

import LeafLocators.BrowserLocators;
import Utility.BaseClass;
import org.openqa.selenium.*;

public class BrowserMethods {

	
	
	public BrowserMethod browsermethod;
	public Alerts alerts;
	
	public Frames frames;
	
	public BrowserLocators browserlocators = new BrowserLocators();
	public BrowserMethods() {
		
		browsermethod = new BrowserMethod();
		alerts		= new Alerts();
		frames     =  new Frames();
	}
	
	public class BrowserMethod{
		
		public void Browser() throws InterruptedException 
		{
			BaseClass.Sleep();
			browserlocators.browserlocator.Browser.click();
		}
		
			
	}
	
	public class Alerts
	{
		
		public void Alert() {
			browserlocators.alerts.Alert.click();
		}
		
		public void SimpleAlert() {
			//1
			browserlocators.alerts.SimpleAlert.click();
		}
		
		public void SimplegetAlert() {
			Alert alert = BaseClass.driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println(alertText);
			alert.accept();
		}
		
		public void PromptAlert() {
			//2
			browserlocators.alerts.PromptAlert.click();
		}
		
		public void PromptgetAlert() {
			Alert alert = BaseClass.driver.switchTo().alert();
			alert.sendKeys("kdbcdjhbc");
//			String alertText = alert.getText();
//			System.out.println(alertText);
			alert.accept();
		}
		public void ConfirmAlert() {
			//3
			browserlocators.alerts.ConfirmAlert.click();
		}
		public void ConfirmgetAlert() {
			Alert alert = BaseClass.driver.switchTo().alert();
			alert.accept();
		}
		
		public void SweetAlertConfirm() {
		//4
		browserlocators.alerts.SweetAlertConfirm.click();
		}
		
		public void SweetAltgetConfirm() {
//			
			browserlocators.alerts.SweetAltgetConfirm.click();
		}
	
		public void SweetAlertSimple() {
			browserlocators.alerts.SweetAltSimple.click();
		}
		
		public void SweetAltgetSimple() {
			browserlocators.alerts.SweetAltgetSimple.click();
		}
	
		public void SweetModal() {
			browserlocators.alerts.SweetModal.click();
		}
	
		public void SweetModalClose() {
			browserlocators.alerts.SweetModalClose.click();
		}
		public void MaxMin() {
			browserlocators.alerts.MaxMin.click();
		}
	
		public void MaxMinMinimize() {
			browserlocators.alerts.MaxMinMinimize.click();
		}
		
		public void MaxMinMaximize() {
			browserlocators.alerts.MaxMinMaximize.click();
		}
		
		public void MaxMinClose() {
			browserlocators.alerts.MaxMinClose.click();
		}
	}
	
	public class Frames {
		
		public void ClickFrame() {
			browserlocators.frame.ClickFrame.click();
		}
		
		public void switchToInsideFrame() {
			BaseClass.driver.switchTo().frame(browserlocators.frame.InsideFrame);
			browserlocators.frame.InsideFrameButton.click();
			BaseClass.driver.switchTo().defaultContent();
			
		}
	}
}

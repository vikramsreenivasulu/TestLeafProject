package LeafTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LeafAction.BrowserMethods;
import Utility.BaseClass;

public class BrowserTestCases {

	
	public BrowserMethods browsermethods;
	
	@BeforeSuite
	public void BeforeSuit() {
		BaseClass.startdriver();
		browsermethods = new BrowserMethods();
		
	}
		
		@Test					//Alerts
		public void Attest() throws InterruptedException {
			
			browsermethods.browsermethod.Browser();
			
			BaseClass.Sleep();
			//Alert
			browsermethods.alerts.Alert();
			BaseClass.Sleep();
			browsermethods.alerts.SimpleAlert();
			BaseClass.Sleep();
			browsermethods.alerts.SimplegetAlert();
			browsermethods.alerts.PromptAlert();
			BaseClass.Sleep();
			browsermethods.alerts.PromptgetAlert();
			BaseClass.Sleep();
			browsermethods.alerts.ConfirmAlert();
			BaseClass.Sleep();
			browsermethods.alerts.ConfirmgetAlert();
			BaseClass.Sleep();
			browsermethods.alerts.SweetAlertConfirm();
			BaseClass.Sleep();
			browsermethods.alerts.SweetAltgetConfirm();  
			BaseClass.Sleep();
			browsermethods.alerts.SweetAlertSimple();
			BaseClass.Sleep();
			browsermethods.alerts.SweetAltgetSimple();
			BaseClass.Sleep();			
			browsermethods.alerts.SweetModal();
			BaseClass.Sleep();
			browsermethods.alerts.SweetModalClose();
			BaseClass.Sleep();
			browsermethods.alerts.MaxMin();
			BaseClass.Sleep();
			browsermethods.alerts.MaxMinMinimize();
			BaseClass.Sleep();
			BaseClass.Sleep();
			browsermethods.alerts.MaxMinMaximize();
			BaseClass.Sleep();
			BaseClass.Sleep();
			browsermethods.alerts.MaxMinClose();
			System.out.println("it is working");
			
		}
		
		
		@Test						//Iframes	
		public void Attest1() throws InterruptedException{
			browsermethods.browsermethod.Browser();
			BaseClass.Sleep();
			//Frame
			browsermethods.frames.ClickFrame();
			BaseClass.Sleep();
			browsermethods.frames.switchToInsideFrame();
			BaseClass.Sleep();
			browsermethods.frames.switchtoNestedframe();
		}
		
		@Test			//Browser or Window Handlings
		public void Attest2() throws InterruptedException {
			BaseClass.Sleep();
			browsermethods.browsermethod.Browser();
			BaseClass.Sleep();
			browsermethods.window.ClickWindow();
			BaseClass.Sleep();
			BaseClass.Sleep();
			browsermethods.window.Open();
			BaseClass.Sleep();
			BaseClass.Sleep();
			browsermethods.window.OpenMultiple();
			BaseClass.Sleep();
			BaseClass.Sleep();
			browsermethods.window.CloseWindows();
			BaseClass.Sleep();
			browsermethods.window.OpenWithDelay();
			
		}
		
		
		@Test				//Drag and Drop
		public void Attest3() throws InterruptedException {
			BaseClass.Sleep();
			browsermethods.browsermethod.Browser();
			BaseClass.Sleep();
			browsermethods.drag.ClickDrag();
			BaseClass.Sleep();
			browsermethods.drag.DragOnly();
			BaseClass.Sleep();
			browsermethods.drag.DragandDrop();
			
		}
		
		
		
		
		
	}


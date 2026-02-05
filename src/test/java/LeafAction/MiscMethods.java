package LeafAction;

import org.testng.Assert;

import LeafLocators.MiscLocators;
import Utility.BaseClass;

public class MiscMethods {

    public MiscMethod miscmethod;
   
    public Message message;
    
    
    
    
    public MiscLocators misclocators = new MiscLocators();
    public MiscMethods() {
    	miscmethod = new MiscMethod();
    	message = new Message();
    }

    public class MiscMethod{
    	
    	public void ClickMisc() {
    		misclocators.misclocator.ClickMisc.click();
    	}
    }
    
    public class Message{
    
		public void ClickMessage() {
    		misclocators.message.ClickMessage.click();
    	}
    	
    	public void ClickMessageInfo() {
    		misclocators.message.ClickMessageInfo.click();
    		
    		String info = misclocators.message.CheckMessageInfo.getText();
    		System.out.println("Message Click msg Info:"+info);
    		
    		Assert.assertTrue(true, "info is not same");
    	}
    	
    	public void ClickMessageWarn() {
    		misclocators.message.ClickMessageWarn.click();
    		
    		String Warn = misclocators.message.ClickMessageWarn.getText();
    		System.out.println("After Clicking Message Warn:"+Warn);
    		
    		Assert.assertTrue(true, "Warn is not same");
    	}
    	
    	
    	public void ClickMessageError() {
    		misclocators.message.CheckMessageError.click();
    		
    		String error = misclocators.message.CheckMessageError.getText();
    		System.out.println("After Clicking Message Error:"+error);
    		
    		Assert.assertTrue(true, "Error is not same");
    	}
    	
    	public void ClickGrowlInfo() throws InterruptedException {
    		BaseClass.Sleep();
    		misclocators.message.ClickGrowlInfo.click();
    		
    		String Info = misclocators.message.CheckGrowInfo.getText();
    		System.out.println(Info);
    		
    		Assert.assertTrue(true, "info is not same");
    		
    	}
    	
    	public void ClickGrowWarn() throws InterruptedException {
    		BaseClass.Sleep();
    		misclocators.message.ClickGrowWarn.click();
    		
    		String Warn = misclocators.message.CheckGrowWarn.getText();
    		System.out.println(Warn);
    		
    		Assert.assertTrue(true,"Warn is not same");
    	}
    	
    	public void ClickGrowError() throws InterruptedException {
    		BaseClass.Sleep();
    		misclocators.message.ClickGrowError.click();
    		
    		String error = misclocators.message.ClickGrowError.getText();
    		System.out.println(error);
    		
    		Assert.assertTrue(true,"Error is not same");
    	}
    	
    	
    	public void InLineFirstName(String firstname) throws InterruptedException {
    		misclocators.message.InLineFirstName.sendKeys(firstname);
    		BaseClass.Sleep();
    		misclocators.message.InLineFirstName.clear();
    		
    	}
    	
    	public void InLineLastName(String lastname) throws InterruptedException {
    		misclocators.message.InLineLastName.sendKeys(lastname);
    		BaseClass.Sleep();
    		misclocators.message.InLineLastName.clear();
    	}
    	
    	public void InLineMail(String mail) throws InterruptedException {
    		misclocators.message.InLineEmail.sendKeys(mail);
    		BaseClass.Sleep();
    		misclocators.message.InLineEmail.clear();
    	}
    	
    	public void InLineSubject() {
    		misclocators.message.InLineSubmit.click();
    	}
    	
    }//end Message
    
    
    
    
    
    
} //end MiscMethods


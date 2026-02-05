package LeafAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import LeafLocators.MiscLocators;
import Utility.BaseClass;

public class MiscMethods {

    public MiscMethod miscmethod;
   
    public Message message;
    
    public File file;
    public Chart chart;
    public Video video;
    
    
    public MiscLocators misclocators = new MiscLocators();
    public MiscMethods() {
    	miscmethod = new MiscMethod();
    	message = new Message();
    	file = new File();
    	chart  = new Chart();
    	video = new Video();
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
    		
    		boolean firsttextDisplayed = misclocators.message.FirstNameVerify.isDisplayed();
    		System.out.println(firsttextDisplayed);
    		Assert.assertTrue(firsttextDisplayed, "1st name is not displayed");
    		
    		
    		boolean secondtextdisplayed = misclocators.message.LastNameVerify.isDisplayed();
    		System.out.println(secondtextdisplayed);
    		Assert.assertTrue(secondtextdisplayed, "2nd name is not displayed");
    		
    		boolean emailtextdisplayed = misclocators.message.EmailVerify.isDisplayed();
    		System.out.println(emailtextdisplayed);
    		Assert.assertTrue(emailtextdisplayed, "email is not displayed");
    	}
    	
    }//end Message
    
    
    
    public class File{
    	
    	public void ClickFile() {
    		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
    		WebElement clickFile = misclocators.file.ClickFile;
    		js.executeScript("arguments[0].click();", clickFile);
    	}
    	
    	public void BasicUpload() {
    		misclocators.file.BasicUpload.click();
    	}
    	
    	public void AdvUpload() {
    		misclocators.file.AdvUpload.click();
    	}
    	
    	public void BasicDown() {
    		misclocators.file.BasicDown.click();
    	}
    	
    }//end file
   
    
    
    public class Video{
    	
    	public void ClickVideo() {
    		misclocators.video.ClickVideo.click();
    	}   	
    }//end Video
    
    
    public class Chart{
    	
    	public void ClickChart() {
    		misclocators.chart.ClickChart.click();
    	} 	
    }//end Chart
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} //end MiscMethods


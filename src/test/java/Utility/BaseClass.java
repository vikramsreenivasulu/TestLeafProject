package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;


public class BaseClass {
			
	
	
		public static String url = "https://leafground.com/dashboard.xhtml";
		public static WebDriver driver;

		public static void startdriver() 
		{
			driver = new ChromeDriver(getChromeOptions());
			
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
		}
	
		//toasted msg
		public static ChromeOptions getChromeOptions() 
		{
			
			//chrome browser automated by pop
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	        options.setExperimentalOption("useAutomationExtension", false);
	        
	        //dress pop
	    	options.addArguments("--disable-autofill");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-notifications");
			options.addArguments("--ignore-ssl-errors=yes");
			options.addArguments("--ignore-certificate-errors");
			options.addArguments("disable-infobars");
			options.addArguments("--disable-translate");
	        
	        //
	        Map<String, Object> prefs = new HashMap<>();
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.password_manager_enabled", false);
	        options.setExperimentalOption("prefs", prefs);
	        return options; 
	        }
		
		public static void Sleep() throws InterruptedException 
		{
			Thread.sleep(2000);
		}
		
		public static String getParentWindow() {
			   String parentWindow = driver.getWindowHandle();
			   
			   return parentWindow ;
		}
		
		public static void switchToNewWindow(String window) {
			  
		        Set<String> allWindows = driver.getWindowHandles();

		        for (String handle : allWindows) {
		            if (!handle.equals(window)) {
		            	
		                driver.switchTo().window(handle);
		                break;
		            	
		            }
		        }

		}
		
		public static void switchToParentWindow(String window) {
			   driver.switchTo().window(window);
			   
		}
		
		public static void switchToNewWindowContains(String window) 
		{

			Set<String> allWindows = driver.getWindowHandles();

			for (String handle : allWindows) 
			{
				if (!handle.equals(window)) 
				{

					driver.switchTo().window(handle);
					if (!driver.getCurrentUrl().contains("input")) 
					{

						driver.close();
						break;
					}

				}
			}

		} //switchToNewWindowContains
		
		public static void selectDropdown(WebElement dropdown, String value) throws InterruptedException {
		    dropdown.click();
		    BaseClass.Sleep();
		    BaseClass.Sleep();
		    WebElement element = driver.findElement(By.xpath("//li[@data-label='" + value + "']"));
		    element.click();
		}  // closing selectDropdown 
		
		
		public static void selectCourseDropdown(WebElement dropdown, String value) throws InterruptedException {
		    dropdown.click();
		    BaseClass.Sleep();
		    BaseClass.Sleep();
		    WebElement element = driver.findElement(By.xpath("//li[@data-item-label='" + value + "']"));
		    element.click();
		}   //Closing selectCourseDropdown    
		
		
		public static void TakeScreenshot(String sreenshotname) {
			
			
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File Start = ts.getScreenshotAs(OutputType.FILE);
			
			File End = new File("C:\\Users\\vikram.sreenivasulu\\eclipse-workspace\\PraticeProject\\ScreenShot\\"+sreenshotname+".png");
			
			try {
				FileHandler.copy(Start,End);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}

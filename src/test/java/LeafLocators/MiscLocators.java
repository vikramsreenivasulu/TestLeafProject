package LeafLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class MiscLocators {

	public MiscLocator misclocator;
	
	public  MiscLocators() {
		misclocator = new MiscLocator();
	}
	
	public class MiscLocator{
		public MiscLocator() {
			PageFactory.initElements(BaseClass.driver, this);
		}
			@FindBy(xpath="")
			public WebElement ClickMisc;
		
		
	}
}

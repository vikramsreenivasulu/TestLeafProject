package LeafTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LeafAction.MiscMethods;
import Utility.BaseClass;

public class MisctestCases {

    public MiscMethods miscmethods;

    @BeforeSuite
    public void BeforeSuit() {
        BaseClass.startdriver();
        miscmethods = new MiscMethods();
    }
 
 
    @Test()
    public void Atest() throws InterruptedException {
    	
    	BaseClass.Sleep();
    	miscmethods.miscmethod.ClickMisc();
    	BaseClass.Sleep();
    	miscmethods.message.ClickMessage();
//    	BaseClass.Sleep();
//    	miscmethods.message.ClickMessageInfo();
//    	BaseClass.Sleep();
//    	miscmethods.message.ClickMessageWarn();
//    	BaseClass.Sleep();
//    	miscmethods.message.ClickMessageError();
//    	BaseClass.Sleep();
//    	miscmethods.message.ClickGrowlInfo();
//    	BaseClass.Sleep();
//    	miscmethods.message.ClickGrowWarn();
//    	BaseClass.Sleep();
//    	miscmethods.message.ClickGrowError();
    	BaseClass.Sleep();
    	miscmethods.message.InLineFirstName("vikram");
    	BaseClass.Sleep();
    	miscmethods.message.InLineLastName("sreenivas");
    	BaseClass.Sleep();
    	miscmethods.message.InLineMail("vikram@gmail.com");
    	BaseClass.Sleep();
    	miscmethods.message.InLineSubject();
    	
    }
}

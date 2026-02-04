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
    public void Atest() {
    	miscmethods.miscmethod.ClickMisc();
    	miscmethods.message.ClickMessage();
    }
}

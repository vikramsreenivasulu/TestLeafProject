package LeafTestCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LeafAction.HomeMethods;
import Utility.BaseClass;
import Utility.ExtentReport;

public class HomeTestCases {

	public HomeMethods homemethods;

	@BeforeSuite
	public void BeforeSuite() {
		BaseClass.startdriver();
		homemethods = new HomeMethods();
		ExtentReport.startReport();

	}

	@Test
	public void Attest() throws InterruptedException {

		ExtentReport.createTest("Home Test");

		homemethods.homemethod.Home();
		ExtentReport.pass("verified");

		BaseClass.Sleep();
		homemethods.homemethod.Dashboard();
		ExtentReport.fail("verified");

		BaseClass.Sleep();
		homemethods.homemethod.EmailId("asdf@gmail.com");
		ExtentReport.logInfo("verified");

		BaseClass.Sleep();
		homemethods.homemethod.Message("hi how re youuuuuuuu");
		homemethods.homemethod.Home1();
		homemethods.homemethod.Auth();

		String parentWindow = BaseClass.getParentWindow();
		homemethods.homemethod.BasicAuth();

		BaseClass.switchToNewWindow(parentWindow);

		homemethods.homemethod.HandleBasicAuth();

		BaseClass.switchToParentWindow(parentWindow);

		System.out.println("it's working");

	}

	@AfterMethod
	public void captureFailure(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			String name = result.getName();
			String path = BaseClass.TakeScreenshot(name);
			ExtentReport.fail("Test Failed: " + result.getThrowable());
			
//	        ExtentReport.addScreenshot(path);


		}
	}

	@AfterSuite
	public void AfterSuite() {
		ExtentReport.tearDownReport();
		BaseClass.stoptdriver();


	}

}

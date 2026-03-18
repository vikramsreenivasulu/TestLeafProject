package Utility;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static ExtentReports extent;

	public static ExtentTest extentTest;

	public static void startReport() {

		String path = System.getProperty("user.dir") + "/reports/index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Sample Report");
		reporter.config().setDocumentTitle("Sample Title");
		reporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vikram");
		extent.setSystemInfo("Project", "TestLeaf");

	}

	public static void tearDownReport() {

		extent.flush();
	}

	public static void createTest(String name) {

		extentTest = extent.createTest(name);
	}

	public static void logInfo(String name) {

		extentTest.info(name);
	
		
	}

	public static void pass(String name) {

//		extentTest.pass(name);
		String takeScreenshot = BaseClass.TakeScreenshot(name);
		extentTest.pass("name",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot).build());
	}

	public static void fail(String name) {

		String takeScreenshot = BaseClass.TakeScreenshot(name);
		extentTest.pass(name,MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot).build());
	}

	

}

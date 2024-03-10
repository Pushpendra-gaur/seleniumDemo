package Base;

import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	ExtentSparkReporter esp;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void startReport() {

		esp = new ExtentSparkReporter("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Demo\\Report\\extentReport.html");
		reports = new ExtentReports();
		reports.attachReporter(esp);

		reports.setSystemInfo("Machine", "Dell");
		reports.setSystemInfo("User", "Pushpendra");
		reports.setSystemInfo("Browser", "Chrome");

		esp.config().setDocumentTitle("Extent Report");
		esp.config().setReportName("TestRepoets");
		esp.config().setTheme(Theme.STANDARD);
		esp.config().setTimeStampFormat("EEEE,MMMM,dd, hh:mm a '('zzz')'");

	}

	public void getResult(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Fail", ExtentColor.RED));
		}

		else if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Pass ", ExtentColor.GREEN));

		}

		else if (result.getStatus() == ITestResult.SKIP) {

			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Skip", ExtentColor.ORANGE));

		}

	}

	@AfterTest
	public void tearDown() {

		reports.flush();
	}

}
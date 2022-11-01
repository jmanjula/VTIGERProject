package testNG.prac;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

import genericutility.Baseclass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ListImpClass implements ITestListener {
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		System.out.println("This will execute when @test will start");
		
	}
 
	public void onTestSuccess(ITestResult result) {
		System.out.println("Good Job");
		System.out.println("This will execute when @test is gonna pass");
		
	}

	public void onTestFailure(ITestResult result) {
		
		String path=Baseclass.TakeScreenShot(result.getMethod().getMethodName());
		test.log(Status.FAIL,result.getMethod().getMethodName()+ "got failed");
		//test.log(Status.FAIL,result.getMethod().getMethodName()+" .png");
		test.log(Status.FAIL,result.getThrowable());
		test.addScreenCaptureFromPath(path);
		   	
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("This will execute when @test is gonna skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		reporter=new ExtentSparkReporter("./ExtentReprts/SDET.html");
		 reporter.config().setDocumentTitle("New FB");
		 reporter.config().setTheme(Theme.STANDARD);
		
		reports=new ExtentReports();
		
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("Browser","Chrome");
		reports.setSystemInfo("Build","10.3.5");
		reports.setSystemInfo("Reporter Name","manju");
		reports.setSystemInfo("Env", "QA");
		
		
		
	}

	public void onFinish(ITestContext context) {
		reports.flush();
		
		
	}

	
}

package testNG.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ExtentReports_1 {
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	
	@Test
	public void createReports() {
		reporter=new ExtentSparkReporter("./ExtentReprts/SDET.html");
		reporter.config().setDocumentTitle("New FB");
		reporter.config().setTheme(Theme.STANDARD);
		
		reports=new ExtentReports();
		
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("Browser","Chrome");
		reports.setSystemInfo("Build","10.3.5");
		reports.setSystemInfo("Reporter Name","manju");
		reports.setSystemInfo("Env", "QA");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		test = reports.createTest("manjufacebook");
		reports.flush();
		
	}
}
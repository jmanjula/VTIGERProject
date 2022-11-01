package genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;

public class Baseclass {
	public  WebDriver driver;
	public static WebDriver sdriver;
	public static ExtentTest test;

	
	
	propertyfileutility pFU=new propertyfileutility();
	@BeforeSuite(groups={"smoke","regression","integration"})
	public void dataBaseconnection() {
		
		System.out.println("dataBase connected");
		
	}
	@AfterSuite(groups={"smoke","regression","integration"})
	public void dataBaseDisconnected() {
		System.out.println("dataBase Disconnected");
		
	}
	@BeforeClass(groups={"smoke","regression","integration"})
	public void launchBrowser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    sdriver=driver;
		WebDriverUtility wdu =new WebDriverUtility(driver);
		String uRL =pFU.readDataFromPropertyFile("url");
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get(uRL);
		System.out.println("Browser opened");
		
		
		
	}
	@AfterClass(groups={"smoke","regression","integration"})
	public void closeBrowser() {
		driver.close();	
	}
	@BeforeMethod(groups={"smoke","regression","integration"})
	public void logintoApp() throws Throwable {
		
	
		
		String uName =pFU.readDataFromPropertyFile("username");
		String pWD =pFU.readDataFromPropertyFile("password");
		LoginPageClass loginPaClass = new LoginPageClass(driver);
		loginPaClass.login(uName, pWD);
	}
	@AfterMethod(groups={"smoke","regression","integration"})
	public void logout() {
		HomePageClass hpc=new HomePageClass(driver);
		 hpc.SignOut(driver);	
	}
	public static String TakeScreenShot(String name) {
		TakesScreenshot ts=(TakesScreenshot)Baseclass.sdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String Path="./Screenshot/"+name+" .png";
		File dest =new File(Path);
		try {
			FileUtils.moveFile(src,dest);
			
		}
		catch(Exception e){
			e.printStackTrace();
			
			
		}
		return Path;
		
		
		
		
			  
		}
	}
	



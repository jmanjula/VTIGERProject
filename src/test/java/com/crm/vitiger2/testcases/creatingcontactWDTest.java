package com.crm.vitiger2.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import genericutility.WebDriverUtility;
import genericutility.propertyfileutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class creatingcontactWDTest {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu =new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		propertyfileutility pFU=new propertyfileutility();
		String uRL =pFU.readDataFromPropertyFile("url");
		String uName =pFU.readDataFromPropertyFile("username");
		String pWD =pFU.readDataFromPropertyFile("password");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Manju\\automation\\sdet\\Path\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get(uRL);
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys(uName);
		WebElement password =driver.findElement(By.name("user_password"));
		password.sendKeys(pWD);
		WebElement loginButton=driver.findElement(By.id("submitButton"));
		loginButton.click();
		WebElement conButton=driver.findElement(By.linkText("Contacts"));
		conButton.click();
		WebElement plusButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		plusButton.click();
		WebElement fNameType1=driver.findElement(By.name("salutationtype"));
		wdu.SelectByValue(fNameType1,"Mr.");

		WebElement fNameTf=driver.findElement(By.name("firstname"));
		fNameTf.sendKeys("Bahubali");
		WebElement lNameTf=driver.findElement(By.name("lastname"));
		lNameTf.sendKeys("Amarendra");
		WebElement addOrgButton=driver.findElement(By.xpath("//img[@title='Select']"));
		addOrgButton.click();
		
		String parentwin =wdu.switchToParent();
		wdu.allHandles(parentwin);
		
		WebElement searchTF=driver.findElement(By.id("search_txt"));
		searchTF.sendKeys("manju");
		WebElement searchButton=driver.findElement(By.name("search"));
		searchButton.click();
		Thread.sleep(3000);
		WebElement selectOrg =driver.findElement(By.id("1"));
		selectOrg.click();
		Thread.sleep(3000);
		wdu.allHandles(parentwin);
		WebElement saveButton =driver.findElement(By.name("button)"));
		saveButton.click();
		Thread.sleep(3000);
		WebElement adminImg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG"));
		wdu.mouseOverAction(adminImg);
		WebElement signOut=driver.findElement(By.linkText("signOut"));
		signOut.click();
		driver.close();


	}

}



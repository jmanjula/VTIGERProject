package com.crm.vtiger.testcases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericutility.Javautility;

public class organizationnameTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manju\\automation\\sdet\\Path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		
        driver.findElement(By.name("user_name")).sendKeys("admin", Keys.TAB,"admin",Keys.TAB,Keys.SPACE,Keys.ENTER);
        driver.findElement(By.xpath("//a[text()='Organizations']")).click();
        driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
       String orgname="Testyantra"+Javautility.generateRannum();
       
      WebElement orgname1 =driver.findElement(By.name("accountname"));
        WebElement w1= driver.findElement(By.name("industry"));
        Select select1=new Select (w1);
        select1.selectByVisibleText("Chemicals");
        driver.findElement(By.name("button")).click();
     
       WebElement Header = driver.findElement(By.className("dvHeaderText"));
       String hText=Header.getText();
       System.out.println(hText);
       if(hText.contains(orgname)) {
    	   System.out.println("validation succesfully");
       }
       else {
    	   System.out.println("validation failed");
       }
       
       
	     WebElement adminImg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			 Actions action =new Actions(driver);
			 action.moveToElement(adminImg).perform();
		 WebElement signOut=driver.findElement(By.xpath("//a[text()='Sign Out']"));
			 signOut.click();
			 
			  driver.close();

	}

}

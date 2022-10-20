package com.amazon.Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import genericutility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class multiTabTest {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu =new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get("https://www.amazon.in/");
		WebElement mobiless=driver.findElement(By.linkText("Mobiles"));
		Actions action =new Actions(driver);
		action.contextClick(mobiless).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement bookss=driver.findElement(By.linkText("Books"));
		Actions action1 =new Actions(driver);
		action1.contextClick(bookss).perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement  electronics =driver.findElement(By.linkText("Electronics"));
		Actions action2 =new Actions(driver);
		action.contextClick(electronics).perform();
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	   
		Set<String>allHandles= driver.getWindowHandles(); 
		
		String  SwitchTitle ="Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		
		
	     	for(String ah:allHandles) {
		      String title= driver.switchTo().window(ah).getTitle();
		      System.out.println(driver.getTitle());
	        if(title.equals(SwitchTitle)) {
			          break;
	 }
	//if(!title.equals(SwitchTitle)) {
		driver.close();
	
		
	}
			
}
		
		
}



package toolTipTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericutility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartSvgTest {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu =new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get("https://www.flipkart.com/");
		driver.findElement( By.xpath("//button[text()='✕']")).click();
		driver.findElement( By.xpath("//*[name()='svg'and@class='V3C5bO']")).click();
		Thread.sleep(3000);
		driver.close();
		
	
		
		
		
		
		
		
	

	}

}

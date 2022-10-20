package ddt.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manju\\automation\\sdet\\Path\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> ele=driver .findElements(By.name("url"));
		for(WebElement ele1 : ele)
		{
			String list=ele1.getText();
			System.out.println(list);
			
		}
		driver.findElement(By.xpath("//option [@value='search-alias=fashion']")).click();
		

	}
	}



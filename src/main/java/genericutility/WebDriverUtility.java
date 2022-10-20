package genericutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	/**
	 * This method is used to maximize the window
	 * @author Manju
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}
	/**
	 * @author Manju
	 */
	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * @author Manju
	 */

	public void SelectByIndex(WebElement ele,int num) {
		Select select=new Select(ele);
		select.selectByIndex(num);
	}

	public void SelectByVisibleText(WebElement ele,String Text) {
		Select Select =new Select(ele);
		Select.selectByVisibleText(Text);
	}

	public void SelectByValue(WebElement ele,String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}
	/**
	 *@author Manju
	 * @param parentwin 
	 */
	public String switchToParent() {
		String parentHandle =driver.getWindowHandle();
		System.out.println(parentHandle);
		return parentHandle;
		
	}
	public void allHandles(String pHandle) {
		Set<String> allWinHandles =driver.getWindowHandles();
		System.out.println("All window Handles are :");
		for(String aW:allWinHandles) {
			System.out.println(aW);
			if(!pHandle.equals(aW)) {
				 driver.switchTo().window(aW);
				 break;
				
			}
			else {
				driver.switchTo().window(pHandle);
			}
			
		}
	}
	
	public void mouseOverAction(WebElement variable) {
		Actions action =new Actions(driver);
		action.moveToElement(variable).perform();
	}
	




}









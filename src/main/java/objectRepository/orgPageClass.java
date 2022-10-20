package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orgPageClass {
	
	
	@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement creorg;
	public orgPageClass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getcreorg() {
		return creorg;
		
	}
	

	}

	
	
	
		
	


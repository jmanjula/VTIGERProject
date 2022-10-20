package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPageClass {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement crelead;
	public LeadPageClass(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}

	public WebElement getCrelead() {
		return crelead;
	}

}

 

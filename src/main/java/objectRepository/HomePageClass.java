package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	public  HomePageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Organizations")
	private WebElement orgButton;
	
	@FindBy(linkText ="Contacts")
	private WebElement conButton;
	
	@FindBy(linkText ="Leads")
	private WebElement leadButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	@FindBy(linkText ="Sign Out")
	private WebElement SoButton;

	private WebDriver driver;

	public WebElement getOrgButton() {
		return orgButton;
	}

	public WebElement getConButton() {
		return conButton;
	}

	public WebElement getAdminImg() {
		return adminImg;
	}

	public WebElement getSoButton() {
		return SoButton;
	}
	public void mouseOverAction(WebElement variable) {
		Actions action =new Actions(driver);
		action.moveToElement(variable).perform();
	
}

	public void SignOut(WebDriver driver2) {
		// TODO Auto-generated method stub
		
	}



		
	}



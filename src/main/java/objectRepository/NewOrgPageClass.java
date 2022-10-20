package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrgPageClass {
	@FindAll({@FindBy(name="accountname"),@FindBy(xpath="//input[@class='detailedViewTextBox']")})
	private WebElement orgNameTF;
	
	@FindAll({@FindBy(name="button"),@FindBy(xpath="//input[@type='button']")})
	private WebElement saveButton;
	 
	public NewOrgPageClass (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgNameTF() {
		return orgNameTF;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	public void orgTF(String orgText) {
		orgNameTF.sendKeys(orgText);
		
	}
	public void sButton() {
		saveButton.click();
	}

		
	}
	

	
	
		
		
	
	
	
	
	
	



package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewConPageClass {
	
	
	
	@FindBy(name="salutationtype")
	private WebElement fNameType;
	
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement selorg;
	
	
	
	@FindBy(name="button")
	private WebElement sButton;
	
	 @FindBy(xpath="//img[@src='themes/softed/images/user.PNG")
	 private WebElement adminimg;
	 
	 @FindBy(xpath="//a[text='signOut']")
	 private WebElement signout;
	 
	 public WebDriver getDriver(WebDriver driver) {
		return driver;
		 
	 }
	 public WebElement getsignout() {
		return signout;
		 
	 }
	 public WebElement getAdminImg() {
		return adminimg;
		 
	 }
	 public WebElement getsButton() {
		return sButton;
		 
	 }
 
	 
	 public NewConPageClass(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 public WebElement getfnameType() {
		return fNameType;
		 
	 }
	 public WebElement getnameType() {
		return fname;
	 
	 
	 }
	 public WebElement getlnameType() {
			return lname;
			 
		 }
	 public WebElement getselorg() {
			return selorg;
			 
		 }
	 public void firstNameType(String value) {
		Select select=new Select(fNameType);
		select.selectByVisibleText(value);
	 }
	 public void firstName(String fname1) {
		 fname.sendKeys(fname1);
		 
		 
	 }
	 public void lastName(String lname1) {
		 lname.sendKeys(lname1);
		 
		 
	 }
	 public void orgClick() {
		 selorg.click();
	 }
	
	 public void sBtn() {
		 sButton.click();
		 
	 }
	 public void mouseOverAction(WebElement variable, WebDriver driver) {
			Actions action =new Actions(driver);
			action.moveToElement(variable).perform();	 
	
	}
	
	}
		 
	 
	
	



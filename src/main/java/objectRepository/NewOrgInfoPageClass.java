package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewOrgInfoPageClass {
	
		@FindBy (name="industry")
		private WebElement IndustryDD;
		
		@FindBy(className ="dvHeaderText")
		public WebElement hText;

		@FindAll({@FindBy(name="button"),@FindBy(xpath="//input[@type='button']")})
		private WebElement saveButton;
		 
		
		public NewOrgInfoPageClass(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		public WebElement getIndDD()
		{
			return IndustryDD;
			
		}
		
		public WebElement gethText() {
			return hText;
		}
		public WebElement getSaveButton() {
			return saveButton;
		}
		
		public void industrydd(String orgName)
		{
			Select select=new Select(IndustryDD);
			select.selectByVisibleText(orgName);
		}
		public String hText1() {
			String arr=(String)hText.getText();
			String arr1[]=arr.split(" ");
			String value=arr1[0];
			String value1=arr1[1];
			String value2=arr1[2];
			String value3=arr1[3];
			return value3;
		}


		
}

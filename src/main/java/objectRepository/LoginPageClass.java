package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	@FindBy(name="user_name")
	private WebElement username;

	@FindBy(name="user_password")
	private WebElement password;
	
	 @FindBy(id="submitButton")
	 private WebElement loginButton;
	
	public LoginPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void login(String usernameText, String passwordText) {
		username.sendKeys(usernameText);
		password.sendKeys(passwordText);
		loginButton.click();
	}

	
    	
    }

    
    

	
		
	
	



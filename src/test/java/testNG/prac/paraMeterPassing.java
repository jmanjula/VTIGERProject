package testNG.prac;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.testng.annotations.Parameters;
		import org.testng.annotations.Test;

		import io.github.bonigarcia.wdm.WebDriverManager;
		
		public class paraMeterPassing 
		{

			WebDriver driver1;

			
			@Test
			@Parameters("Browser")
			public void launchbrowser(String browser)
			{

				if(browser.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					 driver1 = new ChromeDriver();
				}
				if(browser.equals("firefox"))
				 {
					WebDriverManager.firefoxdriver().setup();
					 driver1 = new FirefoxDriver();
				}
				else {
					System.out.println("Invalid respone");
				}
				driver1.get("https://facebook.com");



			}
		}
	
		


	




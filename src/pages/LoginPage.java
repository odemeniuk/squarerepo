package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{
	static String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	By EmailField = By.id("email");
    By PasswordField = By.id("passwd");
    By SubmitLoginButton = By.id("SubmitLogin");

	public LoginPage(WebDriver driver){
		super(driver);
		driver.navigate().to(url);
	}
	
	public MyAccountPage loginWithCredentials(String email, String password){
		driver.findElement(EmailField).sendKeys(email);
		driver.findElement(PasswordField).sendKeys(password);
		driver.findElement(SubmitLoginButton).click();
		return new MyAccountPage(driver);
	}

}

package pages;

import org.openqa.selenium.WebDriver;

public class IdentityPage extends AbstractPage{
	static String url = "http://automationpractice.com/index.php?controller=identity";

	public IdentityPage(WebDriver driver){
		super(driver);
	}

}

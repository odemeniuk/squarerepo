package pages;

import org.openqa.selenium.WebDriver;

public class AddressesPage extends AbstractPage{
	static String url = "http://automationpractice.com/index.php?controller=addresses";

	public AddressesPage(WebDriver driver){
		super(driver);
	}

}

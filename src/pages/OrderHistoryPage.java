package pages;

import org.openqa.selenium.WebDriver;

public class OrderHistoryPage extends AbstractPage{
	static String url = "http://automationpractice.com/index.php?controller=history";	

	public OrderHistoryPage(WebDriver driver){
		super(driver);
	}

}

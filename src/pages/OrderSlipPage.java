package pages;

import org.openqa.selenium.WebDriver;

public class OrderSlipPage extends AbstractPage{
	static String url = "http://automationpractice.com/index.php?controller=order-slip";	

	public OrderSlipPage(WebDriver driver){
		super(driver);
	}

}

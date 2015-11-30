package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends AbstractPage{
    static String url = "http://automationpractice.com/index.php?controller=my-account";
    By OrderHistoryAndDetailsButton = By.cssSelector("");
    By MyCreditSlipsButton = By.cssSelector("");
    By MyAddressesButton = By.cssSelector("");
    By MyPersonalInformationButton = By.cssSelector("");
    By MyWishListsButton = By.cssSelector("");
    By HomeButton = By.cssSelector("");
    
	public MyAccountPage(WebDriver driver){
		super(driver);
	}
    
}

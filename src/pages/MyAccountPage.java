package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends AbstractPage{
    static String url = "http://automationpractice.com/index.php?controller=my-account";
    By OrderHistoryAndDetailsButton = By.cssSelector("a[title=\"Orders\"]");
    By MyCreditSlipsButton = By.cssSelector("");
    By MyAddressesButton = By.cssSelector("");
    By MyPersonalInformationButton = By.cssSelector("");
    By MyWishListsButton = By.cssSelector("");
    By HomeButton = By.cssSelector("");
    
	public MyAccountPage(WebDriver driver){
		super(driver);
	}
	
	public OrderHistoryPage clickOnOrderHistoryAndDetails(){
		driver.findElement(OrderHistoryAndDetailsButton).click();
		return new OrderHistoryPage(driver);
	}
	
	public OrderSlipPage clickOnMyCreditSlips(){
		driver.findElement(MyCreditSlipsButton).click();
		return new OrderSlipPage(driver);
	}
	
	public AddressesPage clickOnMyAddresses(){
		driver.findElement(MyAddressesButton).click();
		return new AddressesPage(driver);
	}
	
	public IdentityPage clickOnMyPersonalInformation(){
		driver.findElement(MyPersonalInformationButton).click();
		return new IdentityPage(driver);
	}
	
	public MyWishlistPage clickOnMyWishLists(){
		driver.findElement(MyWishListsButton).click();
		return new MyWishlistPage(driver);
	}
	
	//click on Home button below
	
	//click on Home icon above
    
}

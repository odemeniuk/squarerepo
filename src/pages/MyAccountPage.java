package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends AbstractPage{
    static String url = "http://automationpractice.com/index.php?controller=my-account";
    By OrderHistoryAndDetailsButton = By.cssSelector("a[title='Orders']");
    By MyCreditSlipsButton = By.cssSelector("a[title='Credit slips']");
    By MyAddressesButton = By.cssSelector("a[title='Addresses']");
    By MyPersonalInformationButton = By.cssSelector("a[title='Information']");
    By MyWishListsButton = By.cssSelector("a[title='My wishlists']");
    By HomeButton = By.xpath("//div[@id='center_column']/ul/li/a/span");
    By HomeIcon = By.cssSelector("a.home");
    
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
	
	public HomePage clickOnHome(){
		driver.findElement(HomeButton).click();
		return new HomePage(driver);
	}
	
	public HomePage clickOnHomeIcon(){
		driver.findElement(HomeIcon).click();
		return new HomePage(driver);
	}
    
}

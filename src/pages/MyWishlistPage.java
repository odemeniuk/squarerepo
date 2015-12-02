package pages;

import org.openqa.selenium.WebDriver;

public class MyWishlistPage extends AbstractPage{
	static String url = "http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist";	

	public MyWishlistPage(WebDriver driver){
		super(driver);
	}

}

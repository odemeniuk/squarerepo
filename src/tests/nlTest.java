package tests;

import org.junit.Test;
import org.testng.Assert;

import utils.AbstractContainer;
import pages.LoginPage;
import pages.MyAccountPage;

public class nlTest extends AbstractContainer{
	
	@Test
	public void testMethod(){
		LoginPage onLoginPage = new LoginPage(driver);
		MyAccountPage onMyAccountPage = onLoginPage.loginWithCredentials("rttededer69@mai.ua", "KJhnjre7886%4");
		onMyAccountPage.clickOnOrderHistoryAndDetails();
		Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=history"));
	}
	
}

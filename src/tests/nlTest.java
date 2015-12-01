package tests;

import org.junit.Test;

import utils.AbstractContainer;
import pages.LoginPage;
import pages.MyAccountPage;

public class nlTest extends AbstractContainer{
	
	@Test
	public void testMethod(){
		LoginPage onLoginPage = new LoginPage(driver);
		MyAccountPage onMyAccountPage = onLoginPage.loginWithCredentials("rttededer69@mai.ua", "KJhnjre7886%4");
	}
	
}

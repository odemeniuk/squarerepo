package utils;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractContainer{
	
	protected WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown(){
		driver.close();
	}

}

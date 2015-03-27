package com.azam.framework.config;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
/**
*
* @author Saiful Azam
* @email saifulazamny@gmail.com
*
*/
public class Config {

	protected WebDriver driver;
	private App espn;
	
	@Before
	public void setUp() {
		driver = new HtmlUnitDriver();
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(Constant.URL);
	}

	@After
	public void pageClose() {
		driver.quit();
	}

	public App espn() {
		if (espn == null) {
			espn = new App(driver);
		}
		return espn;
	}

}

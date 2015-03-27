package com.azam.framework.controllers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.azam.framework.controllers.BaseController;
/**
*
* @author Saiful Azam
* @email saifulazamny@gmail.com
*
*/
public class Navigation extends BaseController {

	public Navigation(WebDriver driver) {
		super(driver);
	}
	
	public void mainNav(String mainNavName){
		WebElement nav = driver.findElement(By.xpath("//*[@id='nav-main']/*/ul/li/a[text()='"+mainNavName+"']"));
		nav.click();
	}
	
	public void pageTitleVerify(String expactedResult){
		String actual = driver.getTitle();
		Assert.assertEquals(expactedResult, actual);
	}
	
	public void mainSubNav(String mainSubNav){
		WebElement nav = driver.findElement(By.xpath(".//*[@id='nav-wrapper-container']/div/ul/li/a[text()='"+mainSubNav+"']"));
		nav.click();
	}
	
	public void tobNav(String topNav){
		WebElement nav = driver.findElement(By.xpath("//*[@class='top-bar']/div/ul/li/a[text()='"+topNav+"']"));
		nav.click();
	}

}

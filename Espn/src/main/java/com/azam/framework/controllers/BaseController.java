package com.azam.framework.controllers;

import org.openqa.selenium.WebDriver;
/**
*
* @author Saiful Azam
* @email saifulazamny@gmail.com
*
*/
public class BaseController {

	protected WebDriver driver;

	public BaseController(WebDriver driver) {
		this.driver = driver;
	}

}

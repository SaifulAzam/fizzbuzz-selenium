package com.azam.framework.config;

import org.openqa.selenium.WebDriver;
import com.azam.framework.controllers.Navigation;
/**
*
* @author Saiful Azam
* @email saifulazamny@gmail.com
*
*/

public class App {

	private WebDriver driver;
        private Navigation navigation;

	public App(WebDriver driver) {
		this.driver = driver;
	}
		
	public Navigation navigation(){
		if (navigation == null) {
			navigation = new Navigation(driver);
		}
		return navigation;
	}

}

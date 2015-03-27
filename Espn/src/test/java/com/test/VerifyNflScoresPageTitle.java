package com.test;

import org.junit.Test;

import com.azam.framework.config.Config;
/**
*
* @author Saiful Azam
* @email saifulazamny@gmail.com
*
*/
public class VerifyNflScoresPageTitle extends Config {
	
	@Test
	public void verifyNflScoresPageTitle(){
		espn().navigation().mainNav("NFL");
		espn().navigation().mainSubNav("Scores");
		espn().navigation().pageTitleVerify("NFL Scoreboard");
	}

}

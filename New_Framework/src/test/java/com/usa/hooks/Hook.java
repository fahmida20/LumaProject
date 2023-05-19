package com.usa.hooks;

import com.usa.basepage.SuperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends SuperClass{
	@Before
	public void setUp() {
		log.info(">>>>>>>>>>START AUTOMATION<<<<<<<<<<<<<");
		SuperClass.initialization();
		
	}
	
	@After
	public void tearDown() {
		log.info(">>>>>>>>>>>END AUTOMATION<<<<<<<<<<<<<<");
		driver.quit();
	}

}

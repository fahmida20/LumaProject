package com.usa.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;  // import from apachipoy log4j
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public SuperClass() {
		log = Logger.getLogger("Automation Engineer:");
		PropertyConfigurator.configure("log4j.properties");       //copy log4j file name and paste
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/usa/config/config.properties");   //copy config properties properties
			prop.load(ip);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally { // Must executed
			System.out.println("The finally statement is executed file is found");
		}
}
			
	
	
	public static void initialization() { 
		String browserName = prop.getProperty("browserName");
		if (browserName.equalsIgnoreCase("Chrome")) {
			log.info(">>>>>>>>>>>>>Automation Statrs with Chrome browser <<<<<<<<<<<");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
		} else if (browserName.equalsIgnoreCase("Edge")) {
			log.info(">>>>>>>>>>>>>Automation Statrs with Safari browser <<<<<<<<<<<");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		
			
		
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			log.info(">>>>>>>>>>>>>Automation Statrs with firefox browser <<<<<<<<<<<");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	
				}
		
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     //implicitwait declare as Global level
		  driver.get(prop.getProperty("URL"));
		   
		  
		   
	}

}

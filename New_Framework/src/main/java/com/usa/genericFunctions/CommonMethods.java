package com.usa.genericFunctions;

import java.io.File;
import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.usa.basepage.SuperClass;

public class CommonMethods extends SuperClass{
	
	public static void mouseHoverOver(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}
	
	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
	
	//we can call by class name from Stepdefination
	
	public static void jsClick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",ele);
		
	}
	
	//for dropdown handle by select class
	public static void dropdown(WebElement ele, String Text) {
		Select slct = new Select(ele);
		slct.selectByVisibleText(Text);
	}
	
	// how to handle by multiple elements from dropdown menu (list of interface)
	
	public static void handleDropdown(List<WebElement>ele,String Text) {
		//List<WebElement> select = driver.findElements(By.xpath("(//*[@class='select'])[1]/option"));
		List<WebElement> select= ele;
		for (WebElement value: select) {
			String listOfDropdown = value.getText();
			if (listOfDropdown.equalsIgnoreCase(Text)) {
				CommonMethods.actionClick(value);
			}
		}
		
	}
	
	public static void getPageRefresh() {
		driver.navigate().refresh();
		
	}
	
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver; //takeScreen shot is interface
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./ScreenShot/" + screenshotName + ".png")); // change the sceenshot folder name copy and paste here
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}

}

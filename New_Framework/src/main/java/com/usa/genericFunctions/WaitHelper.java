package com.usa.genericFunctions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.usa.basepage.SuperClass;

public class WaitHelper extends SuperClass{                   //explicitwait we use every line of code
	public static void seleniumWait(WebElement ele) {           // how to write webdriverwait and single element
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		}
	//for multiple elements
	public static void waitUntilVisibilityOfElements(List<WebElement>ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}

}

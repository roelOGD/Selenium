package org.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticClass {
	 public static WebDriver driver = new FirefoxDriver();
	  
	 public WebDriver getDriver(){
	         System.out.println("Driver "+driver);
	         return driver;
	     }
}

package org.POM;

import org.DDT.ExcelLib;
import org.openqa.selenium.WebDriver;

public class GoogleSearchTest extends StaticClass{
	
	
	@Override
	public WebDriver getDriver() {
		return super.getDriver();
	}
	
	public static void main (String[] args) throws InterruptedException{
		ExcelLib excel = new ExcelLib("C:\\Users\\Roel\\Desktop\\SeleniumExcel.xls");
		// Ga naar google.com
		driver.navigate().to("http://google.com");

		// Object for the page
		// GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		GoogleHomePageObjects page = new GoogleHomePageObjects();
		page.SearchGoogle(excel.GetCellValue(0, 2));
		
		Thread.sleep(5000);
		// Click op de link Selenium web Automation
		SeleniumPageObjects selPage = page.ClickSelenium();
		
		// Wait for page to load
		Thread.sleep(5000);
		
		// Click op de download knop
		selPage.ClickDownload();
		
		//selPage.NavigateHome();
				
	} 
}

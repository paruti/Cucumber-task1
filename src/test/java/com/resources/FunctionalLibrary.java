package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parthi Rajan\\eclipse-workspace\\lenin\\cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
}
	public void insertValue(WebElement ele,String value) {
		
		ele.sendKeys(value);

	}
	
	public void button(WebElement ele) {

		ele.click();
		
	}
	

}

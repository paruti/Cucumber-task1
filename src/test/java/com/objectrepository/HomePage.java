package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {

	
	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	public WebElement addCustomer;


	public WebElement getAddCustomer() {
		return addCustomer;
	}
}

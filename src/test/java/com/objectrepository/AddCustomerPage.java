package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddCustomerPage extends FunctionalLibrary {
	
	public AddCustomerPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//label[text()='Done']")
	public WebElement bgCheck;
	
	
	@FindBy(id="fname")
	public WebElement fName;
	
	@FindBy(id="lname")
	public WebElement lName;
	
	@FindBy(name="emailid")
	public WebElement eMail;
	
	@FindBy(name="addr")
	public WebElement address;
	
	@FindBy(id="telephoneno")
	public WebElement phoneNo;
	
	public WebElement getBgCheck() {
		return bgCheck;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(name="submit")
	public WebElement submit;


}

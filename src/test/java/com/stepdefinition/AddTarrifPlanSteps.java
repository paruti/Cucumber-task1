package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTarrifPlanSteps {
		
		static WebDriver driver;
		
	@Given("user should launch the telecom home page")
	public void user_should_launch_the_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Parthi Rajan\\eclipse-workspace\\lenin\\cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user need to click on add tariff plan")
	public void user_need_to_click_on_add_tariff_plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	   
	}

	@When("user need to fill all the required details")
	public void user_need_to_fill_all_the_required_details()  {
		driver.manage().window().maximize();
		driver.findElement(By.name("rental")).sendKeys("6995");
		driver.findElement(By.id("local_minutes")).sendKeys("120");
		driver.findElement(By.id("inter_minutes")).sendKeys("120");
		driver.findElement(By.id("sms_pack")).sendKeys("100");
		driver.findElement(By.id("minutes_charges")).sendKeys("1");
		driver.findElement(By.id("inter_charges")).sendKeys("1");
		driver.findElement(By.id("sms_charges")).sendKeys("1");
	 
	}
	
	@When("user need to fill all the required details by oneDim list")
	public void user_need_to_fill_all_the_required_details_by_oneDim_list(DataTable datas) {
		
		List<String> data = datas.asList(String.class);
		driver.manage().window().maximize();
		driver.findElement(By.name("rental")).sendKeys(data.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(data.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(data.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(data.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(data.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(data.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(data.get(6));
	    
	}
	
	@When("user need to fill all the required details by oneDim map")
	public void user_need_to_fill_all_the_required_details_by_oneDim_map(DataTable datas) {
	    Map<String, String> data = datas.asMap(String.class,String.class);
	    driver.manage().window().maximize();
		driver.findElement(By.name("rental")).sendKeys(data.get("mlyrental"));
		driver.findElement(By.id("local_minutes")).sendKeys(data.get("frlmins"));
		driver.findElement(By.id("inter_minutes")).sendKeys(data.get("frimins"));
		driver.findElement(By.id("sms_pack")).sendKeys(data.get("frspack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(data.get("lpminscrgs"));
		driver.findElement(By.id("inter_charges")).sendKeys(data.get("intminscrgs"));
		driver.findElement(By.id("sms_charges")).sendKeys(data.get("smsprcrgs"));
	    
	}


	@When("user should click on submit button in Tariff details")
	public void user_should_click_on_submit_button_in_Tariff_details() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	}

	@Then("tariff plan added details should be displayed")
	public void tariff_plan_added_details_should_be_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='Home'])[1]")).isDisplayed());
	   
	}


	






}




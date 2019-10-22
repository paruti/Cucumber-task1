package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("user should be in telecom home page")
	public void user_should_be_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Parthi Rajan\\eclipse-workspace\\lenin\\cucumber\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	 }
	@Given("user need to click on add customer button")
	public void user_need_to_click_on_add_customer_button() {
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   }
	@When("user need to fill all the feilds")
	public void user_need_to_fill_all_the_feilds() {
		
		driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
          
			
		 
          driver.findElement(By.id("fname")).sendKeys("karthi");
         driver.findElement(By.id("lname")).sendKeys("rajan");
         driver.findElement(By.id("email")).sendKeys("karthi@gmail.com");
         driver.findElement(By.name("addr")).sendKeys("tanjore");
         driver.findElement(By.id("telephoneno")).sendKeys("123445");
		}
	
	@When("user need to fill all the feilds by oneDim List")
	public void user_need_to_fill_all_the_feilds_by_oneDim_List(DataTable datas) {
		
		List<String> data = datas.asList(String.class);
		driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
 
        driver.findElement(By.id("fname")).sendKeys(data.get(0));
       driver.findElement(By.id("lname")).sendKeys(data.get(1));
       driver.findElement(By.id("email")).sendKeys(data.get(2));
       driver.findElement(By.name("addr")).sendKeys(data.get(3));
       driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
		
		
	 
	}
	
	@When("user need to fill all the feilds by oneDim Map")
	public void user_need_to_fill_all_the_feilds_by_oneDim_Map(DataTable datas) {
		
		Map<String, String> data = datas.asMap(String.class, String.class);
		driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
 
        driver.findElement(By.id("fname")).sendKeys(data.get("fname"));
       driver.findElement(By.id("lname")).sendKeys(data.get("lname"));
       driver.findElement(By.id("email")).sendKeys(data.get("mail"));
       driver.findElement(By.name("addr")).sendKeys(data.get("addr"));
       driver.findElement(By.id("telephoneno")).sendKeys(data.get("phno"));
		
		
	 
	}

	@When("user should click on submit button")
	public void user_should_click_on_submit_button() {
	  
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
	@Then("user should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	  }
	}

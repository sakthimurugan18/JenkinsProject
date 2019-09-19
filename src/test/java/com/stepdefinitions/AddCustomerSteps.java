package com.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {

	static WebDriver driver = null;

	@Given("User should be in the telecom home pages")
	public void user_should_be_in_the_telecom_home_pages() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Selenium-workspace\\CucumberBasic\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();

	}

	@Given("click add customer buttons")
	public void click_add_customer_buttons() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User enter all the data.")
	public void user_enter_all_the_data(DataTable ltable) {
		List<String> Lists = ltable.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(Lists.get(0));
		driver.findElement(By.id("lname")).sendKeys(Lists.get(1));
		driver.findElement(By.id("email")).sendKeys(Lists.get(2));
		driver.findElement(By.name("addr")).sendKeys(Lists.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(Lists.get(4));
	}

	@When("User enter all the data for map.")
	public void user_enter_all_the_data_for_map(DataTable mtable) {
		Map<String, String> Maps = mtable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(Maps.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(Maps.get("lname"));
		driver.findElement(By.id("email")).sendKeys(Maps.get("email"));
		driver.findElement(By.name("addr")).sendKeys(Maps.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(Maps.get("phno"));
	}

	@When("click on submit buttons")
	public void click_on_submit_buttons() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("user should be displayed customer id is enteredd")
	public void user_should_be_displayed_customer_id_is_enteredd() {
		WebElement cstId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		Assert.assertTrue(cstId.isDisplayed());
		driver.quit();

	}

}

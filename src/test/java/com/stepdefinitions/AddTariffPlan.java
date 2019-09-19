package com.stepdefinitions;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffPlan {

	static WebDriver driver;

	@Given("User should be in the telecom home page")
	public void user_should_be_in_the_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Selenium-workspace\\CucumberBasic\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("click add customer button")
	public void click_add_customer_button() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("User enter all the data value.")
	public void user_enter_all_the_data_value(DataTable data) {
		List<List<String>> lists = data.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(lists.get(2).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(lists.get(2).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(lists.get(2).get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(lists.get(2).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(lists.get(2).get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(lists.get(2).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(lists.get(2).get(6));

	}

	@When("User enter all the data values.")
	public void user_enter_all_the_data_values(DataTable datas) {

		List<Map<String, String>> map = datas.asMaps(String.class, String.class);

		driver.findElement(By.id("rental1")).sendKeys(map.get(3).get("MothRen"));
		driver.findElement(By.id("local_minutes")).sendKeys(map.get(3).get("LO"));
		driver.findElement(By.id("inter_minutes")).sendKeys(map.get(3).get("IM"));
		driver.findElement(By.id("sms_pack")).sendKeys(map.get(3).get("SMS"));
		driver.findElement(By.id("minutes_charges")).sendKeys(map.get(3).get("LC"));
		driver.findElement(By.id("inter_charges")).sendKeys(map.get(3).get("IC"));
		driver.findElement(By.id("sms_charges")).sendKeys(map.get(3).get("SC"));
	}

	@When("User enter all the data value of outline {string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_all_the_data_value_of_outline(String monthRent, String loMins, String inMins, String smsPack,
			String lpMins, String iPmins, String spCharge) {
		driver.findElement(By.id("rental1")).sendKeys(monthRent);
		driver.findElement(By.id("local_minutes")).sendKeys(loMins);
		driver.findElement(By.id("inter_minutes")).sendKeys(inMins);
		driver.findElement(By.id("sms_pack")).sendKeys(smsPack);
		driver.findElement(By.id("minutes_charges")).sendKeys(lpMins);
		driver.findElement(By.id("inter_charges")).sendKeys(iPmins);
		driver.findElement(By.id("sms_charges")).sendKeys(spCharge);

	}

	@When("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("user should be displayed customer id is entered")
	public void user_should_be_displayed_customer_id_is_entered() {

		WebElement sucess = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
		String txt = sucess.getText();
		System.out.println(txt);
		driver.quit();
	}
}
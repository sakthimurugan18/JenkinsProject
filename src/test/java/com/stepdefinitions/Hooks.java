package com.stepdefinitions;

import cucumber.api.java.Before;

public class Hooks {

	@Before("@Second")
	public void beforeFirst() {
		System.out.println("This will run only before the First Scenario");
	}

	@Before("@First")
	public void beforeSecond() {
		System.out.println("This will run only before the Second Scenario");
	}

	@Before("@Third")
	public void beforeThird() {
		System.out.println("This will run only before the Third Scenario");
	}

}

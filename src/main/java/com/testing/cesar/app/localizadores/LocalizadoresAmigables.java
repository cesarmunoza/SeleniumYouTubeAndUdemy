package com.testing.cesar.app.localizadores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocalizadoresAmigables {
	public static void main(String[] args) {
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.google.com/");
		driverFirefox.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_A"))).click();
	}

}

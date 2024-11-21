package com.testing.cesar.app.localizadores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalizadoresTradicionales {
	public static void main(String[] args) {
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.google.com/");
		driverFirefox.findElement(By.id("APjFqb"));
		
		driverFirefox.findElement(By.className("gLFyf"));
		
		
		
		driverFirefox.quit();
	}

}

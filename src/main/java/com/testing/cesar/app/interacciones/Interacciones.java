package com.testing.cesar.app.interacciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Interacciones {
	public static void main(String[] args) {
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.amazon.com/");
		driverFirefox.manage().window().maximize();
		
		//Send keys
		driverFirefox.findElement(By.id("twotabsearchtextbox")).sendKeys("Nintendo");
		
		//clear
//		driverFirefox.findElement(By.id("twotabsearchtextbox")).clear();
		
		//click
		driverFirefox.findElement(By.id("nav-search-submit-button")).click();
	}

}

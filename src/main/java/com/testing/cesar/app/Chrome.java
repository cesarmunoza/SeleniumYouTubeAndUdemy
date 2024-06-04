package com.testing.cesar.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome {
	public static void main(String[] args) {
		System.setProperty(
				"webdriver.Chrome",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		System.out.println(chromeDriver.getCurrentUrl());
	}
	
}

package com.testing.cesar.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validandodrivers {	
	public static void main(String[] args) {
		
		//*********************************Validación del driver de chrome*********************************
//		System.setProperty(
//		"webdriver.Chrome.driver",
//		"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
//		WebDriver chromeDriver = new ChromeDriver();
//		chromeDriver.get("https://www.google.com");
//		chromeDriver.manage().window().maximize();
//		System.out.println("Título de la página: " + chromeDriver.getTitle());
//		System.out.println("URL: "+ chromeDriver.getCurrentUrl());
		
		//*********************************Validación del driver de edge*********************************
//		System.setProperty(
//				"webdriver.edge.driver",
//				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\edgedriver_win64\\msedgedriver.exe");
//				
//				WebDriver edgeDriver = new EdgeDriver();
//				edgeDriver.get("https://www.google.com");
//				edgeDriver.manage().window().maximize();
//				System.out.println("Título de la página: " + edgeDriver.getTitle());
//				System.out.println("URL: "+ edgeDriver.getCurrentUrl());
		
		
		//*********************************Validación del driver de firefox*********************************
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.google.com");
		driverFirefox.manage().window().maximize();
		System.out.println("Título de la página: " + driverFirefox.getTitle());
		System.out.println("URL: "+ driverFirefox.getCurrentUrl());
		

	}

}

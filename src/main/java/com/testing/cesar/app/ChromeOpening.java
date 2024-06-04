package com.testing.cesar.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ChromeOpening {
	public static void main(String[] args) {
//		System.setProperty(
//				"webdriver.Chrome",
//				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://tuhistoriapersonal.com/");
		chromeDriver.manage().window().maximize();
		
		System.out.println("Título de la página: "+chromeDriver.getTitle());
		System.out.println("URL: "+chromeDriver.getCurrentUrl());
		//System.out.println("URL: "+chromeDriver.getPageSource());
		
		//Close the browser
		chromeDriver.close();
		
		//*********************************************************************************//
		
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://google.com/");
		edgeDriver.manage().window().maximize();
		
		System.out.println("Título de la página: "+edgeDriver.getTitle());
		System.out.println("URL: "+edgeDriver.getCurrentUrl());
		//System.out.println("URL: "+chromeDriver.getPageSource());
		
		//Close the browser
		edgeDriver.close();
	}
	
}

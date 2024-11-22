package com.testing.cesar.app.cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.google.com/");
		driverFirefox.manage().window().maximize();
		
		Cookie galleta1 = driverFirefox.manage().getCookieNamed("OGPC");
		System.out.println(galleta1);
		
		Set<Cookie> galletas =  driverFirefox.manage().getCookies();
		System.out.println(galletas);
		
		driverFirefox.manage().deleteAllCookies();
	}
	

}

package com.testing.cesar.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FirefoxOpening {
	public static void main(String[] args) {
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://ksiro.co");
		driverFirefox.manage().window().maximize();
		
		System.out.println("Título de la página: "+driverFirefox.getTitle());
		System.out.println("URL: "+driverFirefox.getCurrentUrl());
		
		driverFirefox.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("cmuñoz");
		WebDriverWait wait = new WebDriverWait(driverFirefox, Duration.ofSeconds(10));
		WebElement passwordField = driverFirefox.findElement(By.xpath("//input[@formcontrolname='password']"));
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		if (passwordField.isDisplayed() && passwordField.isEnabled()) {
			passwordField.sendKeys("cmuñoz12");
		}else {
			System.out.println("El campo de contraseña no está disponible para interactuar");
		}
		
		String loginButtonXpath = "//button[@type='submit']";
		System.out.println("Xpath del botón ingresar: "+ loginButtonXpath);
		
		loginButton.click();
		
		//driverFirefox.close();
		//driverFirefox.quit();
		
		//Comentado porque esta instrucción trae todo el código fuente de la página y es largo
		//System.out.println("PageSource: "+driverFirefox.getPageSource());
		
		//driverFirefox.findElement(By.xpath("//*[@id=\"wpforms-submit-8715\"]")).click();
		
		//Customized Xpath:
		//Syntax: "//tagname[@attribute='value'"
		
		//Close the browser
		//driverFirefox.close();

	}
	
}

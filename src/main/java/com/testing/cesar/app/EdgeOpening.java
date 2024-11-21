package com.testing.cesar.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class EdgeOpening {
	public static void main(String[] args) {
		System.setProperty(
		"webdriver.edge.driver",
		"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\edgedriver_win64\\msedgedriver.exe");
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://ksiro.co");
		edgeDriver.manage().window().maximize();
		
		System.out.println("Título de la página: "+edgeDriver.getTitle());
		System.out.println("URL: "+edgeDriver.getCurrentUrl());
		
		edgeDriver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("cmuñoz");
		WebDriverWait wait = new WebDriverWait(edgeDriver, Duration.ofSeconds(10));
		WebElement passwordField = edgeDriver.findElement(By.xpath("//input[@formcontrolname='password']"));
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		if (passwordField.isDisplayed() && passwordField.isEnabled()) {
			passwordField.sendKeys("cmuñoz12");
		}else {
			System.out.println("El campo de contraseña no está disponible para interactuar");
		}
		
		String loginButtonXpath = "//button[@type='submit']";
		System.out.println("Xpath del botón ingresar: "+ loginButtonXpath);
		
		loginButton.click();
		
		
		
		//Comentado porque esta instrucción trae todo el código fuente de la página y es largo
		//System.out.println("PageSource: "+edgeDriver.getPageSource());
		
		//edgeDriver.findElement(By.xpath("//*[@id=\"wpforms-submit-8715\"]")).click();
		
		//Customized Xpath:
		//Syntax: "//tagname[@attribute='value'"
		
		//Close the browser
		//edgeDriver.close();

	}
	
}

package com.testing.cesar.app.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TipoWaits {
	public static void main(String[] args) {
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		
		//Implicit Wait
//		driverFirefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			
//		driverFirefox.get("https://ksiro.co");
//		driverFirefox.manage().window().maximize();
//		driverFirefox.findElement(By.className("fa-solid fa-eye"));
		
		//explicit Wait funcionando
//		driverFirefox.get("https://www.google.com/");
//		driverFirefox.manage().window().maximize();
//		WebElement image = driverFirefox.findElement(By.className("gLFyf"));
//		Wait<WebDriver> wait = new WebDriverWait(driverFirefox, Duration.ofSeconds(5));
//		wait.until(imageShow -> image.isDisplayed());
//		driverFirefox.findElement(By.className("gLFyf")).sendKeys("selenium");
		
		//fluent wait funcionando
//		driverFirefox.get("https://www.google.com/");
//		driverFirefox.manage().window().maximize();
//		WebElement image = driverFirefox.findElement(By.className("gLFyf"));
//		Wait<WebDriver> wait = new FluentWait<>(driverFirefox)
//				.withTimeout(Duration.ofSeconds(2))
//				.pollingEvery(Duration.ofMillis(300))
//				.ignoring(ElementNotInteractableException.class);
//		wait.until(d -> {
//			image.sendKeys("Selenium");
//			return true;
//		});
		
	}

}

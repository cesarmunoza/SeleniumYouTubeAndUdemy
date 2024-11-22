package com.testing.cesar.app.alertas;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertas {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://es.javascript.info/alert-prompt-confirm");
		driverFirefox.manage().window().maximize();
		
		//alerta funcionando
//		driverFirefox.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[1]/div/div[1]/div[1]/a")).click();
//		Wait<WebDriver> wait = new WebDriverWait(driverFirefox, Duration.ofSeconds(5));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		String text = alert.getText();
//		//alert.accept(); //Aquí se queda la alerta sin aceptar, para aceptarla, descomentar
//		System.out.println(text);
		
		//Alerta tipo confirmar
		driverFirefox.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[1]/div/div[1]/div[1]/a")).click();
		Wait<WebDriver> wait = new WebDriverWait(driverFirefox, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driverFirefox.switchTo().alert();
		String text2 = alert2.getText();
		alert2.dismiss();
		System.out.println(text2);
		
		//

	}

}

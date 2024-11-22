package com.testing.cesar.app.navegacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navegacion {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.amazon.com/");
		driverFirefox.manage().window().maximize();

		//ir a
		driverFirefox.navigate().to("https://www.youtube.com/playlist?list=PLas30d-GGNa3u75NvrERTYfcqJJ2s8lRu");
		
		//regrasar
		driverFirefox.navigate().back();
		
		//adelantar
		driverFirefox.navigate().forward();
		
		//Actualizar
		driverFirefox.navigate().refresh();
	}

}

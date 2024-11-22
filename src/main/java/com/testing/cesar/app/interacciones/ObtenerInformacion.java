package com.testing.cesar.app.interacciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v121.domsnapshot.model.Rectangle;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObtenerInformacion {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.amazon.com/");
		driverFirefox.manage().window().maximize();

		// Regresa un valor booleano si el elemento se ha mostrado
		boolean deliveryVisible = driverFirefox.findElement(By.id("glow-ingress-block")).isDisplayed();
		System.out.println(deliveryVisible);

		// Regresa un valor booleano si el elemento está disponible
		boolean searchBox = driverFirefox.findElement(By.id("twotabsearchtextbox")).isEnabled();
		System.out.println(searchBox);

		//Regresa verdadero o falso si se seleccionó el checkbox input radio button etc
		driverFirefox.findElement(By.id("icp-nav-flyout")).click();
		driverFirefox.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/span/span")).click();
		
		boolean lengSeleccionado = 
				driverFirefox.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[1]/div[1]/div[3]/div/label/input")).isSelected();
		System.out.println(lengSeleccionado);
		
		//Regresa el tagname del elemento input, span, div, i, etc
		String tagName =driverFirefox.findElement(By.id("twotabsearchtextbox")).getTagName();
		System.out.println(tagName);
		
		org.openqa.selenium.Rectangle logo = driverFirefox.findElement(By.id("nav-logo-sprites")).getRect();
		System.out.println(logo.getX());
		System.out.println(logo.getY());
		System.out.println(logo.getWidth());
		System.out.println(logo.getHeight());
		
		String valoresCSS = driverFirefox.findElement(By.className("a-button-inner")).getCssValue("box-shadow");
		System.out.println(valoresCSS);
		
		//Regresa el texto del componente
		String texto = driverFirefox.findElement(By.id("icp-language-translation-text")).getText();
		System.out.println(texto);
		
	}

}

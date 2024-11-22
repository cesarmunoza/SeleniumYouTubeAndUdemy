package com.testing.cesar.app.buyingsimulation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExitoBuy {
	public static void main(String[] args) {
		System.setProperty(
				"webdriver.gecko.driver",
				"D:\\Estudio\\Udemy\\TestingWorkspaceSTS\\Drivers\\20 de noviembre 2024\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.exito.com/");
		driverFirefox.manage().window().maximize(); //maximisa la página
		
		System.out.println("Título de la página: "+driverFirefox.getTitle());
		System.out.println("URL: "+driverFirefox.getCurrentUrl());
		
		//Entra a mi cuenta
		driverFirefox.findElement(By.xpath("/html/body/div[1]/header/section/div/div[2]/div[2]/a/span")).click();
		
		//Elige: entrar con correo y password
		WebDriverWait wait = new WebDriverWait(driverFirefox, Duration.ofSeconds(10));//espera 10 segundos
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div[4]/div/div/div/div[2]/div/div[1]/div[1]/ul/li[1]/div/button/div/span")));
		button.click();
		
		//pone las credenciales y entra con click
		driverFirefox.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[4]/div/div/div/div[2]/div/div[2]/div/div/form/div[1]/label/div/input")).sendKeys("cesare.munoz@gmail.com");
		driverFirefox.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[4]/div/div/div/div[2]/div/div[2]/div/div/form/div[2]/div/label/div/input")).sendKeys("Taekwondo1");
		driverFirefox.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[4]/div/div/div/div[2]/div/div[2]/div/div/form/div[4]/div/button/div/span")).click();
		
		//en el campo de texto ingresa xbox
		WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-testid='store-input']")));
		searchField.sendKeys("xbox");
		driverFirefox.findElement(By.xpath("/html/body/div[1]/header/section/div/div[1]/div[2]/form/button")).click();//clic en la lupa
				
		//Clic en el primer elemento
		WebElement firstItemLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/section[3]/div/div[2]/div[2]/div[2]/ul/li[1]/article/div[1]/div[1]/div/a")));
		firstItemLink.click();
		
		
		
		

//		WebElement passwordField = driverFirefox.findElement(By.xpath("//input[@formcontrolname='password']"));
//		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
//		if (passwordField.isDisplayed() && passwordField.isEnabled()) {
//			passwordField.sendKeys("cmuñoz12");
//		}else {
//			System.out.println("El campo de contraseña no está disponible para interactuar");
//		}
//		
//		String loginButtonXpath = "//button[@type='submit']";
//		System.out.println("Xpath del botón ingresar: "+ loginButtonXpath);
//		
//		loginButton.click();
//		
		//driverFirefox.close();
		//driverFirefox.quit();
		
		//Comentado porque esta instrucción trae todo el código fuente de la página y es largo
		//System.out.println("PageSource: "+driverFirefox.getPageSource());
		
		//driverFirefox.findElement(By.xpath("//*[@id=\"wpforms-submit-8715\"]")).click();
		
		//Customized Xpath:
		//Syntax: "//tagname[@attribute='value'"	

	}
	
}

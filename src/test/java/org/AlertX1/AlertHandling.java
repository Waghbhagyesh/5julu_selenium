package org.AlertX1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// ___launch driver and web
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		Type 1 (only accept alert)

//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Alert Alt=driver.switchTo().alert();
//		System.out.println(Alt.getText());
//		Alt.accept();

//		Type 2 (accept or dismiss alert)

//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Alert alt=driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
//		alt.dismiss();
//		WebElement ele=driver.findElement(By.id("result"));
//		System.err.println(ele.getText());

//		Type 3(Accept||Dismiss with sendkeys)
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alt1 = driver.switchTo().alert();
		alt1.sendKeys("Got It___*");
		alt1.accept();
		WebElement ele = driver.findElement(By.id("result"));
		System.out.println(ele.getText());

	}

}

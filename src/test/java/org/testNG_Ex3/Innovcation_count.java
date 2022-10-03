package org.testNG_Ex3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Innovcation_count {
	WebDriver driver;
	@Test(invocationCount=2)
	public void Creatcust() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
}

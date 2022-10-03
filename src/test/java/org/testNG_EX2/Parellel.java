package org.testNG_EX2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Parellel {
	
	WebDriver driver;
	
//	@BeforeSuite
//	public void suit() {
//		
//	}
	@BeforeClass
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@placeholder=\"Password\"]")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
	}
	@Test
	public void pageUrl(){

		String Url=driver.getCurrentUrl();

		if (Url.equals("http://localhost/user/submit_tt.do")) {
			System.out.println("Page Url verified");
		}else {
			System.out.println("Page Url unverified");
		}
		System.out.println("Actual Title = "+Url);

	}
	@Test
	public void pageTitle() {
		String Title=driver.getTitle();

		if (Title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("Page Title verified");
		}else {
			System.out.println("Page Title unverified");
		}
		System.out.println("Actual Title = "+Title);

	}
	@AfterClass
	public void Logout() {
		WebElement logout=driver.findElement(By.id("logoutLink"));
		if(logout.isDisplayed() && logout.isEnabled()) {
			logout.click();
			System.out.println("logout is displayed and selected");
		}else {
			System.out.println("logout is  not displayed");
		}
	}
//	@AfterSuite
//	public void suitEnd() {
//		driver.quit();
//	}

}

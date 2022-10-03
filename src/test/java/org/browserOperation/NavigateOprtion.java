package org.browserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateOprtion {
	private WebDriver driver;
	@Test
	public void initial(){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		String url="https://www.flipkart.com";
		driver.get(url);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("http://localhost/login.do");
	}
	
	@Test
	public void Navigate() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		String url="https://www.flipkart.com";
		driver.get(url);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		driver.navigate().to("http://localhost/login.do");

	}
}

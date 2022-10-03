package org.browserOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateOprtion2 {
	static WebDriver driver;
	public static void main(String []args){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		String url="https://www.google.co.in/";
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@class='a4bIc']//*[@class='gLFyf gsfi']")).sendKeys("flipkart",Keys.ENTER);
		
		
		;
		

	}
	

}

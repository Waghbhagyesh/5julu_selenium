package org.dropDownEx2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWithoutSelectDDL {
	static WebDriver driver;
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.id("close-fixedban")).click();
		WebElement Multi=driver.findElement(By.className("css-1wa3eu0-placeholder"));
		Multi.click();
		driver.findElement(By.xpath("//*[text()='Another root option']")).click();
		

	}

}

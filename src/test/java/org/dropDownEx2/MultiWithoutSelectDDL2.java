package org.dropDownEx2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWithoutSelectDDL2 {
	static WebDriver driver;
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ej2.syncfusion.com/demos/#/bootstrap5/multi-select/default.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Multi=driver.findElement(By.xpath("//*[text()=' Default Mode']/following-sibling::div[@class]"));
		Multi.click();
		Multi.sendKeys("Rug");
//		driver.findElement(By.xpath("//*[@class='e-multi-hidden']//*[text()='0']")).click();
//		driver.findElement(By.xpath("//div[text()='Red']")).click();j
//		driver.findElement(By.xpath("//div[text()='Black']")).click();
//		

	}

}

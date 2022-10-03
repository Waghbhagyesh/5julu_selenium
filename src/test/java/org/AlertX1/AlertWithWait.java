package org.AlertX1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("timerAlertButton")).click();
//		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(5));
//		wt.until(ExpectedConditions.alertIsPresent());

		baseUtil.BaseUtilities.bu.isAlertPresent(driver, 5);

		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

}

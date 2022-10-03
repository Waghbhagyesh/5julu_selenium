package org.dropDownEx1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelctWithotMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/register");

		WebElement ddlEle = driver.findElement(By.id("input-country"));
		Select drpCountry = new Select(ddlEle);

		List<WebElement> alloptions = drpCountry.getOptions();
		for (WebElement option : alloptions) {
			if (option.getText().equals("Cuba")) {
				option.click();
				break;
			}
		}
	}
}

package org.dropDownEx1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/register");

//Same Logic To handle dropdown with div tag and Same For Without Select Class

		List<WebElement> allOption = driver.findElements(By.xpath("//select[@name='country_id']//option"));

		System.out.println(allOption.size());

		for (int i = 0; i < allOption.size(); i++) {
//			System.out.println(allOption.get(i).getText());
			if (allOption.get(i).getText().contains("Yugoslavia")) {
				allOption.get(i).click();
				break;
			}
		}

	}

}

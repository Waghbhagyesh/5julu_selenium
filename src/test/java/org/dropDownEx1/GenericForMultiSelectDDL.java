package org.dropDownEx1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericForMultiSelectDDL {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");

		/*
		 * if there is multiple DDL in same page so don't need to create select class
		 * for each used generic method
		 * 
		 * create webelement for each DDL and call generic method and give input
		 */
//		SelectoptionFromDropDown(ele,value);
	}

	public static void SelectoptionFromDropDown(WebElement ele, String value) {

		Select drp = new Select(ele);
		List<WebElement> alloptions = drp.getOptions();
		for (WebElement option : alloptions) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}
}

package org.dropDownEx1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDDL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

		WebElement ddl = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(ddl);

//		sel.selectByVisibleText("Blue");
//		System.out.println(sel.getFirstSelectedOption().getText());
//		sel.selectByValue("5");
//		sel.selectByIndex(0);
		List<WebElement> Allopt = sel.getOptions();
		ArrayList<String> allOptTxt = new ArrayList<String>();
		for (int i = 0; i < Allopt.size(); i++) {
			System.out.println(Allopt.get(i).getText());
			allOptTxt.add(Allopt.get(i).getText());
		}
//	driver.close();

	}

}

package org.dropDownEx1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericForMultiSelectDDL2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement day = driver.findElement(By.xpath("//*[@class='_n3']//select[@id='day']"));
		SelectoptionFromDropDown(day, "11");

		WebElement month = driver.findElement(By.xpath("//*[@class='_n3']//select[@id='month']"));
		SelectoptionFromDropDown(month, "July");

		WebElement year = driver.findElement(By.xpath("//*[@class='_n3']//select[@id='year']"));
		SelectoptionFromDropDown(year, "1995");
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

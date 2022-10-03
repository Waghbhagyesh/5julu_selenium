package org.dropDownEx2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDDL {
	static WebDriver driver;
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.id("close-fixedban")).click();
		WebElement coloursDDL=driver.findElement(By.id("oldSelectMenu"));
		coloursDDL.click();

		Select sel=new Select(coloursDDL);
		System.out.println(sel.getFirstSelectedOption().getText()); 
		List<WebElement> allOptions=sel.getOptions();
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}
		sel.selectByVisibleText("Yellow");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		

	}

}

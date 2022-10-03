package org.dropDownEx2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDDL2 {
	static WebDriver driver;
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.id("close-fixedban")).click();
		
		WebElement carsDDL=driver.findElement(By.id("cars"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", carsDDL);
//		BaseUtilities.bu.scrollTillElement(carsDDL, driver);
		carsDDL.click();

		Select sel=new Select(carsDDL);
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Opel");
		sel.selectByVisibleText("Audi");
		List<WebElement>allSelectedOpt=sel.getAllSelectedOptions();
		for(int i=0;i<allSelectedOpt.size();i++) {
			String Opt=allSelectedOpt.get(i).getText();
			System.out.println(Opt);
		}
		sel.deselectByVisibleText("Saab");
		sel.deselectAll();
	}

}

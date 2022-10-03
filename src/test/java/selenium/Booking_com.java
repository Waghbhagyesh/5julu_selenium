package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_com {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		
		String Actual=driver.getTitle();
		System.out.println(Actual);

		
//		List<WebElement> region=driver.findElements(By.xpath("//*[contains(@class,' ia_section_item')]"));
//		System.out.println(region.size());
//		for(int i=0;i<region.size();i++) {
//			System.out.println(region.get(i).getText());
//			System.out.println();
//		}
		
//		driver.findElement(By.xpath("//*[@id='ss']")).sendKeys("GOA");
//		driver.findElement(By.xpath("//*[@class='sb-searchbox__button ']")).click();
		
		
		

	}

}

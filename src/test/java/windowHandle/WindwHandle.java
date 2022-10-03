package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindwHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWind=driver.getWindowHandles();
		Iterator<String> itr=allWind.iterator();
	
		String id1=itr.next();
		System.out.println(id1);
		String id2=itr.next();
		System.out.println(id2);
		driver.switchTo().window(id2);
		String sample=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(sample);
		
		
	}

}

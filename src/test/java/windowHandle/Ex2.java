package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
	static WebDriver driver;
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("close-fixedban")).click();
		String Id=driver.getWindowHandle();
		System.out.println(Id);
		driver.findElement(By.id("tabButton")).click();
		Set<String> allId=driver.getWindowHandles();
		Iterator <String> itr= allId.iterator();
		String id1=itr.next();
		System.out.println(id1);
		String id2=itr.next();
		System.out.println(id2);
	
		driver.switchTo().window(id2);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		
		
		
	}

}

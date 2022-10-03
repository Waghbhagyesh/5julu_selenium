package iFrameHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameNestedt {
	static WebDriver driver;
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.findElement(By.id("close-fixedban")).click();
//		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().frame("frame1");
		WebElement ele=driver.findElement(By.id("sampleHeading"));
		System.out.println(ele.getText());

	}

}

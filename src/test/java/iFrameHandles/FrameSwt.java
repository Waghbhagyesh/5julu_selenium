package iFrameHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameSwt {
	static WebDriver driver;
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.eduvidya.com/");
		driver.findElement(By.xpath("//a[text()='Schools']")).click();
		driver.switchTo().frame("aswift_3");
		driver.switchTo().frame("ad_iframe");
		driver.findElement(By.id("dismiss-button")).click();
		WebElement Category=driver.findElement(By.id("ddl_Category"));
		Select ddl_Category=new Select(Category);
		ddl_Category.selectByVisibleText("International School");
		WebElement City=driver.findElement(By.id("ddl_City"));
		Select ddl_City=new Select(City);
		ddl_City.selectByVisibleText("Jalgaon");
		driver.findElement(By.id("btnSearch")).click();
		
		
		
//		System.out.println(ele.getText());
		
	}
	
}

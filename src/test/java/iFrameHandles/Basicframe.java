package iFrameHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		WebElement ele=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(ele);      //switch with WebElement
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();  //traverse to parent frame
		String Text1=driver.findElement(By.xpath("//div[@id='framesWrapper']/div")).getText();
		System.out.println(Text1);
		
		driver.switchTo().frame(2);        //by index
//		driver.switchTo().frame("frame2"); //by name of frame   
		String text2=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text2+" "+"2nd frame Text");
		
		driver.switchTo().defaultContent();  //traverse to main frame
		
		
		


	}

}

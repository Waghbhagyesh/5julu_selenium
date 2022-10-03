package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import baseUtil.BaseUtilities;

public class Launch {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", "G:\\Eclipse_Workspace_Selenium\\SeleniumR\\driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		String URL="https://www.flipkart.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("7741828361");
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Bhagyesh@5452");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']/span[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//		WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]"));
		//		BaseUtilities.bu.clickByJS(ele, driver);
		//		System.out.println(ele.getText());

		Actions act=new Actions(driver);
		WebElement more=driver.findElement(By.xpath("//div[@class='exehdJ']"));
		act.click(more).build().perform();
		WebElement not=driver.findElement(By.xpath("//div[@class='_3vhnxf' and text()='Notification Preferences']"));
		act.click(not).perform();




		//		List<WebElement>total=driver.findElements(By.xpath("//*[@class='eFQ30H']"));
		//		System.out.println(total.size());
		//		for(int i=0;i<total.size();i++) {
		//			
		//			System.out.println(total.get(i).getText());
		//		}




	}

}

package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenaricWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		driver.findElement(By.id("tabButton")).click();

		Set<String> allWind=driver.getWindowHandles();
		Iterator<String> itr=allWind.iterator();
		while(itr.hasNext()) {
			String id1=itr.next();
			if(!id1.equals(parentId)){
				driver.switchTo().window(id1);
				System.out.println(id1);
				try {
					String sample=driver.findElement(By.id("sampleHeading")).getText();
					System.out.println(sample);

				}catch(Exception e){
					System.out.println("Switching to another window ");
				}


			}
		}
	}

}

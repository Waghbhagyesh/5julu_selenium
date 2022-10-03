package extraKnow;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUpHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		/*Syntax = driver.get("https:username:password@test.com"); */
		
		driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");
		String Text=driver.findElement(By.className("example")).getText();
		System.out.println(Text);
	}

}

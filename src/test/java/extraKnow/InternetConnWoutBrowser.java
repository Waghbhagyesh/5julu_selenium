package extraKnow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InternetConnWoutBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Eclipse_Workspace_Selenium\\July_Selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
	      //headless parameter
		opt.addArguments("headless");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().to("https://www.google.com");

		WebElement error = driver.findElement(By.className("error-code"));

		if(error.getText().equals("DNS_PROBE_FINISHED_NO_INTERNET") || error.getText().equals("ERR_NAME_NOT_RESOLVED")) {
			System.out.println("No Internet Connection");
		} else {
			System.out.println("Internet Connected");
		}

		driver.close();

	}

}

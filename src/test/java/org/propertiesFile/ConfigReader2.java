package org.propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.Utility.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfigReader2 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		ConfigReader2 obj=new ConfigReader2();
		String browser=obj.getDataFromConfig("browserName");
		String url=obj.getDataFromConfig("url");
		String Uname=obj.getDataFromConfig("userName");
		String psw=obj.getDataFromConfig("passWord");
		
		
		driver=BaseUtilities.bu.startup(url, browser);
		driver.findElement(By.id("username")).sendKeys(Uname);;
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(psw);
		driver.findElement(By.id("loginButton")).click();
	}
	public String getDataFromConfig(String key) throws IOException {
		
			FileInputStream  read = new FileInputStream("./PropertiesFile/config.properties/");
			Properties prop=new Properties();
			prop.load(read);
			String value=prop.getProperty(key);
			return value;
			
	}

}

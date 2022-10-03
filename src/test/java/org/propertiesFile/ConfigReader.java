package org.propertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static void main(String[] args) throws Exception {
		FileInputStream read=new FileInputStream("./PropertiesFile/config.properties");
		Properties prop=new Properties();
		prop.load(read);
		String Text=prop.getProperty("browserName");
		System.out.println(Text);
		

	}

}

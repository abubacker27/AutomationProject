package com.abu.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LaunchProperties {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Heera\\eclipse-workspace\\AutomationProject\\"
				+ "src\\test\\resources\\Test.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String property = prop.getProperty("HomeUrl");
		System.out.println(property);
		System.out.println(prop.getProperty("UserName"));
		

	}

}

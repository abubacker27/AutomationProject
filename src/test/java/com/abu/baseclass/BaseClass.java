package com.abu.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void loadUrl(String Url) {
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	public static  WebElement getElementByXpath(String locator) {
		return driver.findElement(By.xpath(locator));
	}
	public static WebElement getElementById(String id) {
		return driver.findElement(By.id(id));
	}
	public static String excelReadCell(int rowNumber, int columnNumber) throws IOException{
		File file = new File("C:\\Users\\Heera\\OneDrive\\Desktop\\MAVEN\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);

		Sheet sheet = wk.getSheet("Sheet1");
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(columnNumber);

		String value = cell.getStringCellValue();
		return value;
	}
	public static String getProperty(String Key) throws IOException {
		File file = new File("C:\\Users\\Heera\\eclipse-workspace\\AutomationProject\\src\\test\\resources\\"
				+ "Credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String property = prop.getProperty(Key);
		return property;
	}
	public static void closeBrowser() {
		driver.close();
	}
	
	
	

}

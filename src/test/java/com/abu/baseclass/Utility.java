package com.abu.baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void screenShot(WebDriver driver, String name) throws IOException{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenShotAs = ts.getScreenshotAs(OutputType.FILE);
		File screenshot = new File("C:\\Users\\Heera\\OneDrive\\Desktop\\SELENIUM\\SCREENSHOT\\"+name+".png");
		FileHandler.copy(screenShotAs, screenshot);	
	}

}

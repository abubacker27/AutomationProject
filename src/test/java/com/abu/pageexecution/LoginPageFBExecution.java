package com.abu.pageexecution;

import java.io.IOException;

import com.abu.baseclass.BaseClass;
import com.abu.pagefactory.LoginPageFB;

public class LoginPageFBExecution {

	public static void main(String[] args) throws IOException {

		//        BaseClass.browserLaunch();
		//        BaseClass.loadUrl("https://www.facebook.com/");
		//        BaseClass.getElementById("email").sendKeys("Abu");
		//        BaseClass.getElementById("pass").sendKeys("2545");
		//        BaseClass.getElementByXpath("//button[@name=\"login\"]").click();
		//        BaseClass.closeBrowser();


//		BaseClass.browserLaunch();
//		BaseClass.loadUrl(BaseClass.getProperty("FacebookUrl"));
//		LoginPageFB lp = new LoginPageFB();
//		BaseClass.getElementById(lp.userName).sendKeys(BaseClass.getProperty("UserName"));
//		BaseClass.getElementById(lp.passWord).sendKeys(BaseClass.getProperty("Password"));
//		BaseClass.getElementByXpath(lp.loginBtn).click();
//		BaseClass.closeBrowser();
		
//		BaseClass.browserLaunch();
//		BaseClass.loadUrl("https://www.online.citibank.co.in/");
//		BaseClass.getElementByXpath("//a[@title='Close']").click();
//		BaseClass.closeBrowser();
		
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.getProperty("CitiBankUrl"));
		LoginPageFB lpc = new LoginPageFB();
		BaseClass.getElementByXpath(lpc.citiAlert).click();
		BaseClass.closeBrowser();
	}
}

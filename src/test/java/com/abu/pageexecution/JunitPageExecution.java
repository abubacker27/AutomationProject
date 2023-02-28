package com.abu.pageexecution;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.abu.baseclass.BaseClass;
import com.abu.pagefactory.JunitPage;

import junit.framework.Assert;

public class JunitPageExecution {
	@BeforeClass
	public static void beforeClass() {   // static only for before Class
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	@Before
	public void beforeMethod() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.getProperty("FacebookUrl"));
		System.out.println("Launch FB ");
	}
	@After
	public void afterMethod() {
		BaseClass.closeBrowser();
		System.out.println("FB Closed");
	}
	@Test
	public void validCredential() {
		try{
			JunitPage jp = new JunitPage();
			jp.userName.sendKeys(BaseClass.getProperty("UserName"));
			jp.passWord.sendKeys(BaseClass.getProperty("Password"));
			jp.loginBtn.click();
			// validation - Assertion
			Assert.assertTrue(true);
			System.out.println("Login Done");

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	@Ignore
	public void inValidCredential() {
		try{
			JunitPage jp = new JunitPage();
			jp.userName.sendKeys(BaseClass.getProperty("UserName"));
			jp.passWord.sendKeys(BaseClass.getProperty("Password"));
			jp.loginBtn.click();
			// validation - Assertion
			Assert.assertTrue(true);
			System.out.println("Login Done");

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


	@Test
	public void testSignUpLink() throws IOException {

		String expected = "https://www.facebook.com/reg/";
		//		BaseClass.browserLaunch();
		//		BaseClass.loadUrl(BaseClass.fileRead("facebookUrl"));
		JunitPage jp = new JunitPage();
		jp.singUpLink.click();
		String actual = BaseClass.getUrl();
		String value = "https://www.facebook.com/";
		Assert.assertEquals(expected, actual);
		System.out.println("SignUp Done");
	}

}

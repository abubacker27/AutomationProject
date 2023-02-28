package com.abu.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abu.baseclass.BaseClass;

public class HomePageDetail extends BaseClass {
	
	public HomePageDetail() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title=\"Close\"]")
	public WebElement popUp2;
	
	@FindBy(xpath="//span[@class=\"txtSign\"]")
	public WebElement logIn2;
	
	@FindBy(xpath="//span[text()='Offers']")
	public WebElement Offers2;

}

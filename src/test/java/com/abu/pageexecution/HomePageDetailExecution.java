package com.abu.pageexecution;

import java.io.IOException;

import com.abu.baseclass.BaseClass;
import com.abu.pagefactory.HomePageDetail;

public class HomePageDetailExecution {

	public static void main(String[] args) throws IOException {
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.getProperty("CitiBankUrl"));
		HomePageDetail hp = new HomePageDetail();
//		BaseClass.getElementByXpath(hp.popUp).click();
		hp.popUp2.click();
//		BaseClass.getElementByXpath(hp.Offers).click();
		hp.Offers2.click();
		//validation
		BaseClass.closeBrowser();

		
		
		

	}

}

package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.PageFactory;


import pages.WatchPage;

public class WatchPageTest extends TestBase{
	
	WatchPage watchPage;
	
	@BeforeClass
	public void init() {
		watchPage = PageFactory.initElements(driver, WatchPage.class);
		
	}
	
	@Test
	public void verifyCategories() {
		Assert.assertFalse(watchPage.findCategories());
	}

}

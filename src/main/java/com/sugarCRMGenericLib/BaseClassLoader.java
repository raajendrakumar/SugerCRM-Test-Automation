package com.sugarCRMGenericLib;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import com.sugerCRMPageObjectLib.CreateOrganization;
import com.sugerCRMPageObjectLib.CreateSubmission;
import com.sugerCRMPageObjectLib.HomePage;
import com.sugerCRMPageObjectLib.SugarCRMLogin;

public class BaseClassLoader extends WebDriverCommonLib {

	public SugarCRMLogin slgn;
	public HomePage home;
	public CreateOrganization crtOrg;
	public CreateSubmission crtSubm;
	public String expectedvalue;
	public String actualvalue;
	public WebDriverCommonLib wcl;

	@BeforeClass
	public void LoadMethods() throws Exception {
		try {
			logger.info("Started Loading Methods");
			home = PageFactory.initElements(driver, HomePage.class);
			wcl = PageFactory.initElements(driver, WebDriverCommonLib.class);
			crtOrg = PageFactory.initElements(driver, CreateOrganization.class);
			crtSubm = PageFactory.initElements(driver, CreateSubmission.class);
			ast = new SoftAssert();
			logger.info("Completed Loading Methods");
			wcl.waitforpageload();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

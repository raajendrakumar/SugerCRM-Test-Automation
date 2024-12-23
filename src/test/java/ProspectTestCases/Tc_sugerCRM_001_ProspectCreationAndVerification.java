package ProspectTestCases;

import java.util.HashMap;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sugarCRMGenericLib.BaseClassLoader;
import com.sugarCRMGenericLib.WebDriverCommonLib;

@Listeners(com.sugarCRMGenericLib.SampleListner.class)
public class Tc_sugerCRM_001_ProspectCreationAndVerification extends BaseClassLoader {

	@Test(priority = 1)
	public void ProspectCreationAndVerificationtestCase1() throws Exception {
		// HashMap<String, String> prospectdata = new HashMap<String, String>();
		home.prospect();
		crtOrg.clickOnAddressTab();
		Thread.sleep(3000);

		/*
		 * String companyinc = "StgTest_" + WebDriverCommonLib.getTimeStamp();
		 * prospectdata.put("companyName", "companyinc");
		 * crtOrg.enterCompanyName(prospectdata.get("companyName")); Thread.sleep(3000);
		 */
		// ExcelLib ProsData = new ExcelLib("C:\\D Drive\\TestData\\ProspectData.xlsx");

		/*
		 * Thread.sleep(3000); home.clickonExpandMenu(); Thread.sleep(3000);
		 * home.clickonExpandMenu2(); Thread.sleep(3000);
		 * home.clickonOrganisationButton(); Thread.sleep(3000);
		 * home.clickOnOrganisationList(); Thread.sleep(3000);
		 * home.clickOnCreateOrganisationList(); Thread.sleep(3000);
		 * home.entercompanyName();
		 */
		/*
		 * int rows = ProsData.getlastrownum("PhysicalAddress");
		 * System.out.println(rows); for (int n = 1; n <= 2; n++) {
		 * prospectdata.put("Physical Street", ProsData.Excelread("RetailerBulkData", n,
		 * 0)); prospectdata.put("Physical City", ProsData.Excelread("RetailerBulkData",
		 * n, 1)); prospectdata.put("Physical State",
		 * ProsData.Excelread("RetailerBulkData", n, 2));
		 * prospectdata.put("Physical Postal Code",
		 * ProsData.Excelread("RetailerBulkData", n, 3)); Thread.sleep(500);
		 * crtOrg.entersPhyStreetfld(prospectdata.get("Physical Street"));
		 * Thread.sleep(500);
		 * 
		 * }
		 */
	}
}

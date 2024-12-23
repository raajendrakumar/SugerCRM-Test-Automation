
package com.sugerCRMPageObjectLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.sugarCRMGenericLib.WebDriverCommonLib;

public class CreateOrganization extends WebDriverCommonLib {

	public WebDriver driver;
	WebDriverCommonLib wcl = new WebDriverCommonLib();

	// ----------------------Constructor----------------------//
	public CreateOrganization(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------------UI Elements----------------------//

	// ---------For companyNameField-----------//
	@FindBy(how = How.XPATH, using = "//span[@class='record-label' and text()='Company Name']/following::input[@aria-label='Company Name']")
	private WebElement companyName;
	// ---------For Address Tab-----------//
	@FindBy(how = How.XPATH, using = "//div[@class='record tab-layout record-create']//ul//li[2]//a//span[@class='tab-title font-semibold' and text()='Address']")
	private WebElement addressTab;

	// ---For PhysicalStreet---//
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='(Required) Physical Street']")
	private WebElement PhyStreetfld;

	// ---For PhysicalCityfield---//
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='(Required) Physical Street']")
	private WebElement PhyCityfld;

	// ---For PhysicalStatefield ---//
	@FindBy(how = How.XPATH, using = "//input[@placeholder='(Required) Physical City']")
	private WebElement PhyStatefld;

	// ---For PhysicalPostcodeField ---//
	@FindBy(how = How.XPATH, using = "//input[@placeholder='(Required) Physical Postal Code']")
	private WebElement PhyPostcodefld;

	// ------------For SaveButton-------//
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary' and @name='save_button' and contains(text(), 'Save')]")
	private WebElement savebtn;

	// ----------------------Functions----------------------//

	// Functions

	public void clickOnAddressTab() {
		buttonClick(addressTab);
	}

	public void enterCompanyName(String company) {
		entervalue(company, companyName);
	}

	public String getCompanyName() {
		return getvalue(companyName);
	}

	public void enterPhyStreet(String street) {
		entervalue(street, PhyStreetfld);
	}

	public String getPhyStreet() {
		return getvalue(PhyStreetfld);
	}

	public void enterPhyCity(String city) {
		entervalue(city, PhyCityfld);
	}

	public void enterPhyState(String state) {
		entervalue(state, PhyStatefld);
	}

	public void enterPhyPostcode(String postcode) {
		entervalue(postcode, PhyPostcodefld);
	}

	public void clickOnSaveBtn() {
		buttonClick(savebtn);
	}

}

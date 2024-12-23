package com.sugerCRMPageObjectLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sugarCRMGenericLib.WebDriverCommonLib;


public class CreateSubmission extends WebDriverCommonLib {

	WebDriver driver;

	// ----------------------Constructor----------------------//
	public CreateSubmission(WebDriver driver) throws Exception {
		this.driver = driver;
	}
	// ----------------------UI Elements----------------------//

	// ---For Select company name---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline record-label' and @data-name='tai_captives_opportunities_1_name']/preceding::span[contains(text(),'Captive')]/following::span[@class='normal index' and @data-fieldname ='tai_captives_opportunities_1_name' ]//a[@class='select2-choice select2-default']/span[@class='select2-chosen']")
	private WebElement capName;

	// ---For Programming Manager---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline record-label' and @data-name='program_manager_c']/span[contains(text(),'Program Manager')]/following::span[@class='normal index' and @data-fieldname ='program_manager_c' ]//a[@class='select2-choice select2-default']/span[@class='select2-chosen']")
	private WebElement promgr;

	// ---For Normal Store Radio button---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline record-label' and @data-name='opportunity_type']/span[contains(text(),'Submission Type')]/following::span[@class='normal index' and @data-fieldname ='opportunity_type']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']")
	private WebElement memtyp;

	// ---For brk---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline record-label' and @data-name='brok_brokers_opportunities_1_name']/span[contains(text(),'Broker')]/following::span[@class='normal index' and @data-fieldname ='brok_brokers_opportunities_1_name']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']")
	private WebElement brk;

	// ---For capexe---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline record-label' and @data-name='captive_executive_1_c']/span[contains(text(),'Captive Executive')]/following::span[@class='normal index' and @data-fieldname ='captive_executive_1_c']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']")
	private WebElement capexe;

	// ---For procor---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline record-label' and @data-name='program_coordinator_c']/span[contains(text(),'Program Coordinator')]/following::span[@class='normal index' and @data-fieldname ='program_coordinator_c']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']")
	private WebElement procor;

	// ---For linbus---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline record-label' and @data-name='line_of_business_c']/span[contains(text(),'Line Of Business')]/following::span[@class='normal index' and @data-fieldname ='line_of_business_c']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']")
	private WebElement linbus;

	// ---For capSearch---//
	@FindBy(how = How.XPATH, using = "//input[contains(@id,'s2id_autogen10_search')]")
	private WebElement capSearch;

	// ---For prostr---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline record-label' and @data-name='pod_structure_c']/span[contains(text(),'Pod Structure')]/following::span[@class='normal index' and @data-fieldname ='pod_structure_c']//a[@class='select2-choice']/span[@class='select2-chosen']")
	private WebElement prostr;

	// ---For brkSearch---//
	@FindBy(how = How.XPATH, using = "//div[@id='select2-drop']//div[@class='select2-result-label'][normalize-space()='Search and Select...']")
	private WebElement brkSearch;

	// ---For brkrad Button---//
	@FindBy(how = How.XPATH, using = "//tr[@name='brok_Brokers_5a2dd210-dbc4-11ee-9700-0050569dedee']//preceding-sibling::td[@class='sticky-column stick-left' and @data-column='brok_Brokers_select']//input[@name='brok_Brokers_select']")
	private WebElement brkrad;

	// ---For caprad---//
	@FindBy(how = How.XPATH, using = "//tr[contains(@name,'Users_9de6d078')]//preceding-sibling::td[@class='sticky-column stick-left' and @data-column='Users_select']//input[@name='Users_select']")
	private WebElement caprad;

	// ---For procorrad---//
	@FindBy(how = How.XPATH, using = "//tr[contains(@name,'Users_cc221428')]//preceding-sibling::td[@class='sticky-column stick-left' and @data-column='Users_select']//input[@name='Users_select']")
	private WebElement procorrad;

	// ---For casuality Status---//
	@FindBy(how = How.XPATH, using = "//input[@name='casualty_status_c']")
	private WebElement casualityStatus;

	// ---For reqfld Search---//
	@FindBy(how = How.XPATH, using = "//div[@id='select2-drop']//div[@class='select2-search']/descendant::input[@type='text']")
	private WebElement reqfldSearch;

	// ---For Additional Names---//
	@FindBy(how = How.XPATH, using = "//input[@name='additional_names_c']")
	private WebElement AdditionalNames;

	// ---For Broker---//
	@FindBy(how = How.XPATH, using = "//div[@id='s2id_autogen952']")
	private WebElement Broker;

	// ---For subName ---//
	@FindBy(how = How.XPATH, using = "//span[@class='record-label' and text()='Submission Name']/following-sibling::span//input[@type='text']")
	private WebElement subName;

	// ---For addresstab ---//
	@FindBy(how = How.XPATH, using = "//input[@id='searchbtn']")
	private WebElement addresstab;

	// ---For effdate---//
	@FindBy(how = How.XPATH, using = "//input[@name='effective_date_c']")
	private WebElement effdate;

	// ---For subNamelk---//
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary' and @role='button' and @name='save_button']")
	private WebElement subNamelk;

	// ---For sublnk1 ---//
	@FindBy(how = How.XPATH, using = "//div[@data-subpanel-link='opportunities']//i[@class='sicon sicon-plus']")
	private WebElement sublnk1;

	// ---For subTab2---//
	@FindBy(how = How.XPATH, using = "//h4[text()='Submissions']")
	private WebElement subTab2;

	// ---For pcsvbtn---//
	@FindBy(how = How.XPATH, using = "//div[@class='ellipsis_inline relate-field-container']//a[contains(@href,'Opportunities')]")
	private WebElement pcsvbtn;

	// ---For ProspectNo---//
	@FindBy(how = How.XPATH, using = "//span[@data-fieldname='pega_case_no_c']/child::span/child::div")
	private WebElement ProspectNo;

	// ----------------------Basic Functions----------------------//

	public void clickOnpcsvbtnBtn() {
		buttonClick(pcsvbtn);
	}

}

package com.sugerCRMPageObjectLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sugarCRMGenericLib.WebDriverCommonLib;

public class HomePage extends WebDriverCommonLib {
	WebDriver driver;
	public static String submissionName = null;

	// ----------------------Constructor----------------------//
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	// ----------------------UI Elements----------------------//
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Log Out']")
	private WebElement SignOut;

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	private WebElement UserName;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement PassWord;

	@FindBy(how = How.XPATH, using = "//div[@id='expand-menu_sidebar-nav-item']/button[@aria-label='Open']//span[contains(@class,'sicon sicon-hamburger')]")
	private WebElement expbtn;

	@FindBy(how = How.XPATH, using = "//button[@aria-label='Organizations menu']//i[@class='sicon sicon-kebab text-white']")
	private WebElement orglt;

	@FindBy(how = How.XPATH, using = "//div[@id='Accounts_sidebar-nav-item']/a[contains(@class,'sidebar-nav-item-btn ')]//span[@class='expanded h-full w-full ellipsis_inline pr-4 text-white']")
	private WebElement orgbtn;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Create Organization']")
	private WebElement crorgdrpdn;
	// ---------For Address Tab-----------//
	@FindBy(how = How.XPATH, using = "//div[@class='record tab-layout record-create']//ul//li[2]//a//span[@class='tab-title font-semibold' and text()='Address']")
	private WebElement addressTab;
	Actions actions;

	// ----------------------Basic Functions----------------------//

	public void clickonExpandMenu() {
		try {
			actions.moveToElement(expbtn).build().perform();
		} catch (Exception e) {
			logger.error("Error clicking on expand menu: " + e.getMessage());
		}
	}

	public void clickonExpandMenu2() {
		try {
			actions.moveToElement(expbtn).click().perform();
		} catch (Exception e) {
			logger.error("Error clicking on expand menu: " + e.getMessage());
		}
	}

	public void clickonOrganisationButton() {
		try {
			actions.moveToElement(orgbtn).perform();

		} catch (Exception e) {
			logger.error("Error clicking on organization button: " + e.getMessage());
		}
	}

	public void clickOnOrganisationList() {
		try {
			buttonClick(orglt);
		} catch (Exception e) {
			logger.error("Error clicking on organization list: " + e.getMessage());
		}
	}

	public void clickOnCreateOrganisationList() {
		try {
			buttonClick(crorgdrpdn);
		} catch (Exception e) {
			logger.error("Error clicking on create organization List: " + e.getMessage());
		}
	}



	public void prospect() {
		try {
			Thread.sleep(3000);
			clickonExpandMenu();
			Thread.sleep(3000);
			clickonExpandMenu2();
			Thread.sleep(3000);
			clickonOrganisationButton();
			Thread.sleep(3000);
			clickOnOrganisationList();
			Thread.sleep(3000);
			clickOnCreateOrganisationList();
			Thread.sleep(5000);
			
			logger.info("Logged in Successfully");
		} catch (Exception e) {
			ast.assertTrue(false, "Unable to Login");
			logger.error("Login Failed: " + e.getMessage());
		}
	}
}

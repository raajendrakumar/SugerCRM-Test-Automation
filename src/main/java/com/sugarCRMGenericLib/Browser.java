package com.sugarCRMGenericLib;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import com.sugerCRMPageObjectLib.SugarCRMLogin;

public class Browser implements Constants {
	public static WebDriver driver;
	public static SugarCRMLogin sclogin;
	private static String UTILS = "Utils";
	public static SoftAssert ast;
	public static Logger logger = Logger.getLogger("LoggerCreation");

	@BeforeSuite
	public void Loadlogfile() throws Exception {
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/Resources/log4j.properties");
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	}

	@BeforeTest
	public void getBrowser() throws Exception {
		if (browser.equalsIgnoreCase("Firefox")) {
			try {
				System.setProperty("webdriver.gecko.driver", UTILS + "\\geckodriver.exe");
				logger.info("Connecting to Firefox browser");
				logger.info("Please close the Excel File if it is Opened");
				driver = new FirefoxDriver();
				logger.info("Opened Firefox Browser");
			} catch (Exception e) {
				logger.error("Unable to Open Firefox Browser " + e.getMessage());
				ast.assertTrue(false, "Unable to Open Firefox Browser " + e.getMessage());
			}

		} else if (browser.equalsIgnoreCase("Chrome")) {
			try {
				// ChromeDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C://Docs//Driver//chromedriver.exe");
				logger.info("Connecting to Chrome browser");
				driver = new ChromeDriver();
				logger.info("Opened  Chrome browser");
			} catch (Exception e) {
				logger.error("Unable to Open Chrome Browser " + e.getMessage());
				ast.assertTrue(false, "Unable to Open Chrome Browser " + e.getMessage());
			}
		} else if (browser.equalsIgnoreCase("edge")) {
			try {
				System.setProperty("webdriver.edge.driver", "C://Docs//Driver//edgedriver.exe");
				logger.info("Connecting to InternetExplorer browser");
				driver = new EdgeDriver();
				logger.info("Opened InternetExplorer browser");
			} catch (Exception e) {
				logger.error("Unable to Open InternetExplorer Browser " + e.getMessage());
				ast.assertTrue(false, "Unable to Open InternetExplorer Browser " + e.getMessage());
			}
		} else {
			System.out.println(" Browser Details not found");
			logger.error("Failed to open browser,Please check Details");
			ast.assertTrue(false, "Failed to open browser,Please check Details");
		}
		try {

			logger.info("Maximizing Browser");
			driver.manage().window().maximize();
			logger.info("Completed Maximizing Browser");
			logger.info("Connecting to Url");
			driver.navigate().to(Constants.url1);
			logger.info("Connected to SugarCRMUrl " + Constants.url1);
		} catch (Exception e) {

			logger.error("Unable to Connect to URl " + e.getMessage());
			ast.assertTrue(false, "Unable to Connect to URl " + e.getMessage());
		}

		sclogin = PageFactory.initElements(driver, SugarCRMLogin.class);
		sclogin.slogin();

	}

	/*
	 * @BeforeMethod public void setup() throws InterruptedException {
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
	 */

}
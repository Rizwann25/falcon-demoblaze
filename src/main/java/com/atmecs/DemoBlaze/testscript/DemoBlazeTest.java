package com.atmecs.DemoBlaze.testscript;

import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.DemoBlaze.constant.FilePathConstants;
import com.atmecs.DemoBlaze.constant.LocatorKeyContainer;
import com.atmecs.DemoBlaze.constant.PropertyReader;
import com.atmecs.DemoBlaze.testsuite.SampleTestSuiteBase;
import com.atmecs.falcon.automation.ui.selenium.Click;
import com.atmecs.falcon.automation.ui.selenium.TextField;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler;

public class DemoBlazeTest extends SampleTestSuiteBase {
	private ReportLogService report = new ReportLogServiceImpl(DemoBlazeTest.class);
	Properties testData = PropertyReader.readProperties(FilePathConstants.USER_PATH);
	String url = testData.getProperty("url");
	
	@Test
	@Parameters({"os", "osVersion", "browser", "browserVersion"})
	public void addToCartPageTest(String os, String osVersion, String br, String browserVersion) throws Exception {
	browser.openURL(url, os, osVersion, br, browserVersion);
	browser.maximizeWindow();

	Click click = browser.getClick();
	report.info("Executing Test ");
	TextField enterText = browser.getTextField();
	report.info("Select Mobile To Buy");
	click.performClick(LocatorType.XPATH, SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.CONTACT_LINK));
}
}

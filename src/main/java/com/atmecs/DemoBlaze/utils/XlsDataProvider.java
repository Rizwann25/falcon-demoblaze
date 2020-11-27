package com.atmecs.DemoBlaze.utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.atmecs.DemoBlaze.constant.FilePathConstants;
import com.atmecs.falcon.automation.util.parser.XlsReader;

public class XlsDataProvider {

	@DataProvider(name="logindata")
	public static Object[][] getLoginData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "rizwan";
		data[0][1] = "riz1234";
		return data;	
	}
	
	public static void main(String[] args) throws IOException {
		XlsReader xlsReader = new XlsReader();
		xlsReader.setPath(FilePathConstants.LOGIN_DATA_XLS_FILEPATH);
		String loginSheet = "login";
		int rowCount = xlsReader.getRowCount(loginSheet);
		int colCount = xlsReader.getColumnCount(loginSheet);
		
		System.out.println("rowCount =" + rowCount);
		System.out.println("colCount =" + colCount);
	}
	
}

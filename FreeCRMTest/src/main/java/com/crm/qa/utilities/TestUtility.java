package com.crm.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtility extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 40;

	public static String TESTDAT_SHEET_PATH = "C:/Users/Murali/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/testdata/FreeCRMTestData1.xlsx";
	static Workbook book;
	static Sheet sheet;

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;

		try {
			file = new FileInputStream(TESTDAT_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		/*
		 * System.out.println( "Columns = " + sheet.getLastRowNum() + "--------" +
		 * "Row = " + sheet.getRow(0).getLastCellNum());
		 */
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss.n").format(new Date());
		// Convert driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Set current directory
		String currentDir = System.getProperty("user.dir");
		// Copy file at destination using old version of import
		// org.apache.commons.io.FileUtils
		// FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" +
		// System.currentTimeMillis() + "_scrn.png"));
		// Copy file at destination using new version of import
		// org.apache.tools.ant.util.FileUtils;
		FileUtils.getFileUtils().copyFile(scrFile, new File(currentDir + "/screenshots/" + dateName + "_scrn.png"));
	}

}

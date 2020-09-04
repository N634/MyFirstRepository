package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {
	@FindBy(xpath="//a[@id='login']")
	WebElement loginButton;
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailElement;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordElement;
	@FindBy(xpath = "//input[@value='Sign In']")
	WebElement signInButton;
	@FindBy(xpath = "//h1[text()='Welcome to Shoppersdrobe']")
	WebElement signInSuccessText;
	@FindBy(id = "logout")
	WebElement logOutElement;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	
	public void enterLoginData() throws IOException {
		loginButton.click();
		//import excel sheet
		File src = new File("c:\\Temp\\ExcelData.xlsx");
		//load the file
		FileInputStream fis = new FileInputStream(src);
		//load the workbook
		workbook = new XSSFWorkbook(fis);
		//load the sheet in which data is stored
		sheet = workbook.getSheetAt(0);
		//import data for Email
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			cell =sheet.getRow(i).getCell(0);
			cell.setCellType(CellType.STRING);
			emailElement.clear();
			emailElement.sendKeys(cell.getStringCellValue());
			//import data for password
			cell = sheet.getRow(i).getCell(1);
			cell.setCellType(CellType.STRING);
			passwordElement.clear();
			passwordElement.sendKeys(cell.getStringCellValue());
		}
		
	}
	public void signIn() {
		signInButton.click();
		
	}
	public void logOut() {
		logOutElement.click();
		
	}

}

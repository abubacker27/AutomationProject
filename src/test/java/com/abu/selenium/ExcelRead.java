package com.abu.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\Heera\\OneDrive\\Desktop\\MAVEN\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);

		Sheet sheet = wk.getSheet("Project");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);

		CellType cellType = cell.getCellType();
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

		Sheet sheet1 = wk.getSheet("Project");
		Row row1 = sheet1.getRow(0);
		Cell cell1 = row1.getCell(1);

		double numericCellvalue = cell1.getNumericCellValue();
		long phNo = (long) numericCellvalue;
		System.out.println(phNo);

		Sheet sheet2 = wk.getSheet("Project");
		Row row2 = sheet2.getRow(0);
		Cell cell2 = row2.getCell(2);
        
		String stringCellValue2 = cell2.getStringCellValue();
		System.out.println(stringCellValue2);









	}

}

package com.abu.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUpdate {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\Heera\\OneDrive\\Desktop\\MAVEN\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		
		Sheet sheet = wk.getSheet("Project");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		cell.setCellValue("APACHE");
		FileOutputStream fos = new FileOutputStream(file);
		wk.write(fos);
		wk.close();
		

	}

}

package com.abu.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteEx {
	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\Heera\\OneDrive\\Desktop\\MAVEN\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		
		Sheet createSheet = wk.createSheet("Project");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("SELENIUM");
		FileOutputStream fos = new FileOutputStream(file);
		wk.write(fos);
		wk.close();
		
		
		
	}

}

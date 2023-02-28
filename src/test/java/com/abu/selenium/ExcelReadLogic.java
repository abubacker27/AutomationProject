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

public class ExcelReadLogic {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\Heera\\OneDrive\\Desktop\\MAVEN\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		Sheet sheet = wk.getSheet("Project");
		int noOfRows = sheet.getPhysicalNumberOfRows();

		for(int i=0;i<noOfRows;i++) {

			Row row = sheet.getRow(i);
			int noOfCells = row.getPhysicalNumberOfCells();
			System.out.println("Total no of Row"+noOfCells);
			for(int j=0; j<noOfCells;j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if(cellType==CellType.STRING) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if(cellType==CellType.NUMERIC) {
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sc = new SimpleDateFormat("E, MMM dd yyyy");
						String format = sc.format(dateCellValue);
						System.out.println(format);
					}
					else {
						double numericValue = cell.getNumericCellValue();
						long numericCellValue = (long) numericValue;
						System.out.println(numericCellValue);
					}

				}
			}

	}
	}
}


package UtlisLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.Baseclass;

public class ExcelReader extends Baseclass{
	public XSSFWorkbook workbook;

	public ExcelReader(String filename) throws IOException {
		File f = new File(filename);
		FileInputStream fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
	}

	public String getDatafromExcelsheet(int sheetindex, int rows, int cells) {

		try 
		{
			return workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getStringCellValue();
		}
		catch (Exception e) 
		{
			double d = workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getNumericCellValue();
			
			return Long.toString((long) d);
		}
	}
	public int countrowsinexcel(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getLastRowNum()+1;
		
	}
	public int countcellsinexcel(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
		
	}

}

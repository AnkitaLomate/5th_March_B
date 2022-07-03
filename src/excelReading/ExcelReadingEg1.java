package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("E:\\Application\\Excel Worksheet.xlsx");
		
		String Name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Name1);
		String Name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(Name2);
		
		double num1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(num1);
		
		boolean result = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
		System.out.println(result);


}}

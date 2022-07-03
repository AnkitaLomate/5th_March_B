package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File MyFile=new File("E:\\Application\\Excel Worksheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		//I WANT TO READ WHOLE COLUMN
		
		//STATIC CODING
		
//		for(int i=0;i<=3;i++)
//		{
//			String value = mysheet.getRow(i).getCell(1).getStringCellValue();
//			System.out.println(value);
//		}
//		
		//DYNAMIC CODING
		
		int lastRowNum = mysheet.getLastRowNum();
		int totalRowCount=lastRowNum;
		System.out.println(totalRowCount);
		
		for(int i=0;i<=totalRowCount-1;i++)
		{
			String value = mysheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);
		}
		
		
		
		

	}

}

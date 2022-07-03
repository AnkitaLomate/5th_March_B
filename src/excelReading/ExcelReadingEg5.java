package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("E:\\Application\\Excel Worksheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		//READ TOTAL SHEET USING STATIC CODING
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}

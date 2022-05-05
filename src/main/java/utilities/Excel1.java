package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 
{
	public static String  getdata(String sheetname, int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream input =new FileInputStream("F:/excelfile/testdata.xlsx");
		String  value=WorkbookFactory.create(input).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}

}

package Coding_Practice.Java_Coding_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Excel_Data {
	
	@Test
	public void readexceldata() throws IOException
	{
		File file =new File("C:\\Users\\Bhushan\\Desktop\\Daily Time Table.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("TimeTable");
		
		XSSFRow row2 = sheet.getRow(2);
		
		XSSFCell cell = row2.getCell(2);
		XSSFCell cell1 = row2.getCell(3);
		
		String Value = cell.getStringCellValue();
		String Value1 = cell1.getStringCellValue();
		
		
		System.out.println("Value found is : "+Value);
		System.out.println("Value found is : "+Value1);
		
		
		System.out.println("************************************");
		
		//To iterate over all data
		
		XSSFSheet sheet1 = workbook.getSheet("TimeTable");
		int rowcount  = sheet1.getLastRowNum();
		
		System.out.println(rowcount);
		for(int i =1;i<rowcount;i++)
		{
			XSSFRow row = sheet1.getRow(i);
			String Testtype = row.getCell(1).getStringCellValue();
			String Testdata1 = row.getCell(2).getStringCellValue();
			String Testdata2 = row.getCell(3).getStringCellValue();
			
			System.out.println(Testtype + " : "+ Testdata1 + " : " +Testdata2);
			
		}
		
		
	}

}

package day43Dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class Dataproviders {
	
	 @DataProvider(name="testdata")
	 public String[][] logintestdata() throws IOException
	 {
		//FileInputStream -- Reading the excel data
		//FileOutpurStream -- Writing the excel data
		
		
		FileInputStream file=new FileInputStream("E://19-sep-23//opencart//testdata//tdata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("total rows"+totalrows);
		System.out.println("total cells"+totalcells);
		
		String[][] data=new String[totalrows][totalcells];
		
		for(int r=1;r<=totalrows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);					
			for(int c=0;c<totalcells;c++)
			{
				DataFormatter formatter=new DataFormatter();
				XSSFCell cell=currentrow.getCell(c);
				data[r-1][c]=formatter.formatCellValue(cell);						
			}
			
		}
		
		workbook.close();
		file.close();
		
		return data;

		
	}
	 
	 //Datprovider2
	 
	 @DataProvider(name="regdata")
	 public String[][] registration() throws IOException
	 {
		//FileInputStream -- Reading the excel data
		//FileOutpurStream -- Writing the excel data
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//testdata//data1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("total rows"+totalrows);
		System.out.println("total cells"+totalcells);
		
		String[][] data=new String[totalrows][totalcells];
		
		for(int r=1;r<=totalrows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);					
			for(int c=0;c<totalcells;c++)
			{
				DataFormatter formatter=new DataFormatter();
				XSSFCell cell=currentrow.getCell(c);
				data[r-1][c]=formatter.formatCellValue(cell);						
			}
			
		}
		
		workbook.close();
		file.close();
		
		return data;

		
	}
	 //Dataprovider3

}

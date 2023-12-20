package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
	
	@Test(dataProvider="testdata")
	public void login(String username, String pswd)
	{
		System.out.println("launch browser");
		System.out.println(username);
		System.out.println(pswd);
		System.out.println("login");
	}

	 @DataProvider(name="testdata")
	 public String[][] logintestdata() throws IOException
	 {
		//FileInputStream -- Reading the excel data
		//FileOutpurStream -- Writing the excel data
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//testdata//data.xlsx");
		
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

}

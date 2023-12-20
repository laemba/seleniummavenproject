package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdatfromexcel {

	public static void main(String[] args) throws IOException {


		//FileInputStream -- Reading the excel data
		//FileOutpurStream -- Writing the excel data
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//testdata//data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("total rows"+totalrows);
		System.out.println("total cells"+totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);					
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				System.out.println(cell.toString()+"   ");
							
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();

		
	}

}

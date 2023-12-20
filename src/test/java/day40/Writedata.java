package day40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {


		//FileInputStream -- Reading the excel data
		//FileOutpurStream -- Writing the excel data
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"//testdata//data1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("mydata");
			
		for(int r=0;r<=3;r++)
		{
			XSSFRow newrow=sheet.createRow(r);
			
			for(int c=0;c<2;c++)
			{
				XSSFCell cell=newrow.createCell(c);

				cell.setCellValue("Welcome");
				
			}
			System.out.println();
		}
		
		
		workbook.write(file);
		workbook.close();
		file.close();

		
	}

}

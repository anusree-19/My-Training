package com;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {

	public static void main(String[] args) throws IOException{
		
		// TODO Auto-generated method stub
		try {
			List<Double> list=new ArrayList<Double>();
			String file= new File("src\\resources\\test.xlsx").getAbsolutePath();
			System.out.println(file);
		File f=new File(file.trim());
		System.out.println(f.exists());
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		Iterator <Row> itr = sheet.iterator();
		while (itr.hasNext()) 
		{
			  Row row = itr.next();
            
			  Iterator <Cell> cellIterator = row.cellIterator();

			  while (cellIterator.hasNext()) 
			  {

				  Cell cell = cellIterator.next();
				  
				  switch (cell.getCellType())
				  {
            
			            case Cell.CELL_TYPE_STRING:
			                System.out.print(cell.getStringCellValue() + "\t \t \t ");
			                break;
			                
			            case Cell.CELL_TYPE_NUMERIC:
			                System.out.print(cell.getNumericCellValue() + "\t \t \t ");
			                list.add(cell.getNumericCellValue());
			                break;
			             default: 
                
				  }
				  
            }
			  System.out.println("");
		}
			 System.out.println("");
				double principal=(Double) list.get(0);
				double interestrate=(Double) list.get(1);
				double year=(Double) list.get(2);
				double amount=principal*interestrate*year;
				System.out.println("Interest = " + amount);
		
		
		} catch (Exception e) {
  
            e.printStackTrace();
        }
		
	

}
	}

package Datadriven_Read;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {
	
	public static void all_Data() throws Throwable {
		
		File f = new File("C:\\Users\\vgirija\\eclipse-workspace\\Maven_project\\target\\userdata.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		//interface       class
		Workbook w = new XSSFWorkbook(fis); //upcasting
		
		Sheet sheetAt = w.getSheetAt(0); //get the excel sheet
		
		//row size- getPhysicalNumberOfRows
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows(); // get row size

		for (int i = 0; i < numberOfRows; i++) {
			
			//get the row- getRow(index)
			
			Row row = sheetAt.getRow(i);
			System.out.println("the row is :row");

			
			//get cell size- getPhysicalNumberOfCells
			
			int numberOfCells = row.getPhysicalNumberOfCells(); //get cell size

			for (int j = 0; j < numberOfCells; j++) {
				
				//get the cell- getCell(index);
				
				Cell cell = row.getCell(j);
				//System.out.println("the num of cell: numberOfCells");

				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String value = cell.getStringCellValue();
					System.out.println(value);
					
					
				}else if (cellType.equals(CellType.NUMERIC)) {
					
					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);
					
					
				}
				
				

			}
			
		}
		
	}
	
	public static void particular_data() throws Throwable {
	
	   System.out.println(":Particular data**");
		
      File f = new File("C:\\Users\\vgirija\\eclipse-workspace\\Maven_project\\target\\userdata.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		//interface       class
		Workbook w = new XSSFWorkbook(fis); //upcasting
		
		Sheet sheetAt = w.getSheetAt(0);
        
		Row row = sheetAt.getRow(3);
		
		
		Cell cell = row.getCell(1);
		

		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
			String value = cell.getStringCellValue();
			System.out.println(value);
			
			
		}else if (cellType.equals(CellType.NUMERIC)) {
			
			double value = cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);
		
		}
	}
		
	public static void main(String[] args) throws Throwable {
		
		all_Data();
		particular_data();
		
	}	
		
		
		
		




	
}



package Datadriven_Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_write {
	
	public void write_data() throws Throwable {
		
		File f = new File("C:\\Users\\vgirija\\eclipse-workspace\\Maven_project\\target\\userdata.xlsx");
        
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet createsheet = w.createSheet("data");
		
		Row createRow = createsheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("giri");
		
		w.getSheet("data").getRow(0).createCell(1).setCellValue("123");
		
		w.getSheet("data").createRow(1).createCell(0).setCellValue("kumaresh");
		 
		w.getSheet("data").getRow(1).createCell(1).setCellValue("456");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
		
	}
	
	public static void main(String[] args) throws Throwable {
		 
		Datadriven_write dw = new Datadriven_write();
		dw.write_data();
		
		
	}

}

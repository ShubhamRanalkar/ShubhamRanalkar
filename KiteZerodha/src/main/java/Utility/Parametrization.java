package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
//1. traditional method
//	    public static void main(String[] args) throws EncryptedDocumentException, IOException {
//      FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Documents\\shubhamexcel.xlsx");
//    	String user = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//	    System.out.println(user);
//	    
//	    String user1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//	    System.out.println(user1);
//
//    }
	    
//2. return method
		public static String getData(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Shubham Automation\\KiteZerodha\\src\\test\\resources\\ZerodhaKite.xlsx");

	    String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	 
	 }

}

package library;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.XSSFWorkBook;

public class Exceldataconfig {
	XSSFWorkBook wb;
	XSSFSheet sheet1;
	
	public Exceldataconfig(String excelpath){
		try{
		File src=new File (excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb= new XSSFWorkBook(fis);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	

}
public String getData(int sheetnumber,int row,int column){
	Sheet1 = wb.getsheetAt(sheetNumber);
	String data = sheet1.getRow(row).getCell(column).getStringCellValue();
}
	
	
}

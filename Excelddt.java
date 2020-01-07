package projectwishbook;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelddt {
	public FileInputStream fis=null;
	public XSSFWorkbook workbook=null;
	public XSSFSheet sheet1=null;
	public XSSFRow row= null;
	public XSSFCell cell = null;
	
	public Excelddt(String excelpath) throws Exception{
		fis=new FileInputStream(excelpath);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
	public String getCelldata(int i ,int colnum,int rownum)
	{
		try{
			sheet1 = workbook.getSheetAt(i);
			row = sheet1.getRow(rownum);
			cell = row.getCell(colnum);
			if(cell.getCellType()== CellType.STRING)
				return cell.getStringCellValue();
			else if(cell.getCellType() == CellType.NUMERIC||cell.getCellType()== CellType.FORMULA)
			{
				String cellvalue = String.valueOf(cell.getNumericCellValue());
			}}
			
	catch(Exception e)	{
		e.printStackTrace();
	}
		return null;
		}
	
	public int getRowcount(int sheetindex){
		int row = workbook.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;
	}
	}




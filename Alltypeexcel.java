package retrivealltype;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alltypeexcel {
	public FileInputStream fis=null;
	public XSSFWorkbook workbook=null;
	public XSSFSheet sheet1=null;
	public XSSFRow row= null;
	public XSSFCell cell = null;
	
	public Alltypeexcel(String excelpath) throws Exception{
		fis=new FileInputStream(excelpath);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
	public String getCelldata(int i ,int colnum,int rownum)
	{
		try{
			sheet1 =workbook.getSheetAt(i);
			row = sheet1.getRow(rownum);
			cell = row.getCell(colnum);
			if(cell.getCellType()== CellType.STRING)
				return cell.getStringCellValue();
			else if(cell.getCellType() == CellType.NUMERIC||cell.getCellType()==CellType.FORMULA)
			{
				String cellvalue = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)){
					
					DateFormat df =new SimpleDateFormat("dd/mm/yy");
					Date da= cell.getDateCellValue();
					cellvalue = df.format(da);
				}
				return cellvalue;
				}else if(cell.getCellType()== CellType.BLANK)
					return "";
				else
					return String.valueOf(cell.getBooleanCellValue());
			}
			
	catch(Exception e)	{
		e.printStackTrace();
		return "No Match value";
	}
		}
	
	public int getRowcount(int sheetindex){
		int row=workbook.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;
	}
	}



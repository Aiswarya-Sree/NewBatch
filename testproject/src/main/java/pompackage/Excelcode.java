package pompackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Excelcode {
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	public static String getStringData(int i, int j ) throws IOException 
	{
		//String file_path = Constants.TESTDATAFILE;
		f=new FileInputStream("C:\\Users\\aiswarya.sree1\\git\\NewBatch\\testproject\\src\\main\\resources\\Testdata.xlsx");
		wb= new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r= sh.getRow(i);
		Cell c= r.getCell(j);
		return c.getStringCellValue();
	}
	public static String getIntegerData(int i, int j) throws IOException 
	{
		//String file_path = Constants.TESTDATAFILE;
		f=new FileInputStream("C:\\Users\\aiswarya.sree1\\git\\NewBatch\\testproject\\src\\main\\resources\\Testdata.xlsx");
		wb= new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r= sh.getRow(i);
		Cell c= r.getCell(j);
		int x= (int) c.getNumericCellValue();
		return String.valueOf(x);
	}
}

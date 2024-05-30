package pomsss1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1code {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int a,int b) throws IOException
	{ 
		f= new FileInputStream("C:\\Users\\Sablals\\eclipse-workspace\\exceptionhandiling\\src\\main\\resources\\testdata.xlsx");
		w=new XSSFWorkbook (f);
		sh =w.getSheet("sheet1");
		Row r =sh.getRow(a);
		Cell c= r.getCell(b);
		return c.getStringCellValue();
	}
public static String getIntegerData(int a,int b) throws IOException 
{
	f= new FileInputStream("C:\\Users\\Sablals\\eclipse-workspace\\exceptionhandiling\\src\\main\\resources\\testdata.xlsx");
	w=new XSSFWorkbook (f);
	sh =w.getSheet("sheet1");
	Row r =sh.getRow(a);
	Cell c= r.getCell(b);
	int x = (int) c.getNumericCellValue();
	return String.valueOf(x);
}



	}



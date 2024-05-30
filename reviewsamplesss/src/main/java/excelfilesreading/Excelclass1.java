package excelfilesreading;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelclass1 {
static FileInputStream f;
static  XSSFWorkbook w;
static  XSSFSheet sh;
public static String getStringData(int a,int b) throws IOException
{
	f = new FileInputStream("C:\\Users\\Sablals\\eclipse-workspace\\reviewsamplesss\\src\\test\\resources/testexcel.xlsx");
    w= new XSSFWorkbook(f);
    sh=w.getSheet("sheet1");
    Row r = sh.getRow(a);
    Cell c = r.getCell(b);
    return c.getStringCellValue();
}
    
public static String getIntegerData(int a,int b) throws IOException
{
	f = new FileInputStream("C:\\Users\\Sablals\\eclipse-workspace\\reviewsamplesss\\src\\test\\resources/testexcel.xlsx");
    w= new XSSFWorkbook(f);
    sh=w.getSheet("sheet1");
    Row r = sh.getRow(a);
    Cell c = r.getCell(b);
    int x = (int)c.getNumericCellValue();
    return String.valueOf(x);
}
}


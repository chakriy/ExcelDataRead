package pageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;

import static stepDefs.Hooks.*;

public class ReadExcelObject
{
    public static XSSFSheet excelSheet;
    public static XSSFCell cell;
    public static WebDriver driver;
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;

    public void ReadExcel(String FileName,String SheetName, String UserName)
    {
        try
        {
            File file = new File(cfr.getFilePath() + "\\" + FileName);
            FileInputStream ExcelFile = new FileInputStream(file);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int rowcount = ExcelWSheet.getLastRowNum();
        for (int i = 1; i<=rowcount; i++)
        {
            if (ExcelWSheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(UserName))
            {
                System.out.println("APP URL " + cfr.getApplicationUrl());
                myDriver.get(cfr.getApplicationUrl());
                myDriver.findElement(By.xpath("//input[@id='email']"))
                        .sendKeys(ExcelWSheet.getRow(i).getCell(1).getStringCellValue());
                myDriver.findElement(By.xpath("//input[@type='password' and @name='pass']"))
                        .sendKeys(ExcelWSheet.getRow(i).getCell(2).getStringCellValue());
                myDriver.findElement(By.xpath("//input[@type='submit']")).click();
            }
        }
         myDriver.close();
    }


    public void ReadExcel(String SheetName,String UserName)
    {

        try
        {
            File file = new File(cfr.getExcelPath());
            FileInputStream ExcelFile = new FileInputStream(file);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(cfr.getSheetName());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int rowcount = ExcelWSheet.getLastRowNum();
        for (int i = 1; i<=rowcount; i++) {
            if (ExcelWSheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(UserName)) {
                System.out.println("APP URL " + cfr.getApplicationUrl());
                myDriver.get(cfr.getApplicationUrl());
                myDriver.findElement(By.xpath("//input[@id='email']"))
                        .sendKeys(ExcelWSheet.getRow(i).getCell(1).getStringCellValue());
                myDriver.findElement(By.xpath("//input[@type='password' and @name='pass']"))
                        .sendKeys(ExcelWSheet.getRow(i).getCell(2).getStringCellValue());
                myDriver.findElement(By.xpath("//input[@type='submit']")).click();
            }

        }
        myDriver.close();
    }
    public void ReadExcel(String UserName)
    {
        try
        {
            File file = new File(cfr.getExcelPath());
            FileInputStream ExcelFile = new FileInputStream(file);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(cfr.getSheetName());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int rowcount = ExcelWSheet.getLastRowNum();
        for (int i = 1; i<=rowcount; i++) {
            if (ExcelWSheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(UserName)) {
                System.out.println("APP URL " + cfr.getApplicationUrl());
                myDriver.get(cfr.getApplicationUrl());
                myDriver.findElement(By.xpath("//input[@id='email']"))
                        .sendKeys(ExcelWSheet.getRow(i).getCell(1).getStringCellValue());
                myDriver.findElement(By.xpath("//input[@type='password' and @name='pass']"))
                        .sendKeys(ExcelWSheet.getRow(i).getCell(2).getStringCellValue());
                myDriver.findElement(By.xpath("//input[@type='submit']")).click();
            }

        }
        myDriver.close();
    }

    public void ReadExcel()
    {
        try
        {
            File file = new File(cfr.getExcelPath());
            FileInputStream ExcelFile = new FileInputStream(file);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(cfr.getSheetName());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int rowcount = ExcelWSheet.getLastRowNum();
        for (int i = 1; i<=rowcount; i++) {

            System.out.println("APP URL "+cfr.getApplicationUrl());
            myDriver.get(cfr.getApplicationUrl());
            myDriver.findElement(By.xpath("//input[@id='email']"))
                    .sendKeys(ExcelWSheet.getRow(i).getCell(1).getStringCellValue());
            myDriver.findElement(By.xpath("//input[@type='password' and @name='pass']"))
                    .sendKeys(ExcelWSheet.getRow(i).getCell(2).getStringCellValue());
            myDriver.findElement(By.xpath("//input[@type='submit']")).click();
        }
        myDriver.close();
    }


}

package pageObjects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static stepDefs.Hooks.cfr;
import static stepDefs.Hooks.myDriver;

public class ExcelDataObject {
    FacebookLoginPage flp = new FacebookLoginPage();

    public void ExcelDataObject() {

        HashMap<String,String> hm = new HashMap<String, String>();
        //File file = new File(cfr.getFilePath() + "\\" + fileName);
        try {
            File src = new File(cfr.getExcelPath());
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            int sheets = wb.getNumberOfSheets();
            FacebookLoginPage flp = new FacebookLoginPage();
            for (int i = 0; i < sheets; i++)
            {
                if (wb.getSheetName(i).equalsIgnoreCase("testdata"))
                {
                    XSSFSheet sheet = wb.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator();
                    Row firstRow = rows.next();
                    Iterator<Cell> c = firstRow.cellIterator();
                    int k = 0, column = 0;
                    while (c.hasNext())
                    {
                        if (c.next().getStringCellValue().equalsIgnoreCase("EmailId"))
                        {
                            column = k;
                        }
                        k++;
                    }
                    while (rows.hasNext())
                    {
                        Row r = rows.next();
                        String S1 = "", S2 = "";
                        S1 = r.getCell(column).getStringCellValue();
                        S2 = r.getCell(column+1).getStringCellValue();
                        System.out.println("Values are "+S1+" "+S2);
                        hm.put(S1, S2);
                    }
                }
            }
            hashSend(hm);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void ExcelDataObject(String UserName) throws IOException {
        HashMap<String,String> hm = new HashMap<String, String>();
        //File file = new File(cfr.getFilePath() + "\\" + fileName);
        try {
            File src = new File(cfr.getExcelPath());
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            int sheets = wb.getNumberOfSheets();
            FacebookLoginPage flp = new FacebookLoginPage();
            for (int i = 0; i < sheets; i++)
            {
                if (wb.getSheetName(i).equalsIgnoreCase("testdata"))
                {
                    XSSFSheet sheet = wb.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator();
                    Row firstRow = rows.next();
                    Iterator<Cell> c = firstRow.cellIterator();
                    int k = 0, column = 0;
                    while (c.hasNext())
                    {
                        if (c.next().getStringCellValue().equalsIgnoreCase("Users"))
                        {
                            column = k;
                        }
                        k++;
                    }
                    while (rows.hasNext())
                    {
                        Row r = rows.next();
                        if(r.getCell(column).getStringCellValue().equalsIgnoreCase(UserName))
                        {

                            String S1 ="",S2 = "";
                            S1 = r.getCell(column+1).getStringCellValue();
                            S2 = r.getCell(column+2).getStringCellValue();

                            hm.put(S1,S2);


                        }
                    }
                }
            }
           hashSend(hm);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void ExcelDataObject(String SheetName,String UserName) throws IOException {
        HashMap<String,String> hm = new HashMap<String, String>();
        //File file = new File(cfr.getFilePath() + "\\" + fileName);
        try {
            File src = new File(cfr.getExcelPath());
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            int sheets = wb.getNumberOfSheets();
            FacebookLoginPage flp = new FacebookLoginPage();
            for (int i = 0; i < sheets; i++)
            {
                if (wb.getSheetName(i).equalsIgnoreCase(SheetName))
                {
                    XSSFSheet sheet = wb.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator();
                    Row firstRow = rows.next();
                    Iterator<Cell> c = firstRow.cellIterator();
                    int k = 0, column = 0;
                    while (c.hasNext())
                    {
                        if (c.next().getStringCellValue().equalsIgnoreCase("Users"))
                        {
                            column = k;
                        }
                        k++;
                    }
                    while (rows.hasNext())
                    {
                        Row r = rows.next();
                        if(r.getCell(column).getStringCellValue().equalsIgnoreCase(UserName))
                        {

                            String S1 ="",S2 = "";
                            S1 = r.getCell(column+1).getStringCellValue();
                            S2 = r.getCell(column+2).getStringCellValue();

                            hm.put(S1,S2);


                        }
                    }
                }
            }
            hashSend(hm);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void ExcelDataObject(String Filename,String SheetName,String UserName) throws IOException {
        HashMap<String,String> hm = new HashMap<String, String>();
        File file = new File(cfr.getFilePath() + "\\" + Filename);
        try {
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            int sheets = wb.getNumberOfSheets();
            FacebookLoginPage flp = new FacebookLoginPage();
            for (int i = 0; i < sheets; i++)
            {
                if (wb.getSheetName(i).equalsIgnoreCase(SheetName))
                {
                    XSSFSheet sheet = wb.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator();
                    Row firstRow = rows.next();
                    Iterator<Cell> c = firstRow.cellIterator();
                    int k = 0, column = 0;
                    while (c.hasNext())
                    {
                        if (c.next().getStringCellValue().equalsIgnoreCase("Users"))
                        {
                            column = k;
                        }
                        k++;
                    }
                    while (rows.hasNext())
                    {
                        Row r = rows.next();
                        if(r.getCell(column).getStringCellValue().equalsIgnoreCase(UserName))
                        {

                            String S1 ="",S2 = "";
                            S1 = r.getCell(column+1).getStringCellValue();
                            S2 = r.getCell(column+2).getStringCellValue();

                            hm.put(S1,S2);


                        }
                    }
                }
            }
            hashSend(hm);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void hashSend(HashMap<String,String> hm ) throws InterruptedException {

        System.out.println("hm values are "+hm);
        Set s = hm.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext())
        {
            System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            myDriver = new ChromeDriver(options);
            flp.accessFacebookLoginPage();
            PageFactory.initElements(myDriver, FacebookLoginPage.class);
            Map.Entry mp = (Map.Entry) i.next();
            flp.setEmailInput((String) mp.getKey());
            System.out.println("UserName is " + mp.getKey());
            flp.setPwdInput((String) mp.getValue());
            System.out.println("passWord is " + mp.getValue());
            flp.Click();
        }

    }
}

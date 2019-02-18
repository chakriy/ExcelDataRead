package pageObjects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;

import static stepDefs.Hooks.cfr;

public class ExcelDataObject {
    HashMap<String,String> hm = new HashMap<String, String>();

    public HashMap<String,String> ExcelDataObject() {
        //File file = new File(cfr.getFilePath() + "\\" + fileName);
        try {


            File src = new File(cfr.getExcelPath());
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            int sheets = wb.getNumberOfSheets();
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

                                Iterator<Cell> c1 = r.cellIterator();
                                while (c1.hasNext())
                                {
                                    c1.next();
                                    S2 = c1.next().getStringCellValue();
                                }
                                hm.put(S1, S2);
                    }


                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return hm;
    }
    public HashMap<String,String> ExcelDataObject(String UserName)throws Exception {
        //File file = new File(cfr.getFilePath() + "\\" + fileName);
        try {
            File src = new File(cfr.getExcelPath());
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            int sheets = wb.getNumberOfSheets();
            for (int i = 0; i < sheets; i++) {
                if (wb.getSheetName(i).equalsIgnoreCase("testdata")) {
                    XSSFSheet sheet = wb.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator();
                    Row firstRow = rows.next();
                    Iterator<Cell> c = firstRow.cellIterator();
                    int k = 0, column = 0;
                    while (c.hasNext()) {

                        if (c.next().getStringCellValue().equalsIgnoreCase("Users")) {
                            column = k;
                        }
                        k++;
                    }
                    while (rows.hasNext()) {
                        Row r = rows.next();
                        if (r.getCell(column).getStringCellValue().equalsIgnoreCase(UserName)) {
                            String S1 = "", S2 = "";
                            Iterator<Cell> c1 = r.cellIterator();

                            while (c1.hasNext()) {
                                c1.next();
                                S1 = c1.next().getStringCellValue();
                                c1.next();
                                S2 = c1.next().getStringCellValue();
                            }
                            hm.put(S1, S2);
                        }

                    }
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return hm;
    }
}

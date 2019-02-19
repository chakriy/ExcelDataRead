package stepDefs;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ExcelDataObject;
import pageObjects.FacebookLoginPage;

import pageObjects.ReadExcelObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static stepDefs.Hooks.cfr;
import static stepDefs.Hooks.myDriver;
public class ReadExcelStepDefs
{
    public static XSSFSheet excelSheet;
    public static XSSFCell cell;

    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    ReadExcelObject r = new ReadExcelObject();

        @Given("^U r in Facebook login page$")
        public void U_r_in_facebook_login_page()
        {
            System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            myDriver = new ChromeDriver(options);
            myDriver.get(cfr.getApplicationUrl());
        }

        @When("^Getting Values From Excel and Feeding to facebook Login$")
        public void Getting_Values_From_Excel_and_Feeding_to_Facebook_Login()
        {
            //r.ReadExcel("Book1.xlsx","testdata","User5");
            //r.ReadExcel("testdata","User3");
            //r.ReadExcel("User4");
            r.ReadExcel();



        }
        @Then("^Check Whether Logging in to facebook And quit$")
        public void Check_Whether_Logging_in_to_Facebook_And_quit()
        {

        }
    }



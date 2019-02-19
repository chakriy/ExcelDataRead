package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ExcelDataObject;
import pageObjects.FacebookLoginPage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static stepDefs.Hooks.cfr;
import static stepDefs.Hooks.myDriver;

public class FacebookLoginStepDefs {
    ExcelDataObject edo = new ExcelDataObject();
    FacebookLoginPage flp = new FacebookLoginPage();
    HashMap hm;

    @Given("^U r in facebook login page$")
    public void step1()
    {
//        System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        myDriver = new ChromeDriver(options);
//        myDriver.get(cfr.getApplicationUrl());

    }
    @When("^Getting Values From Excel and Feeding to Facebook Login$")
    public void step2() throws Exception
    {
        edo.ExcelDataObject();
        //edo.ExcelDataObject("User2");
       // edo.ExcelDataObject("testdata","User3");
       // edo.ExcelDataObject("Book1.xlsx","testdata","User5");
    }
    @Then("^Check Whether Logging in to Facebook And quit$")
    public void step3()
    {
        System.out.println("Quit Facebook");
        myDriver.quit();
    }

}

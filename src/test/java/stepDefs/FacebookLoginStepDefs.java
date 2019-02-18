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
        System.out.println("I'm in Given");
    }
    @When("^Getting Values From Excel and Feeding to Facebook Login$")
    public void step2() throws Exception {
        hm = edo.ExcelDataObject();
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
            {
                Map.Entry mp = (Map.Entry) i.next();
                flp.setEmailInput((String) mp.getKey());
                System.out.println("UserName is " + mp.getKey());
                flp.setPwdInput((String) mp.getValue());
                System.out.println("passWord is " + mp.getValue());
                flp.Click();
            }


        }


    }
    @Then("^Check Whether Logging in to Facebook And quit$")
    public void step3()
    {
        System.out.println("Quit Facebook");
        myDriver.quit();
    }

}

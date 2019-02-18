package stepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.ConfigFileReader;
import utilities.Log;

public class Hooks {

    public static WebDriver myDriver;
    public static ConfigFileReader cfr = new ConfigFileReader();
    public static CapScreenSht ScShot = new CapScreenSht();
    static ChromeOptions options;
    @Before
    public void beforeScenario(Scenario scr)
    {
//        System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
//        options=new ChromeOptions();
//        options.addArguments("--start-maximized");
//        myDriver = new ChromeDriver(options);
        Log.startTestCase(scr.getName());
    }
    @After
    public void afterScenario(Scenario scr)
    {
        Log.endTestCase(scr.getName());
        myDriver.quit();
    }
}

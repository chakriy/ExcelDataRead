package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static stepDefs.Hooks.*;

public class FacebookLoginPage {
    @FindBy(xpath ="//input[@id='email']" )
    static WebElement emailInput;
    @FindBy(xpath = "//input[@type='password' and @name='pass']")
    static WebElement pwdInput;
    @FindBy(xpath="//input[@type='submit']")
    static WebElement submitButton;
    public void accessFacebookLoginPage()
    {
        myDriver.get(cfr.getApplicationUrl());


    }

    public void setEmailInput(String S) {
        emailInput.sendKeys(S);
    }

    public void setPwdInput(String S) {
        pwdInput.sendKeys(S);
    }
    public void Click() throws InterruptedException {
        submitButton.click();
        ScShot.capScrSht(myDriver,"screenShot");
        myDriver.quit();


    }
}

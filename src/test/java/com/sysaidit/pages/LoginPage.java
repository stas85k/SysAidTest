

package com.sysaidit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class LoginPage extends Page {
    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;

    @FindBy(css = "a[href='http://www.sysaid.com']")

    public WebElement bySysaid;

    @FindBy(css = "a[href='ForgotPassword.jsp?accountid=automationstas']")

    public WebElement forgotYourPassword;

    @FindBy(css = "a[href='EndUserPortal.jsp']")

    public WebElement loginAsGuest;

    public final String pageLoadedText = "";

    public final String pageUrl = "/Login.jsp";

    @FindBy(name = "password")

    public WebElement password1;

    @FindBy(name = "rememberMeForDisplay")

    public WebElement rememberCheckbox;

    @FindBy(name = "userName")

    public WebElement userName;

    @FindBy(id = "error_message")
    public WebElement errorMessage;

    @FindBy(xpath = "//table[@class='Button3Parts']")
    public WebElement loginButton;


    public LoginPage(WebDriver driver) {
        
super(driver);
       // this.PAGE_URL = getCurrentUrl();
        PageFactory.initElements(driver, this);
        this.timeout = timeout;
    }




    /**
     * Click on By Sysaid Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickBySysaidLink() {
        bySysaid.click();
        return this;
    }

    public LoginPage clickToLogin() {
        loginButton.click();
        return this;
    }
    /**
     * Click on Forgot Your Password Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickForgotYourPasswordLink() {
        forgotYourPassword.click();
        return this;
    }

    /**
     * Click on Login As Guest Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickLoginAsGuestLink() {
        loginAsGuest.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage fillLogin (String username, String pass) {
        setUserNameTextField(username);
        setPassword1CheckboxField(pass);
        clickToLogin();
        return this;
    }

    public LoginPage fillPositiveLogin () {
        setUserNameTextField("qatest");
        setPassword1CheckboxField("xvqkd1");
        clickToLogin();
        return this;
    }


    /**
     * Set Password Checkbox field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setPassword1CheckboxField(String passwordValue) {
setElementText ( password1,passwordValue);
        return this;
    }

    /**
     * Set Password Checkbox field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setPassword2CheckboxField() {
        if (!rememberCheckbox.isSelected()) {
            //rememberCheckbox.click();
             clickElement(rememberCheckbox);
        }
        return this;
    }


    /**
     * Set value to User Name Text field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setUserNameTextField(String userNameValue) {
setElementText ( userName,userNameValue);
        return this;
    }

    /**
     * Unset Password Checkbox field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage unsetPassword2CheckboxField() {
        if (rememberCheckbox.isSelected()) {
            //rememberCheckbox.click();
             clickElement(rememberCheckbox);
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }

    public boolean isRememberChecked() {

        return rememberCheckbox.isSelected();

    }

    public boolean checkErrorMessage (){
        waitUntilIsLoaded(errorMessage);
        return exists(errorMessage);
    }
}
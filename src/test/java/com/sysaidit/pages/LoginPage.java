
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

    public final String pageLoadedText = "";
    public final String pageUrl = "/Login.jsp";

    @FindBy(name = "userName")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "rememberMeForDisplay")
    public WebElement rememberCheckbox;

    @FindBy(id = "error_message")
    public WebElement errorMessage;

    @FindBy(xpath = "//table[@class='Button3Parts']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='user-links']/li[2]/span")
    public WebElement userNameInPage;


    public LoginPage(WebDriver driver) {

        super(driver);
        // this.PAGE_URL = getCurrentUrl();
        PageFactory.initElements(driver, this);
        this.timeout = timeout;
    }


    public LoginPage clickToLogin() {
        loginButton.click();
        return this;
    }


    /**
     * Fill every fields in the page.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage fillLogin(String username, String pass) {
        setUserNameTextField(username);
        setPasswordField(pass);
        clickToLogin();
        return this;
    }

    /**
     * Set value to User Name Text field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setUserNameTextField(String userNameValue) {
        setElementText(userName, userNameValue);
        return this;
    }

    /**
     * Set value to Password field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setPasswordField(String passwordValue) {
        setElementText(password, passwordValue);
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

    public boolean verifyUserNameAfterLogin() {
        return verifyTextBoolean(userNameInPage, "Stas Kuznetsov");
    }

    public boolean checkErrorMessage() {
        waitUntilIsLoaded(errorMessage);
        return exists(errorMessage);
    }
}
package com.sysaidit.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class CIActivitiesPage extends Page {
    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;


    @FindBy(name = "sract_fromTime")
    public WebElement fromTimeD;

    @FindBy(name = "sract_fromTime_time")
    public WebElement fromTimeT;

    @FindBy(name = "sract_toTime")
    public WebElement toTimeD;

    @FindBy(name = "sract_toTime_time")
    public WebElement toTimeT;

    @FindBy(id = "sract_OKBtn")
    public WebElement addButton;


    public CIActivitiesPage(WebDriver driver) {

        super(driver);
        // this.PAGE_URL = getCurrentUrl();
        PageFactory.initElements(driver, this);
        this.timeout = timeout;
    }

    public CIActivitiesPage clickToAddButton() {
        addButton.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the LoginPage class instance.
     */
    public CIActivitiesPage fillActivities(String fromtimed, String fromtimet, String totimed, String totimet) {
        setFromTimeDateTextField(fromtimed);
        setToTimeDateTextField(totimed);
        setFromTimeTimeTextField(fromtimet);
        setToTimeTimeTextField(totimet);
        clickToAddButton();
        return this;
    }


    public CIActivitiesPage setFromTimeDateTextField(String fromTimeDValue) {
        setElementText(fromTimeD, fromTimeDValue);
        return this;
    }

    public CIActivitiesPage setToTimeDateTextField(String toTimeDValue) {
        setElementText(toTimeD, toTimeDValue);
        return this;
    }

    private CIActivitiesPage setToTimeTimeTextField(String fromTimeTValue) {
        setElementText(fromTimeT, fromTimeTValue);
        return this;
    }

    private CIActivitiesPage setFromTimeTimeTextField(String toTimeTValue) {
        setElementText(fromTimeT, toTimeTValue);
        return this;
    }

}
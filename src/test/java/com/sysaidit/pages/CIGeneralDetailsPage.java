package com.sysaidit.pages;

import com.sysaidit.LogLog4j;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class CIGeneralDetailsPage extends Page {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;


    @FindBy(xpath = "//*[contains(@id,'problem_type')]/div/div[1]/span")
    WebElement category;

    @FindBy(xpath = "//*[@id='addScroll_problem_type_CustomSelect']/ul/li[2]")
    WebElement categoryChs;


    @FindBy(xpath = "//td[2]/div/div/div/span")
    WebElement subCategory;

    @FindBy(id = "thirdLevelCategory")
    WebElement thirdCategory;

    @FindBy(id = "title")
    WebElement title;

    @FindBy(id = "desc")
    WebElement description;


    @FindBy(id = "ApplyBtn")
    WebElement applyButton;


    @FindBy(xpath = "//div[@class='UI_Form_BreadCrumbs_Label']/span")
    WebElement uniqueNumber;

    @FindBy(name = "sr-searchfield")
    WebElement noAnnouncementsForYouToday;


    public final String pageLoadedText = "";


    public CIGeneralDetailsPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }


    /**
     * Verify that the page loaded completely.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    public CIGeneralDetailsPage fillGeneraldetails() {

        chsCategoryTextField();
        /*setSubCategoryTextField("2");
        setThirdCategoryTextField("3");
        setTitleTextField("new title");
        setDescriptionTextField("new Description");
        addNote("new note");
        setStatusTextField("New");
        setUrgencyTextField("Normal");
        setImpactTextField("Medium");
        setPriorityTextField("Normal");
        setRequestUserTextField("User");
        setAssignedToTextField("SysAid Admin");

        clickToApplyButton();*/

        return this;
    }


    //todo correct others element the same way - first click and then add value
    public CIGeneralDetailsPage chsCategoryTextField() {
        Log.info("set Category Text Field with ");
        clickElement(category);
        clickElement(categoryChs);
        return this;
    }

    public CIGeneralDetailsPage setSubCategoryTextField(String subCategoryValue) {
        Log.info("set sub Category Text Field with " + subCategoryValue);
        clickElement(subCategory);
        setElementText(subCategory, subCategoryValue);
        return this;
    }


    public CIGeneralDetailsPage setThirdCategoryTextField(String thirdCategoryValue) {
        Log.info("set third  Category Text Field with " + thirdCategoryValue);
        setElementText(thirdCategory, thirdCategoryValue);
        return this;
    }


    public CIGeneralDetailsPage setTitleTextField(String titleValue) {
        Log.info("set Title  Text Field with " + titleValue);
        setElementText(title, titleValue);
        return this;
    }


    public CIGeneralDetailsPage setDescriptionTextField(String descriptionValue) {
        setElementText(description, descriptionValue);
        return this;
    }


    public CIGeneralDetailsPage addNote(String s) {
        return this;

    }

    public CIGeneralDetailsPage setStatusTextField(String s) {
        return this;

    }

    public CIGeneralDetailsPage setUrgencyTextField(String s) {
        return this;

    }

    public CIGeneralDetailsPage setImpactTextField(String s) {
        return this;

    }

    public CIGeneralDetailsPage setPriorityTextField(String s) {
        return this;

    }

    public CIGeneralDetailsPage setAssignedToTextField(String s) {
        return this;

    }

    public CIGeneralDetailsPage setRequestUserTextField(String s) {
        return this;

    }




    public CIGeneralDetailsPage clickToApplyButton() {
        applyButton.click();
        return this;
    }


    public boolean checkUniqueNumber() {
        boolean isUniqueNumberElementPresent = this.verifyElementIsPresent(uniqueNumber);
        if (!isUniqueNumberElementPresent) {
            return false;
        }
        String uniqueNumberText = uniqueNumber.getText();
        if (!uniqueNumberText.contains("Incident #")) {
            return false;
        }
        return true;
    }

    public boolean checkErrorMessage() {
        Alert alert = driver.switchTo().alert();
        if (alert == null) {
            return false;
        }
        return true;
    }

    public CIGeneralDetailsPage waitForPageLoad() {
        waitUntilIsLoaded(category);
        return this;
    }
    /*public CIGeneralDetailsPage fillActivities() {
        return this;
    }*/
}
package com.sysaidit.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class CIGeneralDetailsPage extends Page {
    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;


    @FindBy(id = "problem_type")
    public WebElement category;

    @FindBy(id = "subcategory")
    public WebElement subCategory;

    @FindBy(id = "thirdLevelCategory")
    public WebElement thirdCategory;

    @FindBy(id = "title")
    public WebElement title;

    @FindBy(id = "desc")
    public WebElement description;


    @FindBy(id = "ApplyBtn")
    public WebElement applyButton;




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
     * Fill every fields in the page.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage fill() {

        setNoAnnouncementsForYouTodayTextField();
        return this;
    }

    /**
     * Set default value to No Announcements For You Today Text field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage setNoAnnouncementsForYouTodayTextField() {
        return setNoAnnouncementsForYouTodayTextField(data.get("NO_ANNOUNCEMENTS_FOR_YOU_TODAY"));
    }

    /**
     * Set value to No Announcements For You Today Text field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage setNoAnnouncementsForYouTodayTextField(String noAnnouncementsForYouTodayValue) {
        setElementText(noAnnouncementsForYouToday, noAnnouncementsForYouTodayValue);
        return this;
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
        setCategoryTextField("1");
        setSubCategoryTextField("2");
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

        clickToApplyButton();

        return this;
    }


    public CIGeneralDetailsPage setCategoryTextField(String categoryValue) {
        setElementText(category, categoryValue);
        return this;
    }

    public CIGeneralDetailsPage setSubCategoryTextField(String subCategoryValue) {
        setElementText(subCategory, subCategoryValue);
        return this;
    }


    public CIGeneralDetailsPage setThirdCategoryTextField(String thirdCategoryValue) {
        setElementText(thirdCategory, thirdCategoryValue);
        return this;
    }


    public CIGeneralDetailsPage setTitleTextField(String titleValue) {
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

    /*public CIGeneralDetailsPage fillActivities() {
        return this;
    }*/
}
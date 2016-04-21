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
     * Click on About Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAboutLink() {
        clickElement(about);
        return this;
    }

    /**
     * Click on Accessible Assets Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAccessibleAssetsLink() {
        clickElement(accessibleAssets);
        return this;
    }

    /**
     * Click on Active Sessions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickActiveSessionsLink() {
        clickElement(activeSessions);
        return this;
    }

    /**
     * Click on Admin Portal Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAdminPortalLink() {
        clickElement(adminPortal);
        return this;
    }

    /**
     * Click on Administrator Sysaid Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAdministratorSysaidLink() {
        clickElement(administratorSysaid);
        return this;
    }

    /**
     * Click on Administrators Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAdministratorsLink() {
        clickElement(administrators);
        return this;
    }

    /**
     * Click on Alerts Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAlertsLink() {
        clickElement(alerts);
        return this;
    }

    /**
     * Click on All Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAllLink() {
        clickElement(all);
        return this;
    }

    /**
     * Click on Analytics Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAnalyticsLink() {
        clickElement(analytics);
        return this;
    }

    /**
     * Click on Animated Summary Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAnimatedSummaryLink() {
        clickElement(animatedSummary);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickApply1Button() {
        clickElement(apply1);
        return this;
    }


    /**
     * Click on Articles Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickArticlesLink() {
        clickElement(articles);
        return this;
    }

    /**
     * Click on Asset Availability Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAssetAvailabilityLink() {
        clickElement(assetAvailability);
        return this;
    }

    /**
     * Click on Asset Groups Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAssetGroupsLink() {
        clickElement(assetGroups);
        return this;
    }

    /**
     * Click on Asset List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAssetListLink() {
        clickElement(assetList);
        return this;
    }

    /**
     * Click on Asset Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAssetSettingsLink() {
        clickElement(assetSettings);
        return this;
    }

    /**
     * Click on Assets Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAssetsLink() {
        clickElement(assets);
        return this;
    }

    /**
     * Click on Audit Log Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAuditLogLink() {
        clickElement(auditLog);
        return this;
    }

    /**
     * Click on Audit Logs Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickAuditLogsLink() {
        clickElement(auditLogs);
        return this;
    }

    /**
     * Click on Bi Analytics Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickBiAnalyticsLink() {
        clickElement(biAnalytics);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickCancel1Link() {
        clickElement(cancel1);
        return this;
    }


    /**
     * Click on Catalog Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickCatalogLink() {
        clickElement(catalog);
        return this;
    }

    /**
     * Click on Changes Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickChangesLink() {
        clickElement(changes);
        return this;
    }

    /**
     * Click on Chat Console Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickChatConsoleLink() {
        clickElement(chatConsole);
        return this;
    }

    /**
     * Click on Chat Sessions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickChatSessionsLink() {
        clickElement(chatSessions);
        return this;
    }

    /**
     * Click on Ci List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickCiListLink() {
        clickElement(ciList);
        return this;
    }

    /**
     * Click on Click Here For Full Comparison Matrix. Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickClickHereForFullComparisonMatrixLink() {
        clickElement(clickHereForFullComparisonMatrix);
        return this;
    }

    /**
     * Click on Cmdb Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickCmdbSettingsLink() {
        clickElement(cmdbSettings);
        return this;
    }

    /**
     * Click on Companies Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickCompaniesLink() {
        clickElement(companies);
        return this;
    }

    /**
     * Click on Contact Sysaid Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickContactSysaidLink() {
        clickElement(contactSysaid);
        return this;
    }

    /**
     * Click on Continue Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickContinueButton() {
        clickElement(continue1);
        return this;
    }


    /**
     * Click on End Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickEndUsersLink() {
        clickElement(endUsers);
        return this;
    }

    /**
     * Click on Enduser Portal Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickEnduserPortalLink() {
        clickElement(enduserPortal);
        return this;
    }

    /**
     * Click on Event Log Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickEventLogLink() {
        clickElement(eventLog);
        return this;
    }

    /**
     * Click on Groups Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickGroupsLink() {
        clickElement(groups);
        return this;
    }

    /**
     * Click on Help Desk Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickHelpDeskSettingsLink() {
        clickElement(helpDeskSettings);
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickHelpLink() {
        clickElement(help);
        return this;
    }

    /**
     * Click on Incident 509 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickIncident509DefaultLink() {
        clickElement(incident509Default);
        return this;
    }

    /**
     * Click on Incidents Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickIncidentsLink() {
        clickElement(incidents);
        return this;
    }

    /**
     * Click on It Benchmark Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickItBenchmarkLink() {
        clickElement(itBenchmark);
        return this;
    }

    /**
     * Click on Last Poll Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickLastPollLink() {
        clickElement(lastPoll);
        return this;
    }

    /**
     * Click on Logout Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickLogoutLink() {
        clickElement(logout);
        return this;
    }

    /**
     * Click on Main Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickMain1Link() {
        clickElement(main1);
        return this;
    }

    /**
     * Click on Main Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickMain2Link() {
        clickElement(main2);
        return this;
    }

    /**
     * Click on Matrix Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickMatrixLink() {
        clickElement(matrix);
        return this;
    }

    /**
     * Click on Monitoring Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickMonitoringSettingsLink() {
        clickElement(monitoringSettings);
        return this;
    }

    /**
     * Click on My Calendar Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickMyCalendarLink() {
        clickElement(myCalendar);
        return this;
    }

    /**
     * Click on My Calendar Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickMyCalendarSettingsLink() {
        clickElement(myCalendarSettings);
        return this;
    }

    /**
     * Click on My Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickMySettingsLink() {
        clickElement(mySettings);
        return this;
    }

    /**
     * Click on Network Devices Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickNetworkDevicesLink() {
        clickElement(networkDevices);
        return this;
    }

    /**
     * Click on New Incident Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickNewIncidentLink() {
        clickElement(newIncident);
        return this;
    }

    /**
     * Click on Online Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickOnlineUsersLink() {
        clickElement(onlineUsers);
        return this;
    }

    /**
     * Click on Organize Favorites Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickOrganizeFavoritesLink() {
        clickElement(organizeFavorites);
        return this;
    }

    /**
     * Click on Password Services Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickPasswordServicesSettingsLink() {
        clickElement(passwordServicesSettings);
        return this;
    }

    /**
     * Click on Patch Management Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickPatchManagementLink() {
        clickElement(patchManagement);
        return this;
    }

    /**
     * Click on Phone Call Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickPhoneCallLink() {
        clickElement(phoneCall);
        return this;
    }

    /**
     * Click on Problems Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickProblemsLink() {
        clickElement(problems);
        return this;
    }

    /**
     * Click on Projects Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickProjectsLink() {
        clickElement(projects);
        return this;
    }

    /**
     * Click on Registered Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickRegisteredUsersLink() {
        clickElement(registeredUsers);
        return this;
    }

    /**
     * Click on Reportdashboard Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickReportdashboardSettingsLink() {
        clickElement(reportdashboardSettings);
        return this;
    }

    /**
     * Click on Reports Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickReportsLink() {
        clickElement(reports);
        return this;
    }

    /**
     * Click on Requests Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickRequestsLink() {
        clickElement(requests);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSaveClose1Button() {
        clickElement(saveClose1);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSaveClose2Button() {
        clickElement(saveClose2);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSaveClose3Button() {
        clickElement(saveClose3);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSaveClose4Button() {
        clickElement(saveClose4);
        return this;
    }

    /**
     * Click on Send Message Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSendMessageLink() {
        clickElement(sendMessage);
        return this;
    }

    /**
     * Click on Servers Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickServersLink() {
        clickElement(servers);
        return this;
    }

    /**
     * Click on Service Desk Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickServiceDeskLink() {
        clickElement(serviceDesk);
        return this;
    }

    /**
     * Click on Service Management Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickServiceManagementLink() {
        clickElement(serviceManagement);
        return this;
    }

    /**
     * Click on Service Record 509 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickServiceRecord509DefaultLink() {
        clickElement(serviceRecord509Default);
        return this;
    }

    /**
     * Click on Service Record 511 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickServiceRecord511DefaultLink() {
        clickElement(serviceRecord511Default);
        return this;
    }

    /**
     * Click on Service Record Actions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickServiceRecordActionsLink() {
        clickElement(serviceRecordActions);
        return this;
    }

    /**
     * Click on Slaslm Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSlaslmSettingsLink() {
        clickElement(slaslmSettings);
        return this;
    }

    /**
     * Click on Software Products Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSoftwareProductsLink() {
        clickElement(softwareProducts);
        return this;
    }

    /**
     * Click on Supplier List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSupplierListLink() {
        clickElement(supplierList);
        return this;
    }

    /**
     * Click on Sysaid 9.1.1 Release Notes Here Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSysaid911ReleaseNotesHereLink() {
        clickElement(sysaid911ReleaseNotesHere);
        return this;
    }

    /**
     * Click on Sysaid Community Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickSysaidCommunityLink() {
        clickElement(sysaidCommunity);
        return this;
    }

    /**
     * Click on Tasks Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickTasksLink() {
        clickElement(tasks);
        return this;
    }

    /**
     * Click on Tasks Projects Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickTasksProjectsSettingsLink() {
        clickElement(tasksProjectsSettings);
        return this;
    }

    /**
     * Click on Tools Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickToolsLink() {
        clickElement(tools);
        return this;
    }

    /**
     * Click on User Management Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public CIGeneralDetailsPage clickUserManagementSettingsLink() {
        clickElement(userManagementSettings);
        return this;
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
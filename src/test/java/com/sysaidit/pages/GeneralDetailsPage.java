package com.sysaidit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class GeneralDetailsPage extends Page {
    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;

    //fields
    @FindBy(xpath = "//*[@id='64_problem_type']/div/div[1]/span")
    WebElement categoryField;


    @FindBy(xpath = "//*[@id='64_subcategory']/div/div[1]/span")
    WebElement subCategoryField;

    @FindBy(xpath = "//*[@id='64_thirdLevelCategory']/div/div[1]/spann")
    WebElement thirdLevelCategoryField;

    @FindBy(id = "//*[@id='title']")
    WebElement titleField;

    @FindBy(id = "//*[@id='desc']")
    WebElement descriptionField;

    @FindBy(xpath = "//*[@id='64_status']/div/div[1]/span]")
    WebElement statusField;

    @FindBy(xpath = "//*[@id='64_selectUrgency']/div/div[1]/span]")
    WebElement urgencyField;

    @FindBy(xpath = "//*[@id='64_selectPriority']/div/div[1]/span]")
    WebElement priorityField;

    @FindBy(xpath = "//*[@id='64_requestUser']/div/div[1]/span]")
    WebElement requestUserField;

    @FindBy(xpath = "//*[@id='notes']")
    WebElement notesField;

    //buttoms
    @FindBy(xpath = "//tr[@id='tr_labelId_notes']//td[2]/span")
    WebElement addNotesButtom;


    public GeneralDetailsPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }
}
 
  /*  *//**
     * Click on About Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAboutLink() {
       clickElement(about);
        return this;
    }

    *//**
     * Click on Accessible Assets Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAccessibleAssetsLink() {
       clickElement(accessibleAssets);
        return this;
    }

    *//**
     * Click on Active Sessions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickActiveSessionsLink() {
       clickElement(activeSessions);
        return this;
    }

    *//**
     * Click on Activities Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickActivities1Link() {
       clickElement(activities1);
        return this;
    }

    *//**
     * Click on Activities Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickActivities2Link() {
       clickElement(activities2);
        return this;
    }

    *//**
     * Click on Admin Portal Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAdminPortalLink() {
       clickElement(adminPortal);
        return this;
    }

    *//**
     * Click on Administrator Sysaid Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAdministratorSysaidLink() {
       clickElement(administratorSysaid);
        return this;
    }

    *//**
     * Click on Administrators Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAdministratorsLink() {
       clickElement(administrators);
        return this;
    }

    *//**
     * Click on Alerts Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAlertsLink() {
       clickElement(alerts);
        return this;
    }

    *//**
     * Click on All Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAllLink() {
       clickElement(all);
        return this;
    }

    *//**
     * Click on Analytics Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAnalyticsLink() {
       clickElement(analytics);
        return this;
    }

    *//**
     * Click on Animated Summary Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAnimatedSummaryLink() {
       clickElement(animatedSummary);
        return this;
    }

    *//**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickApply1Button() {
clickElement(apply1);
        return this;
    }

    *//**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickApply2Button() {
clickElement(apply2);
        return this;
    }

    *//**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickApply3Button() {
clickElement(apply3);
        return this;
    }

    *//**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickApply4Button() {
clickElement(apply4);
        return this;
    }

    *//**
     * Click on Articles Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickArticlesLink() {
       clickElement(articles);
        return this;
    }

    *//**
     * Click on Asset Availability Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAssetAvailabilityLink() {
       clickElement(assetAvailability);
        return this;
    }

    *//**
     * Click on Asset Groups Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAssetGroupsLink() {
       clickElement(assetGroups);
        return this;
    }

    *//**
     * Click on Asset List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAssetListLink() {
       clickElement(assetList);
        return this;
    }

    *//**
     * Click on Asset Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAssetSettingsLink() {
       clickElement(assetSettings);
        return this;
    }

    *//**
     * Click on Assets Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAssetsLink() {
       clickElement(assets);
        return this;
    }

    *//**
     * Click on Audit Log Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAuditLogLink() {
       clickElement(auditLog);
        return this;
    }

    *//**
     * Click on Audit Logs Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickAuditLogsLink() {
       clickElement(auditLogs);
        return this;
    }

    *//**
     * Click on Bi Analytics Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickBiAnalyticsLink() {
       clickElement(biAnalytics);
        return this;
    }

    *//**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickCancel1Link() {
       clickElement(cancel1);
        return this;
    }

    *//**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickCancel2Link() {
       clickElement(cancel2);
        return this;
    }

    *//**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickCancel3Link() {
       clickElement(cancel3);
        return this;
    }

    *//**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickCancel4Link() {
       clickElement(cancel4);
        return this;
    }

    *//**
     * Click on Catalog Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickCatalogLink() {
       clickElement(catalog);
        return this;
    }

    *//**
     * Click on Changes Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickChangesLink() {
       clickElement(changes);
        return this;
    }

    *//**
     * Click on Chat Console Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickChatConsoleLink() {
       clickElement(chatConsole);
        return this;
    }

    *//**
     * Click on Chat Sessions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickChatSessionsLink() {
       clickElement(chatSessions);
        return this;
    }

    *//**
     * Click on Ci List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickCiListLink() {
       clickElement(ciList);
        return this;
    }

    *//**
     * Click on Click Here For Full Comparison Matrix. Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickClickHereForFullComparisonMatrixLink() {
       clickElement(clickHereForFullComparisonMatrix);
        return this;
    }

    *//**
     * Click on Cmdb Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickCmdbSettingsLink() {
       clickElement(cmdbSettings);
        return this;
    }

    *//**
     * Click on Companies Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickCompaniesLink() {
       clickElement(companies);
        return this;
    }

    *//**
     * Click on Contact Sysaid Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickContactSysaidLink() {
       clickElement(contactSysaid);
        return this;
    }

    *//**
     * Click on Continue Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickContinueButton() {
clickElement(continue1);
        return this;
    }

    *//**
     * Click on Dashboard Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickDashboard1Link() {
       clickElement(dashboard1);
        return this;
    }

    *//**
     * Click on Dashboard Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickDashboard2Link() {
       clickElement(dashboard2);
        return this;
    }

    *//**
     * Click on End Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickEndUsersLink() {
       clickElement(endUsers);
        return this;
    }

    *//**
     * Click on Enduser Portal Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickEnduserPortalLink() {
       clickElement(enduserPortal);
        return this;
    }

    *//**
     * Click on Event Log Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickEventLogLink() {
       clickElement(eventLog);
        return this;
    }

    *//**
     * Click on Groups Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickGroupsLink() {
       clickElement(groups);
        return this;
    }

    *//**
     * Click on Help Desk Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickHelpDeskSettingsLink() {
       clickElement(helpDeskSettings);
        return this;
    }

    *//**
     * Click on Help Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickHelpLink() {
       clickElement(help);
        return this;
    }

    *//**
     * Click on Incident 509 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickIncident509DefaultLink() {
       clickElement(incident509Default);
        return this;
    }

    *//**
     * Click on Incidents Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickIncidentsLink() {
       clickElement(incidents);
        return this;
    }

    *//**
     * Click on It Benchmark Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickItBenchmarkLink() {
       clickElement(itBenchmark);
        return this;
    }

    *//**
     * Click on Last Poll Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickLastPollLink() {
       clickElement(lastPoll);
        return this;
    }

    *//**
     * Click on Logout Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickLogoutLink() {
       clickElement(logout);
        return this;
    }

    *//**
     * Click on Main Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickMain1Link() {
       clickElement(main1);
        return this;
    }

    *//**
     * Click on Main Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickMain2Link() {
       clickElement(main2);
        return this;
    }

    *//**
     * Click on Matrix Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickMatrixLink() {
       clickElement(matrix);
        return this;
    }

    *//**
     * Click on Monitoring Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickMonitoringSettingsLink() {
       clickElement(monitoringSettings);
        return this;
    }

    *//**
     * Click on My Calendar Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickMyCalendarLink() {
       clickElement(myCalendar);
        return this;
    }

    *//**
     * Click on My Calendar Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickMyCalendarSettingsLink() {
       clickElement(myCalendarSettings);
        return this;
    }

    *//**
     * Click on My Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickMySettingsLink() {
       clickElement(mySettings);
        return this;
    }

    *//**
     * Click on Network Devices Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickNetworkDevicesLink() {
       clickElement(networkDevices);
        return this;
    }

    *//**
     * Click on New Incident Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickNewIncidentLink() {
       clickElement(newIncident);
        return this;
    }

    *//**
     * Click on Online Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickOnlineUsersLink() {
       clickElement(onlineUsers);
        return this;
    }

    *//**
     * Click on Organize Favorites Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickOrganizeFavoritesLink() {
       clickElement(organizeFavorites);
        return this;
    }

    *//**
     * Click on Password Services Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickPasswordServicesSettingsLink() {
       clickElement(passwordServicesSettings);
        return this;
    }

    *//**
     * Click on Patch Management Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickPatchManagementLink() {
       clickElement(patchManagement);
        return this;
    }

    *//**
     * Click on Phone Call Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickPhoneCallLink() {
       clickElement(phoneCall);
        return this;
    }

    *//**
     * Click on Problems Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickProblemsLink() {
       clickElement(problems);
        return this;
    }

    *//**
     * Click on Projects Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickProjectsLink() {
       clickElement(projects);
        return this;
    }

    *//**
     * Click on Registered Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickRegisteredUsersLink() {
       clickElement(registeredUsers);
        return this;
    }

    *//**
     * Click on Reportdashboard Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickReportdashboardSettingsLink() {
       clickElement(reportdashboardSettings);
        return this;
    }

    *//**
     * Click on Reports Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickReportsLink() {
       clickElement(reports);
        return this;
    }

    *//**
     * Click on Requests Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickRequestsLink() {
       clickElement(requests);
        return this;
    }

    *//**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSaveClose1Button() {
clickElement(saveClose1);
        return this;
    }

    *//**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSaveClose2Button() {
clickElement(saveClose2);
        return this;
    }

    *//**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSaveClose3Button() {
clickElement(saveClose3);
        return this;
    }

    *//**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSaveClose4Button() {
clickElement(saveClose4);
        return this;
    }

    *//**
     * Click on Send Message Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSendMessageLink() {
       clickElement(sendMessage);
        return this;
    }

    *//**
     * Click on Servers Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickServersLink() {
       clickElement(servers);
        return this;
    }

    *//**
     * Click on Service Desk Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickServiceDeskLink() {
       clickElement(serviceDesk);
        return this;
    }

    *//**
     * Click on Service Management Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickServiceManagementLink() {
       clickElement(serviceManagement);
        return this;
    }

    *//**
     * Click on Service Record 509 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickServiceRecord509DefaultLink() {
       clickElement(serviceRecord509Default);
        return this;
    }

    *//**
     * Click on Service Record 511 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickServiceRecord511DefaultLink() {
       clickElement(serviceRecord511Default);
        return this;
    }

    *//**
     * Click on Service Record Actions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickServiceRecordActionsLink() {
       clickElement(serviceRecordActions);
        return this;
    }

    *//**
     * Click on Slaslm Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSlaslmSettingsLink() {
       clickElement(slaslmSettings);
        return this;
    }

    *//**
     * Click on Software Products Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSoftwareProductsLink() {
       clickElement(softwareProducts);
        return this;
    }

    *//**
     * Click on Supplier List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSupplierListLink() {
       clickElement(supplierList);
        return this;
    }

    *//**
     * Click on Sysaid 9.1.1 Release Notes Here Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSysaid911ReleaseNotesHereLink() {
       clickElement(sysaid911ReleaseNotesHere);
        return this;
    }

    *//**
     * Click on Sysaid Community Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickSysaidCommunityLink() {
       clickElement(sysaidCommunity);
        return this;
    }

    *//**
     * Click on Tasks Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickTasksLink() {
       clickElement(tasks);
        return this;
    }

    *//**
     * Click on Tasks Projects Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickTasksProjectsSettingsLink() {
       clickElement(tasksProjectsSettings);
        return this;
    }

    *//**
     * Click on Tools Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickToolsLink() {
       clickElement(tools);
        return this;
    }

    *//**
     * Click on User Management Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickUserManagementSettingsLink() {
       clickElement(userManagementSettings);
        return this;
    }

    *//**
     * Click on Workstations Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage clickWorkstationsLink() {
       clickElement(workstations);
        return this;
    }

    *//**
     * Fill every fields in the page.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage fill() {
        setPleaseSelectAMenuItemTo1CheckboxField();
        setPleaseSelectAMenuItemTo2CheckboxField();
        setPleaseSelectAMenuItemTo3CheckboxField();
        setPleaseSelectAMenuItemTo4CheckboxField();
        setPleaseSelectAMenuItemTo5CheckboxField();
        setPleaseSelectAMenuItemTo6CheckboxField();
        setPleaseSelectAMenuItemTo7CheckboxField();
        setPleaseSelectAMenuItemTo8CheckboxField();
        setPleaseSelectAMenuItemTo9CheckboxField();
        setPleaseSelectAMenuItemTo10CheckboxField();
        setPleaseSelectAMenuItemTo11CheckboxField();
        setPleaseSelectAMenuItemTo12CheckboxField();
        setPleaseSelectAMenuItemTo13CheckboxField();
        setPleaseSelectAMenuItemTo14CheckboxField();
        setPleaseSelectAMenuItemTo15CheckboxField();
        setPleaseSelectAMenuItemTo16CheckboxField();
        setPleaseSelectAMenuItemTo17CheckboxField();
        setPleaseSelectAMenuItemTo18CheckboxField();
        setPleaseSelectAMenuItemTo19CheckboxField();
        setPleaseSelectAMenuItemTo20CheckboxField();
        setPleaseSelectAMenuItemTo21CheckboxField();
        setPleaseSelectAMenuItemTo22CheckboxField();
        setPleaseSelectAMenuItemTo23CheckboxField();
        setPleaseSelectAMenuItemTo24CheckboxField();
        setPleaseSelectAMenuItemTo25CheckboxField();
        setPleaseSelectAMenuItemTo26CheckboxField();
        setPleaseSelectAMenuItemTo27CheckboxField();
        setPleaseSelectAMenuItemTo28CheckboxField();
        setPleaseSelectAMenuItemTo29CheckboxField();
        setPleaseSelectAMenuItemTo30CheckboxField();
        setPleaseSelectAMenuItemTo31CheckboxField();
        setPleaseSelectAMenuItemTo32CheckboxField();
        setPleaseSelectAMenuItemTo33CheckboxField();
        setPleaseSelectAMenuItemTo34CheckboxField();
        setPleaseSelectAMenuItemTo35CheckboxField();
        setPleaseSelectAMenuItemTo36CheckboxField();
        setPleaseSelectAMenuItemTo37CheckboxField();
        setPleaseSelectAMenuItemTo38CheckboxField();
        setPleaseSelectAMenuItemTo39CheckboxField();
        setPleaseSelectAMenuItemTo40CheckboxField();
        setPleaseSelectAMenuItemTo41CheckboxField();
        setPleaseSelectAMenuItemTo42CheckboxField();
        setPleaseSelectAMenuItemTo43CheckboxField();
        setPleaseSelectAMenuItemTo44CheckboxField();
        setPleaseSelectAMenuItemTo45CheckboxField();
        setPleaseSelectAMenuItemTo46CheckboxField();
        setPleaseSelectAMenuItemTo47CheckboxField();
        setPleaseSelectAMenuItemTo48CheckboxField();
        setPleaseSelectAMenuItemTo49CheckboxField();
        setPleaseSelectAMenuItemTo50CheckboxField();
        setNoAnnouncementsForYouTodayTextField();
        return this;
    }

    *//**
     * Set default value to No Announcements For You Today Text field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setNoAnnouncementsForYouTodayTextField() {
        return setNoAnnouncementsForYouTodayTextField(data.get("NO_ANNOUNCEMENTS_FOR_YOU_TODAY"));
    }

    *//**
     * Set value to No Announcements For You Today Text field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setNoAnnouncementsForYouTodayTextField(String noAnnouncementsForYouTodayValue) {
setElementText ( noAnnouncementsForYouToday,noAnnouncementsForYouTodayValue);
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo10CheckboxField() {
        if (!pleaseSelectAMenuItemTo10.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo10);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo11CheckboxField() {
        if (!pleaseSelectAMenuItemTo11.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo11);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo12CheckboxField() {
        if (!pleaseSelectAMenuItemTo12.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo12);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo13CheckboxField() {
        if (!pleaseSelectAMenuItemTo13.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo13);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo14CheckboxField() {
        if (!pleaseSelectAMenuItemTo14.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo14);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo15CheckboxField() {
        if (!pleaseSelectAMenuItemTo15.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo15);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo16CheckboxField() {
        if (!pleaseSelectAMenuItemTo16.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo16);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo17CheckboxField() {
        if (!pleaseSelectAMenuItemTo17.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo17);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo18CheckboxField() {
        if (!pleaseSelectAMenuItemTo18.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo18);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo19CheckboxField() {
        if (!pleaseSelectAMenuItemTo19.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo19);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo1CheckboxField() {
        if (!pleaseSelectAMenuItemTo1.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo1);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo20CheckboxField() {
        if (!pleaseSelectAMenuItemTo20.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo20);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo21CheckboxField() {
        if (!pleaseSelectAMenuItemTo21.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo21);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo22CheckboxField() {
        if (!pleaseSelectAMenuItemTo22.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo22);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo23CheckboxField() {
        if (!pleaseSelectAMenuItemTo23.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo23);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo24CheckboxField() {
        if (!pleaseSelectAMenuItemTo24.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo24);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo25CheckboxField() {
        if (!pleaseSelectAMenuItemTo25.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo25);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo26CheckboxField() {
        if (!pleaseSelectAMenuItemTo26.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo26);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo27CheckboxField() {
        if (!pleaseSelectAMenuItemTo27.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo27);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo28CheckboxField() {
        if (!pleaseSelectAMenuItemTo28.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo28);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo29CheckboxField() {
        if (!pleaseSelectAMenuItemTo29.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo29);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo2CheckboxField() {
        if (!pleaseSelectAMenuItemTo2.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo2);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo30CheckboxField() {
        if (!pleaseSelectAMenuItemTo30.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo30);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo31CheckboxField() {
        if (!pleaseSelectAMenuItemTo31.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo31);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo32CheckboxField() {
        if (!pleaseSelectAMenuItemTo32.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo32);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo33CheckboxField() {
        if (!pleaseSelectAMenuItemTo33.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo33);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo34CheckboxField() {
        if (!pleaseSelectAMenuItemTo34.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo34);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo35CheckboxField() {
        if (!pleaseSelectAMenuItemTo35.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo35);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo36CheckboxField() {
        if (!pleaseSelectAMenuItemTo36.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo36);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo37CheckboxField() {
        if (!pleaseSelectAMenuItemTo37.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo37);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo38CheckboxField() {
        if (!pleaseSelectAMenuItemTo38.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo38);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo39CheckboxField() {
        if (!pleaseSelectAMenuItemTo39.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo39);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo3CheckboxField() {
        if (!pleaseSelectAMenuItemTo3.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo3);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo40CheckboxField() {
        if (!pleaseSelectAMenuItemTo40.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo40);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo41CheckboxField() {
        if (!pleaseSelectAMenuItemTo41.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo41);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo42CheckboxField() {
        if (!pleaseSelectAMenuItemTo42.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo42);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo43CheckboxField() {
        if (!pleaseSelectAMenuItemTo43.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo43);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo44CheckboxField() {
        if (!pleaseSelectAMenuItemTo44.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo44);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo45CheckboxField() {
        if (!pleaseSelectAMenuItemTo45.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo45);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo46CheckboxField() {
        if (!pleaseSelectAMenuItemTo46.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo46);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo47CheckboxField() {
        if (!pleaseSelectAMenuItemTo47.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo47);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo48CheckboxField() {
        if (!pleaseSelectAMenuItemTo48.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo48);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo49CheckboxField() {
        if (!pleaseSelectAMenuItemTo49.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo49);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo4CheckboxField() {
        if (!pleaseSelectAMenuItemTo4.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo4);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo50CheckboxField() {
        if (!pleaseSelectAMenuItemTo50.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo50);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo5CheckboxField() {
        if (!pleaseSelectAMenuItemTo5.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo5);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo6CheckboxField() {
        if (!pleaseSelectAMenuItemTo6.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo6);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo7CheckboxField() {
        if (!pleaseSelectAMenuItemTo7.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo7);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo8CheckboxField() {
        if (!pleaseSelectAMenuItemTo8.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo8);
        }
        return this;
    }

    *//**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage setPleaseSelectAMenuItemTo9CheckboxField() {
        if (!pleaseSelectAMenuItemTo9.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo9);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo10CheckboxField() {
        if (pleaseSelectAMenuItemTo10.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo10);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo11CheckboxField() {
        if (pleaseSelectAMenuItemTo11.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo11);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo12CheckboxField() {
        if (pleaseSelectAMenuItemTo12.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo12);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo13CheckboxField() {
        if (pleaseSelectAMenuItemTo13.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo13);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo14CheckboxField() {
        if (pleaseSelectAMenuItemTo14.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo14);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo15CheckboxField() {
        if (pleaseSelectAMenuItemTo15.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo15);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo16CheckboxField() {
        if (pleaseSelectAMenuItemTo16.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo16);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo17CheckboxField() {
        if (pleaseSelectAMenuItemTo17.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo17);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo18CheckboxField() {
        if (pleaseSelectAMenuItemTo18.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo18);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo19CheckboxField() {
        if (pleaseSelectAMenuItemTo19.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo19);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo1CheckboxField() {
        if (pleaseSelectAMenuItemTo1.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo1);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo20CheckboxField() {
        if (pleaseSelectAMenuItemTo20.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo20);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo21CheckboxField() {
        if (pleaseSelectAMenuItemTo21.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo21);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo22CheckboxField() {
        if (pleaseSelectAMenuItemTo22.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo22);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo23CheckboxField() {
        if (pleaseSelectAMenuItemTo23.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo23);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo24CheckboxField() {
        if (pleaseSelectAMenuItemTo24.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo24);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo25CheckboxField() {
        if (pleaseSelectAMenuItemTo25.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo25);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo26CheckboxField() {
        if (pleaseSelectAMenuItemTo26.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo26);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo27CheckboxField() {
        if (pleaseSelectAMenuItemTo27.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo27);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo28CheckboxField() {
        if (pleaseSelectAMenuItemTo28.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo28);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo29CheckboxField() {
        if (pleaseSelectAMenuItemTo29.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo29);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo2CheckboxField() {
        if (pleaseSelectAMenuItemTo2.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo2);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo30CheckboxField() {
        if (pleaseSelectAMenuItemTo30.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo30);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo31CheckboxField() {
        if (pleaseSelectAMenuItemTo31.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo31);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo32CheckboxField() {
        if (pleaseSelectAMenuItemTo32.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo32);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo33CheckboxField() {
        if (pleaseSelectAMenuItemTo33.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo33);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo34CheckboxField() {
        if (pleaseSelectAMenuItemTo34.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo34);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo35CheckboxField() {
        if (pleaseSelectAMenuItemTo35.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo35);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo36CheckboxField() {
        if (pleaseSelectAMenuItemTo36.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo36);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo37CheckboxField() {
        if (pleaseSelectAMenuItemTo37.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo37);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo38CheckboxField() {
        if (pleaseSelectAMenuItemTo38.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo38);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo39CheckboxField() {
        if (pleaseSelectAMenuItemTo39.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo39);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo3CheckboxField() {
        if (pleaseSelectAMenuItemTo3.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo3);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo40CheckboxField() {
        if (pleaseSelectAMenuItemTo40.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo40);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo41CheckboxField() {
        if (pleaseSelectAMenuItemTo41.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo41);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo42CheckboxField() {
        if (pleaseSelectAMenuItemTo42.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo42);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo43CheckboxField() {
        if (pleaseSelectAMenuItemTo43.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo43);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo44CheckboxField() {
        if (pleaseSelectAMenuItemTo44.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo44);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo45CheckboxField() {
        if (pleaseSelectAMenuItemTo45.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo45);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo46CheckboxField() {
        if (pleaseSelectAMenuItemTo46.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo46);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo47CheckboxField() {
        if (pleaseSelectAMenuItemTo47.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo47);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo48CheckboxField() {
        if (pleaseSelectAMenuItemTo48.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo48);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo49CheckboxField() {
        if (pleaseSelectAMenuItemTo49.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo49);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo4CheckboxField() {
        if (pleaseSelectAMenuItemTo4.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo4);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo50CheckboxField() {
        if (pleaseSelectAMenuItemTo50.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo50);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo5CheckboxField() {
        if (pleaseSelectAMenuItemTo5.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo5);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo6CheckboxField() {
        if (pleaseSelectAMenuItemTo6.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo6);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo7CheckboxField() {
        if (pleaseSelectAMenuItemTo7.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo7);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo8CheckboxField() {
        if (pleaseSelectAMenuItemTo8.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo8);
        }
        return this;
    }

    *//**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage unsetPleaseSelectAMenuItemTo9CheckboxField() {
        if (pleaseSelectAMenuItemTo9.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo9);
        }
        return this;
    }

    *//**
     * Verify that the page loaded completely.
     *
     * @return the CIGeneralDetailsPage class instance.
     *//*
    public GeneralDetailsPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    public GeneralDetailsPage fillGeneraldetails() {

        return this;
    }

    public boolean checkUniquenumber() {
        return true;
    }

    public GeneralDetailsPage fillActivities() {
        return this;
    }
}*/
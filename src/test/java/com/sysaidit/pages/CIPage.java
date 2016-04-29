package com.sysaidit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class CIPage extends Page {
    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;

    @FindBy(css = "a[href='About.jsp?fancyBox=true']")
    WebElement about;

    @FindBy(css = "a[href='#/RemoteAccessibleAssets.jsp']")
    WebElement accessibleAssets;

    @FindBy(css = "a[href='#/RemoteAccessActiveSessions.jsp']")
    WebElement activeSessions;

    @FindBy(css = "a[href='#/SRActivities.jsp']")
    WebElement activities1;

    @FindBy(css = "a[href='#/TaskActivities.jsp']")
    WebElement activities2;

    @FindBy(css = "a[href='#/Home.jsp']")
    WebElement adminPortal;

    @FindBy(css = "a[href='#/UserManager.jsp']")
    WebElement administrators;

    @FindBy(css = "a[href='#/Alerts.jsp']")
    WebElement alerts;

    @FindBy(css = "a[href='#/HelpDesk.jsp?fromId=List']")
    WebElement all;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(3) span.drop.analytics a:nth-of-type(1)")
    WebElement analytics;

    @FindBy(css = "a[href='#/AnimatedSummary.jsp']")
    WebElement animatedSummary;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(1) div.megamenu_fullwidth.service-desk div:nth-of-type(5) div.controls.closed button:nth-of-type(1)")
    WebElement apply1;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(2) div.megamenu_fullwidth.assets div:nth-of-type(6) div.controls.closed button:nth-of-type(1)")
    WebElement apply2;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(3) div.megamenu_fullwidth.analytics div:nth-of-type(5) div.controls.closed button:nth-of-type(1)")
    WebElement apply3;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(4) div.megamenu_fullwidth.tools div:nth-of-type(6) div.controls.closed button:nth-of-type(1)")
    WebElement apply4;

    @FindBy(css = "a[href='#/function/loadKBFAQPage']")
    WebElement articles;

    @FindBy(css = "a[href='#/AvailabilityLog.jsp']")
    WebElement assetAvailability;

    @FindBy(css = "a[href='#/System.jsp']")
    WebElement assetGroups;

    @FindBy(css = "a[href='#/SystemList.jsp']")
    WebElement assetList;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=AssetTypes.jsp']")
    WebElement assetSettings;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(2) span.drop.assets a:nth-of-type(1)")
    WebElement assets;

    @FindBy(css = "a[href='#/UserSelfServiceLog.jsp']")
    WebElement auditLog;

    @FindBy(css = "a[href='#/RemoteAccessLog.jsp']")
    WebElement auditLogs;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(1) div.megamenu_fullwidth.service-desk div:nth-of-type(5) div.controls.closed a.admin-cancel")
    WebElement cancel1;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(2) div.megamenu_fullwidth.assets div:nth-of-type(6) div.controls.closed a.admin-cancel")
    WebElement cancel2;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(3) div.megamenu_fullwidth.analytics div:nth-of-type(5) div.controls.closed a.admin-cancel")
    WebElement cancel3;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(4) div.megamenu_fullwidth.tools div:nth-of-type(6) div.controls.closed a.admin-cancel")
    WebElement cancel4;

    @FindBy(css = "a[href='#/CatalogList.jsp']")
    WebElement catalog;

    @FindBy(css = "a[title='Change #25  (Sample Change) Add more storage to the file server']")
    WebElement change25SampleChangeAddMore;

    @FindBy(css = "a[title='Change Template #36  Proposal for major change ...']")
    WebElement changeTemplate36ProposalForMajor;

    @FindBy(css = "a[href='#/HelpDesk.jsp?fromId=ChangesList']")
    WebElement changes;

    @FindBy(css = "a[href='#/function/openChatConsole']")
    WebElement chatConsole;

    @FindBy(css = "a[href='#/ChatClosedChatsList.jsp']")
    WebElement chatSessions;

    @FindBy(css = "a[href='#/CIList.jsp']")
    WebElement ciList;

    @FindBy(css = "a[href='http://www.sysaid.com/edition-comparison.htm']")
    WebElement clickHereForFullComparisonMatrix;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=CITypeList.jsp']")
    WebElement cmdbSettings;

    @FindBy(css = "a[href='#/CompanyList.jsp']")
    WebElement companies;

    @FindBy(css = "a[title='Company - SysAid-technologies.com']")
    WebElement companySysaidtechnologiesCom;

    @FindBy(css = "a[href='http://www.sysaid.com/contact-support.htm?newWin=true']")
    WebElement contactSysaid;

    @FindBy(id = "lightboxAlertActionsButton")
    WebElement continue_1;

    @FindBy(css = "a[href='#/AssetManagementDash.jsp']")
    WebElement dashboard1;

    @FindBy(css = "a[href='#/Dashboard.jsp']")
    WebElement dashboard2;

    @FindBy(css = "a[href='#/EndUserManager.jsp']")
    WebElement endUsers;

    @FindBy(css = "a[href='EndUserPortal.jsp']")
    WebElement enduserPortal;

    @FindBy(css = "a[href='#/EventLog.jsp']")
    WebElement eventLog;

    @FindBy(css = "a[href='#/UserGroups.jsp']")
    WebElement groups;

    @FindBy(css = "a[href='#/function/openHelpWindow']")
    WebElement help;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=HelpDeskSettings.jsp']")
    WebElement helpDeskSettings;

    @FindBy(css = "a[title='Incident #6  Welcome to SysAid!']")
    WebElement incident6WelcomeToSysaid;

    @FindBy(css = "a[href='#/HelpDesk.jsp?fromId=IncidentsList']")
    WebElement incidents;

    @FindBy(css = "a[href='#/Statistics.jsp']")
    WebElement itBenchmark;

    @FindBy(css = "a[href='#/LastPoll.jsp']")
    WebElement lastPoll;

    @FindBy(css = "a[href='#/function/logout']")
    WebElement logout;

    @FindBy(css = "a[href='#/RemoteAccessMainPage.jsp']")
    WebElement main1;

    @FindBy(css = "a[href='#/UserSelfService.jsp']")
    WebElement main2;

    @FindBy(css = "a[href='#/HelpMat.jsp']")
    WebElement matrix;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=MonitorSettings.jsp']")
    WebElement monitoringSettings;

    @FindBy(css = "a[href='#/SysAidCalendar.jsp']")
    WebElement myCalendar;

    @FindBy(css = "a[href='#/CalendarSettings.jsp']")
    WebElement myCalendarSettings;

    @FindBy(css = "a[href='Preferences.jsp?fancyBox=true']")
    WebElement mySettings;

    @FindBy(css = "a[href='#/MonitorConfiguration.jsp?type=4']")
    WebElement networkDevices;

    @FindBy(css = "a[href='#/SREdit.jsp?id=0&fromId=IncidentsList&SR_Type=1&templateId=20']")
    WebElement newIncident;

    @FindBy(name = "sr-searchfield")
    WebElement noAnnouncementsForYouToday;

    @FindBy(css = "a[href='#/OnlineUsersList.jsp']")
    WebElement onlineUsers;

    @FindBy(css = "a[href='FavoritesList.jsp']")
    WebElement organizeFavorites;

    @FindBy(css = "a[href='http://www.sysaid.com/prices?utm_source=product&utm_medium=trial&utm_campaign=announcement']")
    WebElement ourPrices;

    public final String pageLoadedText = "";

    public final String pageUrl = "/SREdit.jsp?id=0&fromId=IncidentsList&SR_Type=1&templateID=20";

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=UserSelfServiceSettings.jsp']")
    WebElement passwordServicesSettings;

    @FindBy(css = "a[href='#/PatchManagementList.jsp']")
    WebElement patchManagement;

    @FindBy(css = "a[href='#/SREdit.jsp?id=0&SR_Type=8&fromId=PhoneCall']")
    WebElement phoneCall;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo1;

    @FindBy(css = "#22-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo10;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo11;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo12;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo13;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(4) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo14;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(5) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo15;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(6) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo16;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(7) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo17;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(8) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo18;

    @FindBy(css = "#25-items-list ul.menu_column_items li:nth-of-type(9) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo19;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo2;

    @FindBy(css = "#26-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo20;

    @FindBy(css = "#26-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo21;

    @FindBy(css = "#26-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo22;

    @FindBy(css = "#26-items-list ul.menu_column_items li:nth-of-type(4) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo23;

    @FindBy(css = "#26-items-list ul.menu_column_items li:nth-of-type(5) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo24;

    @FindBy(css = "#26-items-list ul.menu_column_items li:nth-of-type(6) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo25;

    @FindBy(css = "#27-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo26;

    @FindBy(css = "#27-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo27;

    @FindBy(css = "#27-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo28;

    @FindBy(css = "#27-items-list ul.menu_column_items li:nth-of-type(4) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo29;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo3;

    @FindBy(css = "#27-items-list ul.menu_column_items li:nth-of-type(5) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo30;

    @FindBy(css = "#28-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo31;

    @FindBy(css = "#55-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo32;

    @FindBy(css = "#55-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo33;

    @FindBy(css = "#55-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo34;

    @FindBy(css = "#55-items-list ul.menu_column_items li:nth-of-type(4) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo35;

    @FindBy(css = "#66-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo36;

    @FindBy(css = "#66-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo37;

    @FindBy(css = "#18-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo38;

    @FindBy(css = "#67-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo39;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(4) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo4;

    @FindBy(css = "#67-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo40;

    @FindBy(css = "#67-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo41;

    @FindBy(css = "#68-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo42;

    @FindBy(css = "#68-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo43;

    @FindBy(css = "#69-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo44;

    @FindBy(css = "#69-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo45;

    @FindBy(css = "#70-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo46;

    @FindBy(css = "#70-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo47;

    @FindBy(css = "#70-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo48;

    @FindBy(css = "#70-items-list ul.menu_column_items li:nth-of-type(4) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo49;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(5) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo5;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(6) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo6;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(7) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo7;

    @FindBy(css = "#16-items-list ul.menu_column_items li.item-17 a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo8;

    @FindBy(css = "#22-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo9;

    @FindBy(css = "a[title='Problem Template #35  ITIL Problem']")
    WebElement problemTemplate35ItilProblem;

    @FindBy(css = "a[title='Problem Template #3  Standard Problem']")
    WebElement problemTemplate3StandardProblem;

    @FindBy(css = "a[title='Problem Template #4  Minor Problem']")
    WebElement problemTemplate4MinorProblem;

    @FindBy(css = "a[href='#/HelpDesk.jsp?fromId=ProblemsList']")
    WebElement problems;

    @FindBy(css = "a[href='#/ProjectList.jsp']")
    WebElement projects;

    @FindBy(css = "a[href='#/RemoteAccessibleUsers.jsp']")
    WebElement registeredUsers;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=DashboardEdit.jsp']")
    WebElement reportdashboardSettings;

    @FindBy(css = "a[href='#/reports']")
    WebElement reports;

    @FindBy(css = "a[href='#/HelpDesk.jsp?fromId=RequestsList']")
    WebElement requests;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(1) div.megamenu_fullwidth.service-desk div:nth-of-type(5) div.controls.closed button:nth-of-type(2)")
    WebElement saveClose1;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(2) div.megamenu_fullwidth.assets div:nth-of-type(6) div.controls.closed button:nth-of-type(2)")
    WebElement saveClose2;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(3) div.megamenu_fullwidth.analytics div:nth-of-type(5) div.controls.closed button:nth-of-type(2)")
    WebElement saveClose3;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(4) div.megamenu_fullwidth.tools div:nth-of-type(6) div.controls.closed button:nth-of-type(2)")
    WebElement saveClose4;

    @FindBy(css = "a[href='#/function/openSendMessage']")
    WebElement sendMessage;

    @FindBy(css = "a[href='#/MonitorConfiguration.jsp?type=1']")
    WebElement servers;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(1) span.drop.service-desk a:nth-of-type(1)")
    WebElement serviceDesk;

    @FindBy(css = "a[href='#/function/openSLAWindow']")
    WebElement serviceManagement;

    @FindBy(css = "a[title='Service Record # 37 (DEFAULT)']")
    WebElement serviceRecord37Default;

    @FindBy(css = "a[title='Service Record # 38 (Error message in Outlook/Excel/Word/Powerpoint)']")
    WebElement serviceRecord38ErrorMessage;

    @FindBy(css = "a[title='Service Record # 39 (DEFAULT)']")
    WebElement serviceRecord39Default;

    @FindBy(css = "a[href='#/SubTabList.jsp']")
    WebElement serviceRecordActions;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=AgreementList.jsp']")
    WebElement slaslmSettings;

    @FindBy(css = "a[href='#/SoftwareList.jsp']")
    WebElement softwareProducts;

    @FindBy(css = "a[href='#/SupplierList.jsp']")
    WebElement supplierList;

    @FindBy(css = "a[href='http://www.sysaid.com/Sysforums/forums/home.page?newWin=true']")
    WebElement sysaidCommunity;

    @FindBy(css = "a[href='#/TaskList.jsp']")
    WebElement tasks;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=ProjectSettings.jsp']")
    WebElement tasksProjectsSettings;

    @FindBy(css = "#topstrip div:nth-of-type(2) ul.megamenu.fll li:nth-of-type(4) span.drop.tools a:nth-of-type(1)")
    WebElement tools;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=ImportSysAidUsers.jsp']")
    WebElement userManagementSettings;

    @FindBy(css = "a[href='#/MonitorConfiguration.jsp']")
    WebElement workstations;


    public CIPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }


    /**
     * Click on About Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAboutLink() {
        clickElement(about);
        return this;
    }

    /**
     * Click on Accessible Assets Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAccessibleAssetsLink() {
        clickElement(accessibleAssets);
        return this;
    }

    /**
     * Click on Active Sessions Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickActiveSessionsLink() {
        clickElement(activeSessions);
        return this;
    }

    /**
     * Click on Activities Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickActivities1Link() {
        clickElement(activities1);
        return this;
    }

    /**
     * Click on Activities Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickActivities2Link() {
        clickElement(activities2);
        return this;
    }

    /**
     * Click on Admin Portal Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAdminPortalLink() {
        clickElement(adminPortal);
        return this;
    }

    /**
     * Click on Administrators Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAdministratorsLink() {
        clickElement(administrators);
        return this;
    }

    /**
     * Click on Alerts Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAlertsLink() {
        clickElement(alerts);
        return this;
    }

    /**
     * Click on All Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAllLink() {
        clickElement(all);
        return this;
    }

    /**
     * Click on Analytics Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAnalyticsLink() {
        clickElement(analytics);
        return this;
    }

    /**
     * Click on Animated Summary Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAnimatedSummaryLink() {
        clickElement(animatedSummary);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickApply1Button() {
        clickElement(apply1);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickApply2Button() {
        clickElement(apply2);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickApply3Button() {
        clickElement(apply3);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickApply4Button() {
        clickElement(apply4);
        return this;
    }

    /**
     * Click on Articles Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickArticlesLink() {
        clickElement(articles);
        return this;
    }

    /**
     * Click on Asset Availability Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAssetAvailabilityLink() {
        clickElement(assetAvailability);
        return this;
    }

    /**
     * Click on Asset Groups Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAssetGroupsLink() {
        clickElement(assetGroups);
        return this;
    }

    /**
     * Click on Asset List Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAssetListLink() {
        clickElement(assetList);
        return this;
    }

    /**
     * Click on Asset Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAssetSettingsLink() {
        clickElement(assetSettings);
        return this;
    }

    /**
     * Click on Assets Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAssetsLink() {
        clickElement(assets);
        return this;
    }

    /**
     * Click on Audit Log Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAuditLogLink() {
        clickElement(auditLog);
        return this;
    }

    /**
     * Click on Audit Logs Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickAuditLogsLink() {
        clickElement(auditLogs);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCancel1Link() {
        clickElement(cancel1);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCancel2Link() {
        clickElement(cancel2);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCancel3Link() {
        clickElement(cancel3);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCancel4Link() {
        clickElement(cancel4);
        return this;
    }

    /**
     * Click on Catalog Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCatalogLink() {
        clickElement(catalog);
        return this;
    }

    /**
     * Click on Change 25 Sample Change Add More Stora Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickChange25SampleChangeAddMoreLink() {
        clickElement(change25SampleChangeAddMore);
        return this;
    }

    /**
     * Click on Change Template 36 Proposal For Major Ch Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickChangeTemplate36ProposalForMajorLink() {
        clickElement(changeTemplate36ProposalForMajor);
        return this;
    }

    /**
     * Click on Changes Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickChangesLink() {
        clickElement(changes);
        return this;
    }

    /**
     * Click on Chat Console Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickChatConsoleLink() {
        clickElement(chatConsole);
        return this;
    }

    /**
     * Click on Chat Sessions Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickChatSessionsLink() {
        clickElement(chatSessions);
        return this;
    }

    /**
     * Click on Ci List Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCiListLink() {
        clickElement(ciList);
        return this;
    }

    /**
     * Click on Click Here For Full Comparison Matrix. Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickClickHereForFullComparisonMatrixLink() {
        clickElement(clickHereForFullComparisonMatrix);
        return this;
    }

    /**
     * Click on Cmdb Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCmdbSettingsLink() {
        clickElement(cmdbSettings);
        return this;
    }

    /**
     * Click on Companies Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCompaniesLink() {
        clickElement(companies);
        return this;
    }

    /**
     * Click on Company Sysaidtechnologies.com Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickCompanySysaidtechnologiesComLink() {
        clickElement(companySysaidtechnologiesCom);
        return this;
    }

    /**
     * Click on Contact Sysaid Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickContactSysaidLink() {
        clickElement(contactSysaid);
        return this;
    }

    /**
     * Click on Continue Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickContinueButton() {
        clickElement(continue_1);
        return this;
    }

    /**
     * Click on Dashboard Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickDashboard1Link() {
        clickElement(dashboard1);
        return this;
    }

    /**
     * Click on Dashboard Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickDashboard2Link() {
        clickElement(dashboard2);
        return this;
    }

    /**
     * Click on End Users Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickEndUsersLink() {
        clickElement(endUsers);
        return this;
    }

    /**
     * Click on Enduser Portal Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickEnduserPortalLink() {
        clickElement(enduserPortal);
        return this;
    }

    /**
     * Click on Event Log Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickEventLogLink() {
        clickElement(eventLog);
        return this;
    }

    /**
     * Click on Groups Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickGroupsLink() {
        clickElement(groups);
        return this;
    }

    /**
     * Click on Help Desk Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickHelpDeskSettingsLink() {
        clickElement(helpDeskSettings);
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickHelpLink() {
        clickElement(help);
        return this;
    }

    /**
     * Click on Incident 6 Welcome To Sysaid Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickIncident6WelcomeToSysaidLink() {
        clickElement(incident6WelcomeToSysaid);
        return this;
    }

    /**
     * Click on Incidents Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickIncidentsLink() {
        clickElement(incidents);
        return this;
    }

    /**
     * Click on It Benchmark Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickItBenchmarkLink() {
        clickElement(itBenchmark);
        return this;
    }

    /**
     * Click on Last Poll Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickLastPollLink() {
        clickElement(lastPoll);
        return this;
    }

    /**
     * Click on Logout Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickLogoutLink() {
        clickElement(logout);
        return this;
    }

    /**
     * Click on Main Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickMain1Link() {
        clickElement(main1);
        return this;
    }

    /**
     * Click on Main Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickMain2Link() {
        clickElement(main2);
        return this;
    }

    /**
     * Click on Matrix Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickMatrixLink() {
        clickElement(matrix);
        return this;
    }

    /**
     * Click on Monitoring Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickMonitoringSettingsLink() {
        clickElement(monitoringSettings);
        return this;
    }

    /**
     * Click on My Calendar Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickMyCalendarLink() {
        clickElement(myCalendar);
        return this;
    }

    /**
     * Click on My Calendar Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickMyCalendarSettingsLink() {
        clickElement(myCalendarSettings);
        return this;
    }

    /**
     * Click on My Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickMySettingsLink() {
        clickElement(mySettings);
        return this;
    }

    /**
     * Click on Network Devices Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickNetworkDevicesLink() {
        clickElement(networkDevices);
        return this;
    }

    /**
     * Click on New Incident Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickNewIncidentLink() {
        clickElement(newIncident);
        return this;
    }

    /**
     * Click on Online Users Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickOnlineUsersLink() {
        clickElement(onlineUsers);
        return this;
    }

    /**
     * Click on Organize Favorites Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickOrganizeFavoritesLink() {
        clickElement(organizeFavorites);
        return this;
    }

    /**
     * Click on Our Prices Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickOurPricesLink() {
        clickElement(ourPrices);
        return this;
    }

    /**
     * Click on Password Services Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickPasswordServicesSettingsLink() {
        clickElement(passwordServicesSettings);
        return this;
    }

    /**
     * Click on Patch Management Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickPatchManagementLink() {
        clickElement(patchManagement);
        return this;
    }

    /**
     * Click on Phone Call Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickPhoneCallLink() {
        clickElement(phoneCall);
        return this;
    }

    /**
     * Click on Problem Template 35 Itil Problem Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickProblemTemplate35ItilProblemLink() {
        clickElement(problemTemplate35ItilProblem);
        return this;
    }

    /**
     * Click on Problem Template 3 Standard Problem Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickProblemTemplate3StandardProblemLink() {
        clickElement(problemTemplate3StandardProblem);
        return this;
    }

    /**
     * Click on Problem Template 4 Minor Problem Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickProblemTemplate4MinorProblemLink() {
        clickElement(problemTemplate4MinorProblem);
        return this;
    }

    /**
     * Click on Problems Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickProblemsLink() {
        clickElement(problems);
        return this;
    }

    /**
     * Click on Projects Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickProjectsLink() {
        clickElement(projects);
        return this;
    }

    /**
     * Click on Registered Users Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickRegisteredUsersLink() {
        clickElement(registeredUsers);
        return this;
    }

    /**
     * Click on Reportdashboard Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickReportdashboardSettingsLink() {
        clickElement(reportdashboardSettings);
        return this;
    }

    /**
     * Click on Reports Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickReportsLink() {
        clickElement(reports);
        return this;
    }

    /**
     * Click on Requests Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickRequestsLink() {
        clickElement(requests);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSaveClose1Button() {
        clickElement(saveClose1);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSaveClose2Button() {
        clickElement(saveClose2);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSaveClose3Button() {
        clickElement(saveClose3);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSaveClose4Button() {
        clickElement(saveClose4);
        return this;
    }

    /**
     * Click on Send Message Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSendMessageLink() {
        clickElement(sendMessage);
        return this;
    }

    /**
     * Click on Servers Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickServersLink() {
        clickElement(servers);
        return this;
    }

    /**
     * Click on Service Desk Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickServiceDeskLink() {
        clickElement(serviceDesk);
        return this;
    }

    /**
     * Click on Service Management Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickServiceManagementLink() {
        clickElement(serviceManagement);
        return this;
    }

    /**
     * Click on Service Record 37 Default Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickServiceRecord37DefaultLink() {
        clickElement(serviceRecord37Default);
        return this;
    }

    /**
     * Click on Service Record 38 Error Message In Outl Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickServiceRecord38ErrorMessageLink() {
        clickElement(serviceRecord38ErrorMessage);
        return this;
    }

    /**
     * Click on Service Record 39 Default Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickServiceRecord39DefaultLink() {
        clickElement(serviceRecord39Default);
        return this;
    }

    /**
     * Click on Service Record Actions Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickServiceRecordActionsLink() {
        clickElement(serviceRecordActions);
        return this;
    }

    /**
     * Click on Slaslm Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSlaslmSettingsLink() {
        clickElement(slaslmSettings);
        return this;
    }

    /**
     * Click on Software Products Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSoftwareProductsLink() {
        clickElement(softwareProducts);
        return this;
    }

    /**
     * Click on Supplier List Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSupplierListLink() {
        clickElement(supplierList);
        return this;
    }

    /**
     * Click on Sysaid Community Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickSysaidCommunityLink() {
        clickElement(sysaidCommunity);
        return this;
    }

    /**
     * Click on Tasks Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickTasksLink() {
        clickElement(tasks);
        return this;
    }

    /**
     * Click on Tasks Projects Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickTasksProjectsSettingsLink() {
        clickElement(tasksProjectsSettings);
        return this;
    }

    /**
     * Click on Tools Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickToolsLink() {
        clickElement(tools);
        return this;
    }

    /**
     * Click on User Management Settings Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickUserManagementSettingsLink() {
        clickElement(userManagementSettings);
        return this;
    }

    /**
     * Click on Workstations Link.
     *
     * @return the CIPage class instance.
     */
    public CIPage clickWorkstationsLink() {
        clickElement(workstations);
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the CIPage class instance.
     */
    public CIPage fill() {
        setPleaseSelectAMenuItemTo1CheckboxField();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        setNoAnnouncementsForYouTodayTextField();
        return this;
    }

    /**
     * Set default value to No Announcements For You Today Text field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setNoAnnouncementsForYouTodayTextField() {
        return setNoAnnouncementsForYouTodayTextField(data.get("NO_ANNOUNCEMENTS_FOR_YOU_TODAY"));
    }

    /**
     * Set value to No Announcements For You Today Text field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setNoAnnouncementsForYouTodayTextField(String noAnnouncementsForYouTodayValue) {
        setElementText ( noAnnouncementsForYouToday,noAnnouncementsForYouTodayValue);
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo10CheckboxField() {
        if (!pleaseSelectAMenuItemTo10.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo10);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo11CheckboxField() {
        if (!pleaseSelectAMenuItemTo11.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo11);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo12CheckboxField() {
        if (!pleaseSelectAMenuItemTo12.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo12);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo13CheckboxField() {
        if (!pleaseSelectAMenuItemTo13.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo13);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo14CheckboxField() {
        if (!pleaseSelectAMenuItemTo14.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo14);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo15CheckboxField() {
        if (!pleaseSelectAMenuItemTo15.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo15);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo16CheckboxField() {
        if (!pleaseSelectAMenuItemTo16.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo16);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo17CheckboxField() {
        if (!pleaseSelectAMenuItemTo17.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo17);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo18CheckboxField() {
        if (!pleaseSelectAMenuItemTo18.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo18);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo19CheckboxField() {
        if (!pleaseSelectAMenuItemTo19.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo19);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo1CheckboxField() {
        if (!pleaseSelectAMenuItemTo1.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo1);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo20CheckboxField() {
        if (!pleaseSelectAMenuItemTo20.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo20);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo21CheckboxField() {
        if (!pleaseSelectAMenuItemTo21.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo21);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo22CheckboxField() {
        if (!pleaseSelectAMenuItemTo22.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo22);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo23CheckboxField() {
        if (!pleaseSelectAMenuItemTo23.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo23);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo24CheckboxField() {
        if (!pleaseSelectAMenuItemTo24.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo24);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo25CheckboxField() {
        if (!pleaseSelectAMenuItemTo25.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo25);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo26CheckboxField() {
        if (!pleaseSelectAMenuItemTo26.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo26);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo27CheckboxField() {
        if (!pleaseSelectAMenuItemTo27.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo27);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo28CheckboxField() {
        if (!pleaseSelectAMenuItemTo28.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo28);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo29CheckboxField() {
        if (!pleaseSelectAMenuItemTo29.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo29);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo2CheckboxField() {
        if (!pleaseSelectAMenuItemTo2.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo2);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo30CheckboxField() {
        if (!pleaseSelectAMenuItemTo30.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo30);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo31CheckboxField() {
        if (!pleaseSelectAMenuItemTo31.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo31);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo32CheckboxField() {
        if (!pleaseSelectAMenuItemTo32.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo32);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo33CheckboxField() {
        if (!pleaseSelectAMenuItemTo33.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo33);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo34CheckboxField() {
        if (!pleaseSelectAMenuItemTo34.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo34);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo35CheckboxField() {
        if (!pleaseSelectAMenuItemTo35.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo35);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo36CheckboxField() {
        if (!pleaseSelectAMenuItemTo36.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo36);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo37CheckboxField() {
        if (!pleaseSelectAMenuItemTo37.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo37);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo38CheckboxField() {
        if (!pleaseSelectAMenuItemTo38.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo38);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo39CheckboxField() {
        if (!pleaseSelectAMenuItemTo39.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo39);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo3CheckboxField() {
        if (!pleaseSelectAMenuItemTo3.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo3);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo40CheckboxField() {
        if (!pleaseSelectAMenuItemTo40.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo40);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo41CheckboxField() {
        if (!pleaseSelectAMenuItemTo41.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo41);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo42CheckboxField() {
        if (!pleaseSelectAMenuItemTo42.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo42);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo43CheckboxField() {
        if (!pleaseSelectAMenuItemTo43.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo43);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo44CheckboxField() {
        if (!pleaseSelectAMenuItemTo44.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo44);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo45CheckboxField() {
        if (!pleaseSelectAMenuItemTo45.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo45);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo46CheckboxField() {
        if (!pleaseSelectAMenuItemTo46.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo46);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo47CheckboxField() {
        if (!pleaseSelectAMenuItemTo47.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo47);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo48CheckboxField() {
        if (!pleaseSelectAMenuItemTo48.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo48);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo49CheckboxField() {
        if (!pleaseSelectAMenuItemTo49.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo49);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo4CheckboxField() {
        if (!pleaseSelectAMenuItemTo4.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo4);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo5CheckboxField() {
        if (!pleaseSelectAMenuItemTo5.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo5);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo6CheckboxField() {
        if (!pleaseSelectAMenuItemTo6.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo6);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo7CheckboxField() {
        if (!pleaseSelectAMenuItemTo7.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo7);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo8CheckboxField() {
        if (!pleaseSelectAMenuItemTo8.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo8);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage setPleaseSelectAMenuItemTo9CheckboxField() {
        if (!pleaseSelectAMenuItemTo9.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo9);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo10CheckboxField() {
        if (pleaseSelectAMenuItemTo10.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo10);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo11CheckboxField() {
        if (pleaseSelectAMenuItemTo11.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo11);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo12CheckboxField() {
        if (pleaseSelectAMenuItemTo12.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo12);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo13CheckboxField() {
        if (pleaseSelectAMenuItemTo13.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo13);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo14CheckboxField() {
        if (pleaseSelectAMenuItemTo14.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo14);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo15CheckboxField() {
        if (pleaseSelectAMenuItemTo15.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo15);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo16CheckboxField() {
        if (pleaseSelectAMenuItemTo16.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo16);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo17CheckboxField() {
        if (pleaseSelectAMenuItemTo17.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo17);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo18CheckboxField() {
        if (pleaseSelectAMenuItemTo18.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo18);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo19CheckboxField() {
        if (pleaseSelectAMenuItemTo19.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo19);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo1CheckboxField() {
        if (pleaseSelectAMenuItemTo1.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo1);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo20CheckboxField() {
        if (pleaseSelectAMenuItemTo20.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo20);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo21CheckboxField() {
        if (pleaseSelectAMenuItemTo21.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo21);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo22CheckboxField() {
        if (pleaseSelectAMenuItemTo22.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo22);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo23CheckboxField() {
        if (pleaseSelectAMenuItemTo23.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo23);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo24CheckboxField() {
        if (pleaseSelectAMenuItemTo24.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo24);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo25CheckboxField() {
        if (pleaseSelectAMenuItemTo25.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo25);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo26CheckboxField() {
        if (pleaseSelectAMenuItemTo26.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo26);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo27CheckboxField() {
        if (pleaseSelectAMenuItemTo27.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo27);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo28CheckboxField() {
        if (pleaseSelectAMenuItemTo28.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo28);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo29CheckboxField() {
        if (pleaseSelectAMenuItemTo29.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo29);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo2CheckboxField() {
        if (pleaseSelectAMenuItemTo2.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo2);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo30CheckboxField() {
        if (pleaseSelectAMenuItemTo30.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo30);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo31CheckboxField() {
        if (pleaseSelectAMenuItemTo31.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo31);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo32CheckboxField() {
        if (pleaseSelectAMenuItemTo32.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo32);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo33CheckboxField() {
        if (pleaseSelectAMenuItemTo33.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo33);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo34CheckboxField() {
        if (pleaseSelectAMenuItemTo34.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo34);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo35CheckboxField() {
        if (pleaseSelectAMenuItemTo35.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo35);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo36CheckboxField() {
        if (pleaseSelectAMenuItemTo36.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo36);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo37CheckboxField() {
        if (pleaseSelectAMenuItemTo37.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo37);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo38CheckboxField() {
        if (pleaseSelectAMenuItemTo38.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo38);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo39CheckboxField() {
        if (pleaseSelectAMenuItemTo39.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo39);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo3CheckboxField() {
        if (pleaseSelectAMenuItemTo3.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo3);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo40CheckboxField() {
        if (pleaseSelectAMenuItemTo40.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo40);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo41CheckboxField() {
        if (pleaseSelectAMenuItemTo41.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo41);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo42CheckboxField() {
        if (pleaseSelectAMenuItemTo42.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo42);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo43CheckboxField() {
        if (pleaseSelectAMenuItemTo43.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo43);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo44CheckboxField() {
        if (pleaseSelectAMenuItemTo44.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo44);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo45CheckboxField() {
        if (pleaseSelectAMenuItemTo45.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo45);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo46CheckboxField() {
        if (pleaseSelectAMenuItemTo46.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo46);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo47CheckboxField() {
        if (pleaseSelectAMenuItemTo47.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo47);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo48CheckboxField() {
        if (pleaseSelectAMenuItemTo48.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo48);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo49CheckboxField() {
        if (pleaseSelectAMenuItemTo49.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo49);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo4CheckboxField() {
        if (pleaseSelectAMenuItemTo4.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo4);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo5CheckboxField() {
        if (pleaseSelectAMenuItemTo5.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo5);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo6CheckboxField() {
        if (pleaseSelectAMenuItemTo6.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo6);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo7CheckboxField() {
        if (pleaseSelectAMenuItemTo7.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo7);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo8CheckboxField() {
        if (pleaseSelectAMenuItemTo8.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo8);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIPage class instance.
     */
    public CIPage unsetPleaseSelectAMenuItemTo9CheckboxField() {
        if (pleaseSelectAMenuItemTo9.isSelected()) {
            clickElement(pleaseSelectAMenuItemTo9);
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the CIPage class instance.
     */
    public CIPage verifyPageLoaded() {
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
     * @return the CIPage class instance.
     */
    public CIPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
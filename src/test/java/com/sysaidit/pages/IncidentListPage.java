package com.sysaidit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class IncidentListPage extends Page {
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

    @FindBy(css = "a[title='Administrator - sysaid']")
    WebElement administratorSysaid;

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

    @FindBy(css = "a[href='#/BIDashboard.jsp']")
    WebElement biAnalytics;

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

    @FindBy(css = "a[href='http://www.sysaid.com/contact-support.htm?newWin=true']")
    WebElement contactSysaid;

    @FindBy(id = "lightboxAlertActionsButton")
    WebElement continue1;

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

    @FindBy(css = "a[title='Incident #509  DEFAULT']")
    WebElement incident509Default;

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

    public final String pageLoadedText = "";

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

    @FindBy(css = "#66-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo38;

    @FindBy(css = "#18-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo39;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(4) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo4;

    @FindBy(css = "#67-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo40;

    @FindBy(css = "#67-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo41;

    @FindBy(css = "#67-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo42;

    @FindBy(css = "#68-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo43;

    @FindBy(css = "#68-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo44;

    @FindBy(css = "#69-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo45;

    @FindBy(css = "#69-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo46;

    @FindBy(css = "#70-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo47;

    @FindBy(css = "#70-items-list ul.menu_column_items li:nth-of-type(2) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo48;

    @FindBy(css = "#70-items-list ul.menu_column_items li:nth-of-type(3) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo49;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(5) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo5;

    @FindBy(css = "#70-items-list ul.menu_column_items li:nth-of-type(4) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo50;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(6) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo6;

    @FindBy(css = "#6-items-list ul.menu_column_items li:nth-of-type(7) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo7;

    @FindBy(css = "#16-items-list ul.menu_column_items li.item-17 a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo8;

    @FindBy(css = "#22-items-list ul.menu_column_items li:nth-of-type(1) a.truncate input.permission-checkbox[type='checkbox']")
    WebElement pleaseSelectAMenuItemTo9;

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

    @FindBy(css = "a[title='Service Record # 509 (DEFAULT)']")
    WebElement serviceRecord509Default;

    @FindBy(css = "a[title='Service Record # 511 (DEFAULT)']")
    WebElement serviceRecord511Default;

    @FindBy(css = "a[href='#/SubTabList.jsp']")
    WebElement serviceRecordActions;

    @FindBy(css = "a[href='#/Settings.jsp?selectedItem=AgreementList.jsp']")
    WebElement slaslmSettings;

    @FindBy(css = "a[href='#/SoftwareList.jsp']")
    WebElement softwareProducts;

    @FindBy(css = "a[href='#/SupplierList.jsp']")
    WebElement supplierList;

    @FindBy(css = "a[href='http://www.sysaid.com/product/sysaid/release-upgrades?utm_source=product&utm_medium=announcement&utm_campaign=201013']")
    WebElement sysaid911ReleaseNotesHere;

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


    /*******************************************/
   // @FindBy(xpath = "//*[@class='drop service-desk']")
    @FindBy(xpath = "//*[@id='topstrip']/div[2]/ul/li[1]/span/a[1]")
    WebElement ServiceDeskDrop;

    @FindBy(xpath = "//*[@class='truncate'][contains(text(),'Incidents')]")
    WebElement IncidentsButton;

    @FindBy(xpath = "")
    WebElement IconsAddNewIncedent;



    //click buttons
    public IncidentListPage ClickServiceDeskDrop( ) {
        clickElement(ServiceDeskDrop);
        return this;
    }
    public IncidentListPage ClickIncidentsButton( ) {
        clickElement(IncidentsButton);
        return this;
    }



    public void waitForServiceDeskDrop()   {
        waitUntilIsLoaded(ServiceDeskDrop);
    }


    /********************************************************/

    public IncidentListPage(WebDriver driver) {
        
super(driver);
        PageFactory.initElements(driver, this);
    }

 
    /**
     * Click on About Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAboutLink() {
       clickElement(about);
        return this;
    }

    /**
     * Click on Accessible Assets Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAccessibleAssetsLink() {
       clickElement(accessibleAssets);
        return this;
    }

    /**
     * Click on Active Sessions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickActiveSessionsLink() {
       clickElement(activeSessions);
        return this;
    }

    /**
     * Click on Activities Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickActivities1Link() {
       clickElement(activities1);
        return this;
    }

    /**
     * Click on Activities Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickActivities2Link() {
       clickElement(activities2);
        return this;
    }

    /**
     * Click on Admin Portal Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAdminPortalLink() {
       clickElement(adminPortal);
        return this;
    }

    /**
     * Click on Administrator Sysaid Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAdministratorSysaidLink() {
       clickElement(administratorSysaid);
        return this;
    }

    /**
     * Click on Administrators Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAdministratorsLink() {
       clickElement(administrators);
        return this;
    }

    /**
     * Click on Alerts Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAlertsLink() {
       clickElement(alerts);
        return this;
    }

    /**
     * Click on All Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAllLink() {
       clickElement(all);
        return this;
    }

    /**
     * Click on Analytics Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAnalyticsLink() {
       clickElement(analytics);
        return this;
    }

    /**
     * Click on Animated Summary Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAnimatedSummaryLink() {
       clickElement(animatedSummary);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickApply1Button() {
clickElement(apply1);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickApply2Button() {
clickElement(apply2);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickApply3Button() {
clickElement(apply3);
        return this;
    }

    /**
     * Click on Apply Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickApply4Button() {
clickElement(apply4);
        return this;
    }

    /**
     * Click on Articles Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickArticlesLink() {
       clickElement(articles);
        return this;
    }

    /**
     * Click on Asset Availability Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAssetAvailabilityLink() {
       clickElement(assetAvailability);
        return this;
    }

    /**
     * Click on Asset Groups Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAssetGroupsLink() {
       clickElement(assetGroups);
        return this;
    }

    /**
     * Click on Asset List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAssetListLink() {
       clickElement(assetList);
        return this;
    }

    /**
     * Click on Asset Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAssetSettingsLink() {
       clickElement(assetSettings);
        return this;
    }

    /**
     * Click on Assets Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAssetsLink() {
       clickElement(assets);
        return this;
    }

    /**
     * Click on Audit Log Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAuditLogLink() {
       clickElement(auditLog);
        return this;
    }

    /**
     * Click on Audit Logs Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickAuditLogsLink() {
       clickElement(auditLogs);
        return this;
    }

    /**
     * Click on Bi Analytics Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickBiAnalyticsLink() {
       clickElement(biAnalytics);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickCancel1Link() {
       clickElement(cancel1);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickCancel2Link() {
       clickElement(cancel2);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickCancel3Link() {
       clickElement(cancel3);
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickCancel4Link() {
       clickElement(cancel4);
        return this;
    }

    /**
     * Click on Catalog Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickCatalogLink() {
       clickElement(catalog);
        return this;
    }

    /**
     * Click on Changes Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickChangesLink() {
       clickElement(changes);
        return this;
    }

    /**
     * Click on Chat Console Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickChatConsoleLink() {
       clickElement(chatConsole);
        return this;
    }

    /**
     * Click on Chat Sessions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickChatSessionsLink() {
       clickElement(chatSessions);
        return this;
    }

    /**
     * Click on Ci List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickCiListLink() {
       clickElement(ciList);
        return this;
    }

    /**
     * Click on Click Here For Full Comparison Matrix. Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickClickHereForFullComparisonMatrixLink() {
       clickElement(clickHereForFullComparisonMatrix);
        return this;
    }

    /**
     * Click on Cmdb Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickCmdbSettingsLink() {
       clickElement(cmdbSettings);
        return this;
    }

    /**
     * Click on Companies Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickCompaniesLink() {
       clickElement(companies);
        return this;
    }

    /**
     * Click on Contact Sysaid Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickContactSysaidLink() {
       clickElement(contactSysaid);
        return this;
    }

    /**
     * Click on Continue Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickContinueButton() {
clickElement(continue1);
        return this;
    }

    /**
     * Click on Dashboard Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickDashboard1Link() {
       clickElement(dashboard1);
        return this;
    }

    /**
     * Click on Dashboard Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickDashboard2Link() {
       clickElement(dashboard2);
        return this;
    }

    /**
     * Click on End Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickEndUsersLink() {
       clickElement(endUsers);
        return this;
    }

    /**
     * Click on Enduser Portal Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickEnduserPortalLink() {
       clickElement(enduserPortal);
        return this;
    }

    /**
     * Click on Event Log Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickEventLogLink() {
       clickElement(eventLog);
        return this;
    }

    /**
     * Click on Groups Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickGroupsLink() {
       clickElement(groups);
        return this;
    }

    /**
     * Click on Help Desk Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickHelpDeskSettingsLink() {
       clickElement(helpDeskSettings);
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickHelpLink() {
       clickElement(help);
        return this;
    }

    /**
     * Click on Incident 509 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickIncident509DefaultLink() {
       clickElement(incident509Default);
        return this;
    }

    /**
     * Click on Incidents Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickIncidentsLink() {
       clickElement(incidents);
        return this;
    }

    /**
     * Click on It Benchmark Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickItBenchmarkLink() {
       clickElement(itBenchmark);
        return this;
    }

    /**
     * Click on Last Poll Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickLastPollLink() {
       clickElement(lastPoll);
        return this;
    }

    /**
     * Click on Logout Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickLogoutLink() {
       clickElement(logout);
        return this;
    }

    /**
     * Click on Main Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickMain1Link() {
       clickElement(main1);
        return this;
    }

    /**
     * Click on Main Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickMain2Link() {
       clickElement(main2);
        return this;
    }

    /**
     * Click on Matrix Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickMatrixLink() {
       clickElement(matrix);
        return this;
    }

    /**
     * Click on Monitoring Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickMonitoringSettingsLink() {
       clickElement(monitoringSettings);
        return this;
    }

    /**
     * Click on My Calendar Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickMyCalendarLink() {
       clickElement(myCalendar);
        return this;
    }

    /**
     * Click on My Calendar Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickMyCalendarSettingsLink() {
       clickElement(myCalendarSettings);
        return this;
    }

    /**
     * Click on My Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickMySettingsLink() {
       clickElement(mySettings);
        return this;
    }

    /**
     * Click on Network Devices Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickNetworkDevicesLink() {
       clickElement(networkDevices);
        return this;
    }

    /**
     * Click on New Incident Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickNewIncidentLink() {
       clickElement(newIncident);
        return this;
    }

    /**
     * Click on Online Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickOnlineUsersLink() {
       clickElement(onlineUsers);
        return this;
    }

    /**
     * Click on Organize Favorites Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickOrganizeFavoritesLink() {
       clickElement(organizeFavorites);
        return this;
    }

    /**
     * Click on Password Services Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickPasswordServicesSettingsLink() {
       clickElement(passwordServicesSettings);
        return this;
    }

    /**
     * Click on Patch Management Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickPatchManagementLink() {
       clickElement(patchManagement);
        return this;
    }

    /**
     * Click on Phone Call Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickPhoneCallLink() {
       clickElement(phoneCall);
        return this;
    }

    /**
     * Click on Problems Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickProblemsLink() {
       clickElement(problems);
        return this;
    }

    /**
     * Click on Projects Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickProjectsLink() {
       clickElement(projects);
        return this;
    }

    /**
     * Click on Registered Users Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickRegisteredUsersLink() {
       clickElement(registeredUsers);
        return this;
    }

    /**
     * Click on Reportdashboard Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickReportdashboardSettingsLink() {
       clickElement(reportdashboardSettings);
        return this;
    }

    /**
     * Click on Reports Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickReportsLink() {
       clickElement(reports);
        return this;
    }

    /**
     * Click on Requests Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickRequestsLink() {
       clickElement(requests);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSaveClose1Button() {
clickElement(saveClose1);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSaveClose2Button() {
clickElement(saveClose2);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSaveClose3Button() {
clickElement(saveClose3);
        return this;
    }

    /**
     * Click on Save Close Button.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSaveClose4Button() {
clickElement(saveClose4);
        return this;
    }

    /**
     * Click on Send Message Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSendMessageLink() {
       clickElement(sendMessage);
        return this;
    }

    /**
     * Click on Servers Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickServersLink() {
       clickElement(servers);
        return this;
    }

    /**
     * Click on Service Desk Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickServiceDeskLink() {
       clickElement(serviceDesk);
        return this;
    }

    /**
     * Click on Service Management Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickServiceManagementLink() {
       clickElement(serviceManagement);
        return this;
    }

    /**
     * Click on Service Record 509 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickServiceRecord509DefaultLink() {
       clickElement(serviceRecord509Default);
        return this;
    }

    /**
     * Click on Service Record 511 Default Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickServiceRecord511DefaultLink() {
       clickElement(serviceRecord511Default);
        return this;
    }

    /**
     * Click on Service Record Actions Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickServiceRecordActionsLink() {
       clickElement(serviceRecordActions);
        return this;
    }

    /**
     * Click on Slaslm Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSlaslmSettingsLink() {
       clickElement(slaslmSettings);
        return this;
    }

    /**
     * Click on Software Products Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSoftwareProductsLink() {
       clickElement(softwareProducts);
        return this;
    }

    /**
     * Click on Supplier List Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSupplierListLink() {
       clickElement(supplierList);
        return this;
    }

    /**
     * Click on Sysaid 9.1.1 Release Notes Here Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSysaid911ReleaseNotesHereLink() {
       clickElement(sysaid911ReleaseNotesHere);
        return this;
    }

    /**
     * Click on Sysaid Community Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickSysaidCommunityLink() {
       clickElement(sysaidCommunity);
        return this;
    }

    /**
     * Click on Tasks Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickTasksLink() {
       clickElement(tasks);
        return this;
    }

    /**
     * Click on Tasks Projects Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickTasksProjectsSettingsLink() {
       clickElement(tasksProjectsSettings);
        return this;
    }

    /**
     * Click on Tools Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickToolsLink() {
       clickElement(tools);
        return this;
    }

    /**
     * Click on User Management Settings Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickUserManagementSettingsLink() {
       clickElement(userManagementSettings);
        return this;
    }

    /**
     * Click on Workstations Link.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage clickWorkstationsLink() {
       clickElement(workstations);
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage fill() {
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

    /**
     * Set default value to No Announcements For You Today Text field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setNoAnnouncementsForYouTodayTextField() {
        return setNoAnnouncementsForYouTodayTextField(data.get("NO_ANNOUNCEMENTS_FOR_YOU_TODAY"));
    }

    /**
     * Set value to No Announcements For You Today Text field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setNoAnnouncementsForYouTodayTextField(String noAnnouncementsForYouTodayValue) {
setElementText ( noAnnouncementsForYouToday,noAnnouncementsForYouTodayValue);
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo10CheckboxField() {
        if (!pleaseSelectAMenuItemTo10.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo10);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo11CheckboxField() {
        if (!pleaseSelectAMenuItemTo11.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo11);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo12CheckboxField() {
        if (!pleaseSelectAMenuItemTo12.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo12);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo13CheckboxField() {
        if (!pleaseSelectAMenuItemTo13.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo13);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo14CheckboxField() {
        if (!pleaseSelectAMenuItemTo14.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo14);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo15CheckboxField() {
        if (!pleaseSelectAMenuItemTo15.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo15);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo16CheckboxField() {
        if (!pleaseSelectAMenuItemTo16.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo16);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo17CheckboxField() {
        if (!pleaseSelectAMenuItemTo17.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo17);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo18CheckboxField() {
        if (!pleaseSelectAMenuItemTo18.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo18);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo19CheckboxField() {
        if (!pleaseSelectAMenuItemTo19.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo19);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo1CheckboxField() {
        if (!pleaseSelectAMenuItemTo1.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo1);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo20CheckboxField() {
        if (!pleaseSelectAMenuItemTo20.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo20);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo21CheckboxField() {
        if (!pleaseSelectAMenuItemTo21.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo21);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo22CheckboxField() {
        if (!pleaseSelectAMenuItemTo22.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo22);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo23CheckboxField() {
        if (!pleaseSelectAMenuItemTo23.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo23);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo24CheckboxField() {
        if (!pleaseSelectAMenuItemTo24.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo24);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo25CheckboxField() {
        if (!pleaseSelectAMenuItemTo25.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo25);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo26CheckboxField() {
        if (!pleaseSelectAMenuItemTo26.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo26);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo27CheckboxField() {
        if (!pleaseSelectAMenuItemTo27.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo27);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo28CheckboxField() {
        if (!pleaseSelectAMenuItemTo28.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo28);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo29CheckboxField() {
        if (!pleaseSelectAMenuItemTo29.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo29);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo2CheckboxField() {
        if (!pleaseSelectAMenuItemTo2.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo2);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo30CheckboxField() {
        if (!pleaseSelectAMenuItemTo30.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo30);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo31CheckboxField() {
        if (!pleaseSelectAMenuItemTo31.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo31);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo32CheckboxField() {
        if (!pleaseSelectAMenuItemTo32.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo32);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo33CheckboxField() {
        if (!pleaseSelectAMenuItemTo33.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo33);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo34CheckboxField() {
        if (!pleaseSelectAMenuItemTo34.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo34);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo35CheckboxField() {
        if (!pleaseSelectAMenuItemTo35.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo35);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo36CheckboxField() {
        if (!pleaseSelectAMenuItemTo36.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo36);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo37CheckboxField() {
        if (!pleaseSelectAMenuItemTo37.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo37);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo38CheckboxField() {
        if (!pleaseSelectAMenuItemTo38.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo38);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo39CheckboxField() {
        if (!pleaseSelectAMenuItemTo39.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo39);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo3CheckboxField() {
        if (!pleaseSelectAMenuItemTo3.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo3);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo40CheckboxField() {
        if (!pleaseSelectAMenuItemTo40.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo40);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo41CheckboxField() {
        if (!pleaseSelectAMenuItemTo41.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo41);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo42CheckboxField() {
        if (!pleaseSelectAMenuItemTo42.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo42);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo43CheckboxField() {
        if (!pleaseSelectAMenuItemTo43.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo43);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo44CheckboxField() {
        if (!pleaseSelectAMenuItemTo44.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo44);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo45CheckboxField() {
        if (!pleaseSelectAMenuItemTo45.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo45);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo46CheckboxField() {
        if (!pleaseSelectAMenuItemTo46.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo46);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo47CheckboxField() {
        if (!pleaseSelectAMenuItemTo47.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo47);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo48CheckboxField() {
        if (!pleaseSelectAMenuItemTo48.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo48);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo49CheckboxField() {
        if (!pleaseSelectAMenuItemTo49.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo49);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo4CheckboxField() {
        if (!pleaseSelectAMenuItemTo4.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo4);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo50CheckboxField() {
        if (!pleaseSelectAMenuItemTo50.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo50);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo5CheckboxField() {
        if (!pleaseSelectAMenuItemTo5.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo5);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo6CheckboxField() {
        if (!pleaseSelectAMenuItemTo6.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo6);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo7CheckboxField() {
        if (!pleaseSelectAMenuItemTo7.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo7);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo8CheckboxField() {
        if (!pleaseSelectAMenuItemTo8.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo8);
        }
        return this;
    }

    /**
     * Set Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage setPleaseSelectAMenuItemTo9CheckboxField() {
        if (!pleaseSelectAMenuItemTo9.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo9);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo10CheckboxField() {
        if (pleaseSelectAMenuItemTo10.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo10);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo11CheckboxField() {
        if (pleaseSelectAMenuItemTo11.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo11);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo12CheckboxField() {
        if (pleaseSelectAMenuItemTo12.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo12);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo13CheckboxField() {
        if (pleaseSelectAMenuItemTo13.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo13);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo14CheckboxField() {
        if (pleaseSelectAMenuItemTo14.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo14);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo15CheckboxField() {
        if (pleaseSelectAMenuItemTo15.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo15);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo16CheckboxField() {
        if (pleaseSelectAMenuItemTo16.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo16);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo17CheckboxField() {
        if (pleaseSelectAMenuItemTo17.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo17);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo18CheckboxField() {
        if (pleaseSelectAMenuItemTo18.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo18);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo19CheckboxField() {
        if (pleaseSelectAMenuItemTo19.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo19);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo1CheckboxField() {
        if (pleaseSelectAMenuItemTo1.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo1);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo20CheckboxField() {
        if (pleaseSelectAMenuItemTo20.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo20);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo21CheckboxField() {
        if (pleaseSelectAMenuItemTo21.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo21);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo22CheckboxField() {
        if (pleaseSelectAMenuItemTo22.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo22);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo23CheckboxField() {
        if (pleaseSelectAMenuItemTo23.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo23);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo24CheckboxField() {
        if (pleaseSelectAMenuItemTo24.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo24);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo25CheckboxField() {
        if (pleaseSelectAMenuItemTo25.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo25);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo26CheckboxField() {
        if (pleaseSelectAMenuItemTo26.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo26);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo27CheckboxField() {
        if (pleaseSelectAMenuItemTo27.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo27);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo28CheckboxField() {
        if (pleaseSelectAMenuItemTo28.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo28);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo29CheckboxField() {
        if (pleaseSelectAMenuItemTo29.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo29);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo2CheckboxField() {
        if (pleaseSelectAMenuItemTo2.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo2);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo30CheckboxField() {
        if (pleaseSelectAMenuItemTo30.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo30);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo31CheckboxField() {
        if (pleaseSelectAMenuItemTo31.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo31);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo32CheckboxField() {
        if (pleaseSelectAMenuItemTo32.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo32);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo33CheckboxField() {
        if (pleaseSelectAMenuItemTo33.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo33);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo34CheckboxField() {
        if (pleaseSelectAMenuItemTo34.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo34);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo35CheckboxField() {
        if (pleaseSelectAMenuItemTo35.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo35);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo36CheckboxField() {
        if (pleaseSelectAMenuItemTo36.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo36);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo37CheckboxField() {
        if (pleaseSelectAMenuItemTo37.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo37);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo38CheckboxField() {
        if (pleaseSelectAMenuItemTo38.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo38);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo39CheckboxField() {
        if (pleaseSelectAMenuItemTo39.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo39);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo3CheckboxField() {
        if (pleaseSelectAMenuItemTo3.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo3);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo40CheckboxField() {
        if (pleaseSelectAMenuItemTo40.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo40);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo41CheckboxField() {
        if (pleaseSelectAMenuItemTo41.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo41);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo42CheckboxField() {
        if (pleaseSelectAMenuItemTo42.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo42);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo43CheckboxField() {
        if (pleaseSelectAMenuItemTo43.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo43);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo44CheckboxField() {
        if (pleaseSelectAMenuItemTo44.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo44);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo45CheckboxField() {
        if (pleaseSelectAMenuItemTo45.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo45);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo46CheckboxField() {
        if (pleaseSelectAMenuItemTo46.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo46);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo47CheckboxField() {
        if (pleaseSelectAMenuItemTo47.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo47);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo48CheckboxField() {
        if (pleaseSelectAMenuItemTo48.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo48);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo49CheckboxField() {
        if (pleaseSelectAMenuItemTo49.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo49);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo4CheckboxField() {
        if (pleaseSelectAMenuItemTo4.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo4);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo50CheckboxField() {
        if (pleaseSelectAMenuItemTo50.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo50);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo5CheckboxField() {
        if (pleaseSelectAMenuItemTo5.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo5);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo6CheckboxField() {
        if (pleaseSelectAMenuItemTo6.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo6);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo7CheckboxField() {
        if (pleaseSelectAMenuItemTo7.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo7);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo8CheckboxField() {
        if (pleaseSelectAMenuItemTo8.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo8);
        }
        return this;
    }

    /**
     * Unset Please Select A Menu Item To Edit Display Properties Checkbox field.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage unsetPleaseSelectAMenuItemTo9CheckboxField() {
        if (pleaseSelectAMenuItemTo9.isSelected()) {
             clickElement(pleaseSelectAMenuItemTo9);
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the CIGeneralDetailsPage class instance.
     */
    public IncidentListPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }
}
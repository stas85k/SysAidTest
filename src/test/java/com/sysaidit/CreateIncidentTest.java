package com.sysaidit;

import com.sysaidit.pages.CIGeneralDetailsPage;
import com.sysaidit.pages.LoginPage;
import com.sysaidit.pages.MainPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateIncidentTest extends TestNgTestBase {

    private LoginPage loginPage;
    private MainPage mainPage;
    private CIGeneralDetailsPage ciGeneralDetailsPage;
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    @BeforeClass
    public void testInit() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        ciGeneralDetailsPage = PageFactory.initElements(driver, CIGeneralDetailsPage.class);
    }

    @BeforeMethod
    public void setUp (){
        driver.get(baseUrl);
        loginPage.fillLogin("qatest", "xvqkd");
        mainPage.waitForService();
    }


    @Test
    public void createIncident () {
        driver.get("https://automationstas.qa.sysaidit.com/#/HelpDesk.jsp?fromId=IncidentsList");
        ciGeneralDetailsPage.fillGeneraldetails();
        ciGeneralDetailsPage.fillActivities();
        Assert.assertTrue(ciGeneralDetailsPage.checkUniqueNumber(),"No unique number appears");
    }

    @Test
    public void createIncidentWithoutSomeMandatoryFields(){
        driver.get("https://automationstas.qa.sysaidit.com/#/HelpDesk.jsp?fromId=IncidentsList");
        //TODO implement the following method (while some of the mandatory fields are not filled)
        //ciGeneralDetailsPage.fillSomeGeneralDetails();
        Assert.assertTrue(ciGeneralDetailsPage.checkErrorMessage(),"No error message appears");
    }
}

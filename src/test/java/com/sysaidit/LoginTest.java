package com.sysaidit;

import com.sysaidit.pages.IncidentListPage;
import com.sysaidit.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest extends TestNgTestBase {

  private LoginPage loginPage;
  private IncidentListPage incidentListPage;
  private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

  //@BeforeClass
  public void testInit() {
    driver.get(baseUrl);
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    incidentListPage = PageFactory.initElements(driver, IncidentListPage.class);
  }



  //@Test(dataProviderClass = DataProviders.class, dataProvider = "loadInvalidLoginFromFile")
  public void loginNegative (String useranme, String pass) {
    Log.info("Logging in negative");
    loginPage.fillLogin(useranme,pass);
    Assert.assertTrue(loginPage.checkErrorMessage(),"No error message appears");
    Log.info("Assert on error message passed");
    Assert.assertTrue(loginPage.isRememberChecked(),"RememberMe checkbox is not checked");
  }

  @Test
  public void loginPositive () {
    Log.info("fill Login with positive data");
      loginPage.fillLogin("qatest", "gh8mlz");
    //incidentListPage.waitForServiceDeskDrop();
    Assert.assertTrue(loginPage.verifyUserNameAfterLogin());
    Log.info("Assert on username passed");

  }

  @AfterTest(alwaysRun = true)
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}

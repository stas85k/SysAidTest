package com.sysaidit;

import com.sysaidit.pages.LoginPage;
import com.sysaidit.pages.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateIncidentTest extends TestNgTestBase {

  private LoginPage loginPage;
  private MainPage mainPage;

  @BeforeClass
  public void testInit() {
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    mainPage = PageFactory.initElements(driver, MainPage.class);
  }

  @BeforeMethod
  public void setUp (){
    driver.get(baseUrl);
    loginPage.fillLogin("qatest", "xvqkd");
    mainPage.waitForService();
  }


  @Test
  public void createIncident (String useranme, String pass) {
    driver.get("https://automationstas.qa.sysaidit.com/#/HelpDesk.jsp?fromId=IncidentsList");

    Assert.assertTrue(loginPage.checkErrorMessage(),"No error message appears");
    Assert.assertTrue(loginPage.isRememberChecked(),"RememberMe checkbox is not checked");
  }
}

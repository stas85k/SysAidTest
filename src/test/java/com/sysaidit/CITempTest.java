package com.sysaidit;

import com.sysaidit.pages.CIGeneralDetailsPage;
import com.sysaidit.pages.LoginPage;
import com.sysaidit.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CITempTest extends TestNgTestBase {

  private LoginPage loginPage;
  private MainPage mainPage;
  private CIGeneralDetailsPage ciGeneralDetailsPage;


  @BeforeClass
  public void testInit() {
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    mainPage = PageFactory.initElements(driver, MainPage.class);
    ciGeneralDetailsPage = PageFactory.initElements(driver, CIGeneralDetailsPage.class);


  }

  @BeforeMethod
  public void setUp (){
    driver.get(baseUrl);
    loginPage.fillLogin("qatest", "gh8mlz");
    mainPage.waitForService();
  }

  @Test
  public void createIncedentTst() {
    driver.get("https://automationstas.qa.sysaidit.com/SREdit.jsp?id=0&fromId=IncidentsList&SR_Type=1&templateID=20");
    ciGeneralDetailsPage.waitForPageLoad();

    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("default title");

    driver.findElement(By.xpath("//div[@id='37_problem_type']/div/div/span")).click();

    driver.findElement(By.xpath("//div[@id='addScroll_problem_type_CustomSelect']/ul/li[2]")).click();
    driver.findElement(By.xpath("//div[@id='37_subcategory']/div/div/span")).click();
    driver.findElement(By.xpath("//div[@id='addScroll_subcategory_CustomSelect']/ul/li[2]")).click();
    driver.findElement(By.xpath("//div[@id='37_thirdLevelCategory']/div/div/span")).click();
    driver.findElement(By.xpath("//div[@id='addScroll_thirdLevelCategory_CustomSelect']/ul/li[2]")).click();
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("default title");
  }
}

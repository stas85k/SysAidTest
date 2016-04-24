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
  public void createIncedentTst() throws InterruptedException {
    driver.get("http://inetex.sysaidit.com/SREdit.jsp?id=0&fromId=IncidentsList&SR_Type=1&templateID=20");
    ciGeneralDetailsPage.waitForPageLoad();


    driver.findElement(By.xpath("//div[@id='65_problem_type']/div/div/span")).click();

    //By.xpath(".//*[text()='Первая ссылка']/.."));

    driver.findElement(By.xpath("//div[@id='addScroll_problem_type_CustomSelect']/ul/li[3]")).click();
    driver.findElement(By.xpath("//div[@id='65_subcategory']/div/div/span")).click();
    driver.findElement(By.xpath("//div[@id='addScroll_subcategory_CustomSelect']/ul/li[3]")).click();
    driver.findElement(By.xpath("//div[@id='65_thirdLevelCategory']/div/div/span")).click();
    driver.findElement(By.xpath("//div[@id='addScroll_thirdLevelCategory_CustomSelect']/ul/li[4]")).click();
    driver.findElement(By.id("desc")).clear();
    driver.findElement(By.id("desc")).sendKeys("desc");
    driver.findElement(By.xpath("//div[@id='65_requestUser']/div/div")).click();
    driver.findElement(By.xpath("//div[@id='addScroll_requestUser_CustomSelect']/ul/li[3]")).click();
    driver.findElement(By.xpath("//table[@id='OKBtn']/tbody/tr/td[2]/span")).click();


  }
}

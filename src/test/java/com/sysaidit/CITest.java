package com.sysaidit;

/**
 * Created by stas on 30/04/2016.
 */

import com.sysaidit.pages.CIGeneralDetailsPage;
import com.sysaidit.pages.LoginPage;
import com.sysaidit.pages.MainPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class CITest extends TestNgTestBase{
    private LoginPage loginPage;
    private MainPage mainPage;
    private CIGeneralDetailsPage ciGeneralDetailsPage;
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass/*(alwaysRun = true)*/
    public void testInit() {
        //driver = new FirefoxDriver();
        //baseUrl = "http://change-this-to-the-site-you-are-testing/es";

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        ciGeneralDetailsPage = PageFactory.initElements(driver, CIGeneralDetailsPage.class);

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void setUp (){
        driver.get(baseUrl);
        loginPage.fillLogin("qatest","gh8mlz");
        //mainPage.waitForService();
    }

    @Test
    public void testUntitled() throws Exception {
        //driver.get("https://automationstas.qa.sysaidit.com/SREdit.jsp?id=0&fromId=IncidentsList&SR_Type=1&templateID=20");
        driver.get("https://automationstas.qa.sysaidit.com/SREdit.jsp?id=0&fromId=IncidentsList&SR_Type=1&templateID=20");
        assertEquals(driver.getTitle(), "SysAid Help Desk Software");
        Log.info("Assert on the page is opened");
        Select(driver.findElement(By.id("quick_name"))).selectByVisibleText("Cannot connect to a Wi-Fi network");

        driver.findElement(By.id("quick_name")).click();
        driver.findElement(By.id("title")).clear();
        driver.findElement(By.id("title")).sendKeys("DEFAULT");
        driver.findElement(By.id("desc")).clear();
        driver.findElement(By.id("desc")).sendKeys("desc1");
        driver.findElement(By.xpath("//tr[@id='tr_labelId_notes']/td[3]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/span")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=dhtml_popup1 | ]]
        // ERROR: Caught exception [ERROR: Unsupported command [isEditable | id=textRow | ]]
        driver.findElement(By.id("textRow")).clear();
        driver.findElement(By.id("textRow")).sendKeys("note1");
        acceptNextAlert = false;
        driver.findElement(By.xpath("//table[@id='Popup_Layout']/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[2]/span")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[contains(@id,'requestUser')]/div/div/span"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[contains(@id,'requestUser')]/div/div/span")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[@id='addScroll_requestUser_CustomSelect']/ul/li[2]"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='addScroll_requestUser_CustomSelect']/ul/li[2]")).click();
        driver.findElement(By.xpath("//table[@id='ApplyBtn']/tbody/tr/td[2]/span")).click();
        driver.findElement(By.xpath("//table[@id='OKBtn']/tbody/tr/td[2]/span")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}


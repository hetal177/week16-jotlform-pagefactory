package com.joltform.testsuite;

import com.joltform.pages.HomePage;
import com.joltform.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FillFormTest extends TestBase {

    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();


    }
    @Test

    public void fillDetailsOnTestForm() throws InterruptedException {
        homePage.clickOnStartNextBtn();
        homePage.enterFirstName("Bablo");
        homePage.enterLastName("Bebli");
        homePage.clickOnFirstNameNextBtn();
        //  Thread.sleep(3000);
        homePage.uploadFile("C:\\Users\\Administrator\\Desktop\\test.docx");
        homePage.clickOnBrowseFileNextBtn();
        //   Thread.sleep(3000);
        homePage.dragAndDropSignature();
        Thread.sleep(3000);
        homePage.clickOnSignNextBtn();
        homePage.clickOnCalender();
        Thread.sleep(3000);
        homePage.selectDate();
        homePage.clickOnDateNextbtb();
        homePage.selectMaidenName();
        Thread.sleep(3000);
        homePage.sendYourAns("Babli's mum");
        Thread.sleep(3000);
        homePage.clickOnSubmitBtn();



    }








}

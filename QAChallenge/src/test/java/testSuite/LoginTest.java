package testSuite;

import baseClass.BaseClassTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.CompletePurchase;
import pageObject.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClassTest{

    @BeforeTest
    public void innit() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quit() {
    }

//    //    Testcases
    @Test(priority = 2)
    public void NegativeLogin() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        LoginPage loginPage =new LoginPage(driver);
//      user is able to input the wrong username
        loginPage.wrongUsername();
//      user is able to input the wrong password
        loginPage.wrongPassword();
//      User is able to click on the login button
        loginPage.wrongLogin();
//       verify errorMessage
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = loginPage.negativeCredential();
        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage, expectedMessage);
    }
/*
    @Test(priority = 1)
    public void Login() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//      User is able to enter the username
        loginPage.clickUsername();
//      User is able to enter the password
        loginPage.clickPassword();
//      User is able to click on the login button
        loginPage.clickLogin();
   }
*/

    }
package testSuite;

import baseClass.BaseClassTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.CompletePurchase;

import java.util.concurrent.TimeUnit;

public class E2ECompletePurchaseTest extends BaseClassTest {

    @BeforeTest
    public void innit() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quit() {
    }

//        Testcases

    @Test(priority = 1)
    public void e2eCompletePurchase() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        CompletePurchase completePurchase =new CompletePurchase(driver);
//      User is able to insert purchase username in the input Field
        completePurchase.clickPUsername();
//        User is able to insert purchase password in the input Field
        completePurchase.clickPPassword();
//      User is able to click on the login button to proceed with the purchase
        completePurchase.clickPLogin();
        if (driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html"))
           //Pass
         System.out.println("The page URl in the link field contains/inventory");
       else
          System.out.println("The page URl in the link field does not contains/inventory");
       //Fail
//      User is able to click on the addCart button
       completePurchase.clickAddCart();
//       User is able to verify the price of the bag
       completePurchase.clickVerifyPrice();
//      User is able to click on the second addCart button
       completePurchase.clickAddCart2();
//      User is able to view the  number of item added to shoppingCart
       completePurchase.clickShoppinCart();
//     User is able to click on the checkOut
       completePurchase.clickCheckOut();
//     User is able to see the screen to input firstName in the input field
       completePurchase.enterFirstName();
//     User is able to input lastName in the input field
       completePurchase.enterLastName();
//     User is able to input postCode in the input field
       completePurchase.enterPostal();
//     User is able to click on the continue button
       completePurchase.clickButton();
//     User is able to verify the total Price of the Purchase
       completePurchase.viewVerifyTotalPrice();
//     User is able to click on the finish button
       completePurchase.clickFinish();
//     User is able to see the successful verified symbol
       completePurchase.verifyTickedSymbol();
//     User is able to see the successful order message
       completePurchase.completeOrderMessage();
//     Verify the orderMessage results displayed
       String expectedTitle = "https://www.saucedemo.com/checkout-complete.html";
       String actualTitle = driver.getCurrentUrl();
        Assert.assertEquals(actualTitle, expectedTitle);
       System.out.println("https://www.saucedemo.com/checkout-complete.html");
//     User is able to see the orderText displayed successfully
       completePurchase.completeOrderText();
//     User is able to click on the backHome button to return to homePage
       completePurchase.clickBackHome();

  }
}
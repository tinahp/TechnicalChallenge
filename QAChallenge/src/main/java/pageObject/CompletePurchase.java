package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePurchase {

    public WebDriver driver;

    public CompletePurchase(WebDriver driver) {
        this.driver = driver;
    }

//       Locate the webElement/Positive Scenerio

    //     User should be able to input Username
    private By purchaseUsername = By.cssSelector("#user-name");
    //     User should be able to input Password
    private By purchasePassword = By.cssSelector("#password");
    //     User should be able to see the login button
    private By purchaseLogin = By.cssSelector("#login-button");
    //       User should be able to click on the addCart button
    private By addCart = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    //       User should be able to verify the price of the bag
    private By verifyBag = By.cssSelector("div[class='inventory_list'] div:nth-child(1) div:nth-child(2) div:nth-child(2) div:nth-child(1)");
    //    User should be able to click on the second addCart button
    private By addCart2 = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    //    User should be able to view the  number of item added to shoppingCart
    private By shoppingCart = By.cssSelector(".shopping_cart_badge");
    //       User should be able to click on checkOut
    private By checkOut = By.cssSelector("#checkout");
    //      User should see the screen to input firstName in the input field
    private By firstName = By.cssSelector("#first-name");
    //       User should be able to input lastName in the input field
    private By lastName = By.cssSelector("#last-name");
    //     User should be able to input postCode in the input field
    private By postCode = By.cssSelector("#postal-code");
    //     User should be able to click on the continue button
    private By continueButton = By.xpath("//input[@id='continue']");
    //       User should be able to verify the total Price of the Purchase
    private By verifyPrice = By.cssSelector(".summary_info_label.summary_total_label");
    //     User should be able to click on the finish button
    private By finishButton = By.xpath("//button[@id='finish']");
    //     User should be able to see the successful verified symbol
    private By verifySymbol = By.cssSelector("img[alt='Pony Express']");
    //      User should be able to see the complete order message
    private By completeOrder = By.cssSelector(".complete-header");
    //     Verify that users can see the orderText displayed successfully
    private By orderMessage = By.xpath("//div[@class='complete-text']");
    //   User should be abe to click on the dotted bars  on the left
    private By clickLogOut = By.cssSelector("#react-burger-menu-btn");
    //  private By  backHome = By.cssSelector("#back-to-products");
    private By logOut = By.cssSelector("#logout_sidebar_link");


    //         Action the Positive Object/element
// User should be able to insert purchase username in the input Field
    public void clickPUsername() {
        driver.findElement(purchaseUsername).sendKeys("standard_user");
    }

    // User should be able to insert purchase password in the input Field
    public void clickPPassword() {
        driver.findElement(purchasePassword).sendKeys("secret_sauce");
    }

    // User should be able to click on the login button to proceed with the purchase
    public void clickPLogin() {
        driver.findElement(purchaseLogin).click();
    }

    // User should be able to click on the addCart button
    public void clickAddCart() {
        driver.findElement(addCart).click();
    }

    // User should be able to verify the price of the bag
    public String clickVerifyPrice() {
        String verifyPrice = driver.findElement(verifyBag).getText();
        return verifyPrice;
    }

    // User should be able to click on the second addCart button
    public void clickAddCart2() {
        driver.findElement(addCart2).click();
    }

    //  User should be able to view the  number of item added to shoppingCart
    public void clickShoppinCart() {
        driver.findElement(shoppingCart).click();
    }

    // User should be able to click on the checkOut
    public void clickCheckOut() {
        driver.findElement(checkOut).click();
    }

    //  User should see the screen to input firstName in the input field
    public void enterFirstName() {
        driver.findElement(firstName).sendKeys("Lara");
    }

    //  User should  be able to input lastName in the input field
    public void enterLastName() {
        driver.findElement(lastName).sendKeys("John");
    }

    // User should be able to input postCode in the input field
    public void enterPostal() {
        driver.findElement(postCode).sendKeys("E12 3JF");
    }

    // User should be able to click on the continue button
    public void clickButton() {
        driver.findElement(continueButton).click();
    }

    // User should be able to verify the total Price of the Purchase
    public String viewVerifyTotalPrice() {
        String verifyTotalPrice = driver.findElement(verifyPrice).getText();
        return verifyTotalPrice;
    }

    //  User should be able to click on the finish button
    public void clickFinish() {
        driver.findElement(finishButton).click();
    }

    //       User should be able to see the successful verified symbol
    public String verifyTickedSymbol() {
        String verifyPonyExpress = driver.findElement(verifySymbol).getText();
        return verifyPonyExpress;
    }

    //    User should be able to see the successful order message
    public String completeOrderMessage() {
        String completeMessage = driver.findElement(completeOrder).getText();
        return completeMessage;
    }

    //    User should be  able to see the orderText displayed successfully
    public String completeOrderText() {
        String orderText = driver.findElement(orderMessage).getText();
        return orderText;
    }

    public void cLogout() {
        driver.findElement(clickLogOut).click();
    }

    //      User should be able to click on the backHome button to return to homePage
    public void clickBackHome() {
        driver.findElement(logOut).click();
    }
}
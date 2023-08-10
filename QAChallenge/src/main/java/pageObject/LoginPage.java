package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locate the webElement/Negative Scenerio
//     User should be able to input wrongUsername
    private By negativeUsername = By.cssSelector("#user-name");
//     User should be able to input wrongPassword
    private By negativePassword =By.cssSelector("#password");
//     User should be able to see the login button
    private By negativelogin    =By.cssSelector("#login-button");
//     verify the errorMessage Displayed for incorrect Credentials
    private  By credentials =By.cssSelector("h3[data-test='error']");


//           Action the Negative Object/element
//  User should be able to insert username in the input Field
    public void wrongUsername() {driver.findElement(negativeUsername).sendKeys("standard_");};
//     User should be able to insert password in the input Field
    public void wrongPassword() {driver.findElement(negativePassword).sendKeys("secret_sauc");};
//     User should be able to click on the login button
    public void wrongLogin(){
        driver.findElement(negativelogin).click();}
//      Verify if the errorMessage is displaying
    public String negativeCredential() {
        String negativeLogin1 = driver.findElement(credentials).getText();
        return negativeLogin1;

    }

/*
//       Locate the webElement/Positive Scenerio
//  User should be able to input Username
    private By username = By.cssSelector("#user-name");
//     User should be able to input Password
    private By password =By.cssSelector("#password");
//   User should be able to see the login button
    private By login    =By.cssSelector("#login-button");


//      Action the Positive Object/element
//  User should be able to insert username in the input Field
    public void clickUsername() {driver.findElement(username).sendKeys("standard_user");};
//  User should be able to insert password in the input Field
    public void clickPassword() {driver.findElement(password).sendKeys("secret_sauce");};
//  User should be able to click on the login button
    public void clickLogin(){
        driver.findElement(login).click();
        driver.close();}

*/

}

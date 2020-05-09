package com.odooerp.pages;
import com.odooerp.utilities.BrowserUtilities;
import com.odooerp.utilities.ConfigurationReader;
import com.odooerp.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends AbstractPageBase {
    @FindBy(xpath = "//b[text()=\"Sign in\"]")
    private WebElement signInButton;
    @FindBy(css = "input[id='login']")
    private WebElement email;
    @FindBy(css = "input[id='password']")
    private WebElement password;
    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement login;
    @FindBy(xpath = "//a[text()='Reset Password']")
    private WebElement resetPassword;
    @FindBy(css = "p[class=\"alert alert-danger\"]")
    private WebElement warningMessage;
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public String getWarningMessageText() {
        return warningMessage.getText();
    }

    public void login(String emailValue, String passwordValue){
        email.sendKeys(emailValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login(){
        email.sendKeys(ConfigurationReader.getProperty("contacts1"));
        password.sendKeys(ConfigurationReader.getProperty("contactsPass"), Keys.ENTER);
    }
    public void ClickOnLoginBttn(){
        BrowserUtilities.wait(2);
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }
}
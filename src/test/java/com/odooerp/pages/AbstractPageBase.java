package com.odooerp.pages;


import com.odooerp.utilities.BrowserUtilities;
import com.odooerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    @FindBy(css = ".oe_topbar_name")
    protected WebElement currentUser;

    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }

    public String getCurrentUserName() {
        BrowserUtilities.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return currentUser.getText().trim();
    }

    public void navigateToMainTab(String tabName) {
        String tabNameXpath = "//*[@id='oe_main_menu_navbar']//div[2]/ul/li/a/span[contains(text(),'"+tabName+"')]";
        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        tabElement.click();
    }

    public void navigateToSubTab(String subTabName){
        BrowserUtilities.waitForPageToLoad(30);
        String subTabXPath = "";
        switch(subTabName.toUpperCase()){
            case "PIPELINE":
            case "QUOTATIONS":
            case "CUSTOMERS":
            case "SESSIONS":
            case "PRODUCTS":
            case "PRICELISTS":
            case "SALES DETAILS":
            case "POS CATEGORIES":
                subTabXPath = "(//span[@class='oe_menu_text' and contains(text(),'"+subTabName+"')])[1]";
                break;
            case "POINT OF SALE":
                subTabXPath = "(//span[@class='oe_menu_text' and contains(text(),'"+subTabName+"')])[2]";
                break;
            case "ORDERS":
                subTabXPath = "(//span[@class='oe_menu_text' and contains(text(),'"+subTabName+"')])[6]";
                break;
            case "ORDERSUNDERREPORTING":
                subTabXPath = "(//span[@class='oe_menu_text' and contains(text(),'"+subTabName+"')])[7]";
                break;
            default:
                System.out.println("There is no such module.");
                break;

        }
        WebElement subTabElement = driver.findElement(By.xpath(subTabXPath));
        subTabElement.click();
    }
}

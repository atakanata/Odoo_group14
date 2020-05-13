package com.odooerp.pages;

import com.odooerp.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PointOfSalesPage extends AbstractPageBase {

    @FindBy(xpath="//tbody[@class='ui-sortable']/tr[1]")
    private WebElement firstRowOfTable;

    @FindBy(xpath = "//tbody[@class='ui-sortable']/tr[1]/td[2]")
    private WebElement firstRowOrderRef;

    @FindBy(xpath="(//table[@class='o_group o_inner_group']/tbody/tr/td)[2]/span")
    private WebElement detailsRowOrderRef;

    public String getDetailsRowOrderRef(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(detailsRowOrderRef));
        return detailsRowOrderRef.getText();
    }

    public String getFirstRowOrderRefText(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(firstRowOrderRef));
        return firstRowOrderRef.getText();
    }

    public void clickOnFirstRow(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(firstRowOfTable));
        firstRowOfTable.click();
    }
}

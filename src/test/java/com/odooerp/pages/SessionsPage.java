package com.odooerp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SessionsPage extends AbstractPageBase{
    @FindBy (xpath="//div[@class='o_searchview']")
    private WebElement searchBox;
    public WebElement getSearchBox(){
        return searchBox;
    }
    // **************************************************************************************************
    @FindBy(xpath = "//div[@class='btn-group o_search_options']/div[1]")
    private WebElement filters;
    public void ClickFilters(){
        filters.click();
    }
    // **************************************************************************************************
    @FindBy(xpath = "//div[@class='btn-group o_search_options']/div[2]")
    private WebElement groupBy;
    public void ClickGroupBy(){
        groupBy.click();
    }
    // **************************************************************************************************
    @FindBy(xpath = "//div[@class='btn-group o_search_options']/div[3]")
    private WebElement favorites;
    public void ClickFavorites(){
        favorites.click();
    }
    // **************************************************************************************************
    @FindBy (xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[1]")
    private WebElement listBoxOnTopRight;
    public void clickListBoxOnTopRight(){
        listBoxOnTopRight.click();
    }
    // **************************************************************************************************
    @FindBy (xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[2]")
    private WebElement kanbanBoxOnTopRight;
    public void clickKanbanBoxOnTopRight() {
        kanbanBoxOnTopRight.click();
    }
// **************************************************************************************************
}
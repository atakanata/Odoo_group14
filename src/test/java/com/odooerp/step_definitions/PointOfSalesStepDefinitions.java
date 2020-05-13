package com.odooerp.step_definitions;

import com.odooerp.pages.PointOfSalesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PointOfSalesStepDefinitions {
    PointOfSalesPage pointOfSalesPage = new PointOfSalesPage();

    @When("user navigates to {string} subtab")
    public void user_navigates_to_subtab(String string) {
        System.out.println("user navigates to subtab "+string);
        pointOfSalesPage.navigateToSubTab("Orders");
    }

    @Then("user clicks on first row of the table")
    public void user_clicks_on_first_row_of_the_table() {
        System.out.println("user clicks on first data");
        pointOfSalesPage.clickOnFirstRow();
    }

    @Then("user can see the order details")
    public void user_can_see_the_order_details() {
        System.out.println("user checks the details");
        Assert.assertEquals(pointOfSalesPage.getFirstRowOrderRefText(),pointOfSalesPage.getDetailsRowOrderRef());
    }
}

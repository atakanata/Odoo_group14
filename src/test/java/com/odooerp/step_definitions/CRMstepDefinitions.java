package com.odooerp.step_definitions;

import com.odooerp.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class CRMstepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Then("user navigates to following page:")
    public void user_navigates_to_following_page(List<String> lst) {
        loginPage.navigateTo(lst.get(0));
    }
}

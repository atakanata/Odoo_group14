package com.odooerp.step_definitions;

import com.odooerp.pages.LoginPage;
import com.odooerp.utilities.ConfigurationReader;
import com.odooerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginStepDefinition {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user on the login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user enter {string} and {string}")
    public void user_enter_and(String string, String string2) {
        System.out.printf("Login with user name %s and %s password\n", string, string2);
         loginPage.login(string,string2);
    }
}

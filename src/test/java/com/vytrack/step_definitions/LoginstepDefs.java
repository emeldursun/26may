package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginstepDefs {
    @Given("the user is on the login page")
    public void the_user_on_the_login_page() {
       String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {

       String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);
    }

    @When("the user enters the sales manager information")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");



        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @When("the user enters the store manager information")
    public void the_user_enter_the_store_manager_information() {
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
       LoginPage loginPage = new LoginPage();
       loginPage.login(username,password);

    }
    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(20);
        System.out.println(Driver.get().getTitle());
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
        System.out.println(Driver.get().getTitle());
    }
    @Given("the user logged in as a {string}")
    public void the_user_logged_in_as_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}




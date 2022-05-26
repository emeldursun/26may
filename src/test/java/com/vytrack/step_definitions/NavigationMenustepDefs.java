package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenustepDefs {
    @When("the user navigate to Fleet-Vehicles")
    public void the_user_navigate_to_Fleet_Vehicles() {
        System.out.println("The user navigate to vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("Expected and actual title is macthing");
    }

    @When("the user navigate to Marketing Campaigns")
    public void the_user_navigate_to_Marketing_Campaigns() {
        System.out.println("The user navigate to marketing");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("Expected and actual title is macthing");
    }

    @When("the user navigate to Activities,calendar events")
    public void the_user_navigate_to_Activities_calendar_events() {
        System.out.println("The user navigate Activities");

    }

    @Then("the title should be Calendars")
    public void the_title_should_be_Calendars() {
        System.out.println("Expected and actual title is macthing");
    }

        @When("the user navigates to {string} {string}")
        public void the_user_navigates_to(String tab, String module) {
            new DashboardPage().navigateToModule(tab, module);
    }
    @Then("default page should be {int}")
    public void default_page_should_be(Integer expectedPagenum) {
        BrowserUtils.waitForPageToLoad(30);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber =Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPagenum,actualNumber);
    }

}
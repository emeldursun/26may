package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;
    @FindBy(xpath = "//input[@type='number']")
    public WebElement page_number;
    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement per_page_view;
    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> row_number;

    @FindBy(xpath = "//button/input[@type='checkbox']")
    public WebElement checkbox;
    @FindBy(xpath = "(//tr/td)[2]")
    public WebElement testers_meeting;
    @FindBy(xpath = "//div[@class='row-fluid']")
    public WebElement data_page;
    @FindBy(xpath = "//td[@data-column-label='Selected Rows']")
    public List<WebElement> checkboxes;


    //
}
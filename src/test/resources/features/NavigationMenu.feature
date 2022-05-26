@navigate
  Feature: Navigating menu

    Scenario: Navigating Fleet-->Vehicles
      Given the user is on the login page
      And the user enters the sales manager information
      When the user navigate to Fleet-Vehicles
      Then the title should be Vehicles

      Scenario: Navigating marketing campaigns
        Given the user is on the login page
        And the user enters the sales manager information
        When the user navigate to Marketing Campaigns
        Then the title should be Campaigns

        Scenario: Navigating Activities-- Calendar events
          Given the user is on the login page
          And the user enters the sales manager information
          When the user navigate to Activities,calendar events
          Then the title should be Calendars
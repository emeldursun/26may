Feature: Contacts page

  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then  default page should be 1


  Scenario: Menu Options
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      |System      |


  Scenario: Menu Options Sales manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards    |
      | Fleet      |
      | Customers  |
      | Sales       |
      | Activities |
      | Marketing   |
      | Reports & Segments|
      | System            |


    Scenario: login as a given user
      Given  the user is on the login page
      When the user logs in using following credentials
      | username | user10      |
      | password | UserUser123 |
      | firstname| John     |
      | lastname | Doe  |
      Then  the user should be able to login
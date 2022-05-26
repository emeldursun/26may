Feature: Login as different users

  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

    #homework

  Scenario: login as a driver
    Given the user logged in as a "usertype"
    Then the user should be able to login
    And the title contains "Dashboard"
    #drier,storemanager,salesmanager
  #you will have step definicitin and it will handle different user tyoe
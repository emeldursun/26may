Feature: Account types

  @wip
  Scenario: driver user
    Given the user logged in as "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"

  @wip
  Scenario: Sales Manager User
    Given the user logged in as "sales manager"
    When the user navigates to "Customers" "Accounts"
    Then the title contains "Accounts - CustomerS"

  @wip
  Scenario: Store Manager User
    Given the user logged in as "store manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"

  Scenario Outline: Login with different accounts
    Given the user logged in as "<userType>"
    When the user navigates to "<tab>" "<module>"
    Then the title contains "<title>"

    Examples:
      | userType      | tab        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts - Customers         |




#  Scenario: driver user
#    Given the user logged in as "driver"
#
#  Scenario: Sales Manager User
#    Given the user logged in as "sales manager"
#
#  Scenario: Store Manager User
#    Given the user logged in as "store manager"
  #  Scenario: Store Manager User
#    Given the user logged in as "admin"


  Scenario Outline: Different user types
    Given the user logged in as "<userType>"

    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |
      | admin         |

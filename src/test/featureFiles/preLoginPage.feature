Feature: PreLogin functionality


  @pre-login

  Scenario: Verify Functionality of change language in prelogin
    When the user clicks on BAHASA MALAYSIA in the Prelogin Page
    And verifies that the app language changes in malasia language
    Then the user clicks on CHINESE in the Prelogin Page
    And verifies that the app language changes in chinese language
    And the user clicks on ENGLISH in the Prelogin Page
    Then verifies that the app language changes in english language


  @pre-login
  Scenario: Verify Functionality of Submit button after selecting the terminal KCH in prelogin page
    When the user clicks on select terminal dropdown and choose KCH-Kutching in the Prelogin Page
    Then the user clicks on Submit button on the Prelogin Page


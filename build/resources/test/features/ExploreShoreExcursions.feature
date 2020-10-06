Feature: Open Shore Excursion and filter by port

  Scenario: Guest explores shore excursions destinations
    Given The guest has logged into the homepage
    When The guest navigates to the 'Shore Excursion' Page
    And The guest searches for 'Hawaii Cruises' destination
    And The guest filters for the 'Hilo, Hawaii' port
    Then The results are filtered by name of the port



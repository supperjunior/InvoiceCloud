Feature: Nordic homepage

  @smoke @home
  Scenario: Nordic homepage validation
    Given i have logged into Nordic homepage
    Then i check all links on the Nordic homepage are active and working

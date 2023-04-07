Feature: Manager should be able to get correct information on the Sales page.
  Agile Story: Verify there are 6 columns to see the quotations on the Sales page when the POS & sales managers login.

  Scenario: Verify there are 6 columns when manager access to the account.
    Given user is logged Sales manager or Pos manager
    And user clicks to Sales tab
    Then Manager should see below quotations
      | Quotation Number |
      | Quotation Date |
      | Customer |
      | Salesperson |
      | Total |
      | Status |


    Then Check login name appears on the top right corner
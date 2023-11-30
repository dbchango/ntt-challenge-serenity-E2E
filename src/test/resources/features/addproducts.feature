Feature: Add products

  Scenario: Add two products in a cart
    Given User enter in the online store
    When he adds two products in the cart
    Then he sees the cart counter and the total cost updated
    And he can visualize the selected items selecting the Shopping Cart

    When he select the Shopping Cart option
    And he clicks the Checkout button
    And he selects Guest Checkout as Checkout Option selection
    And he insert the informative data
    And he fills the rest of the formulary
    Then he sees the order validation message

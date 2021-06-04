Feature: Zad2

  Scenario Outline: zalogowanie do sklepu sparametryzowany zakup sprawdzenie koszyka płatności odbioru,
    Given loguję się na poprzedniego usera
    When wybieram do zakupu sweter <rozmiaru> <sztuk>
    Then dodaje do koszyka
    Then przechodze do checkout
    Then potwierdzam aadres
    Then wybieram odbiór pick up in store
    Then wybieram Pay by check
    Then klikam w order with obligation to pay
    And robie screenshot
    Examples:
      | rozmiaru| sztuk |
      | M | 5 |


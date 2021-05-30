
  Feature: AddressZad1

    Scenario Outline: zalogowanie wpisanie adresu sprawdzenie adresu
      Given zalogowany na usera z 10minut mail
      When jestem na stronie z kafelkiem Address
      Then wypelniam formularz <alias> <address> <city> <zip_postal> <code> <country> <phone>
      And sprawdzam czy dane sa ok
      Examples:
        | alias | address | city | zip_postal | code | country | phone |
        | grzgorz | Wroclawska | miasto | NN-NNN | NN-NNN | dania | 55555555 |



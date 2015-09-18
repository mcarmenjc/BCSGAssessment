# BCSG Test

## Bank Card classes

I have created an abstract class BankCard with the main properties of a card and the abstract method getMaskedCardNumber, which will have a different implementation depending on the bank.

![Image of class diagram](https://raw.githubusercontent.com/mcarmenjc/BCSGAssessment/master/0eb05bce.png)

There is also a BankCardFactory which will instantiate the correct card class.

This approach makes easy to add new card from differents banks and even different types of banks.

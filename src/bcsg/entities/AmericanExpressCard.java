package bcsg.entities;

import java.util.GregorianCalendar;

public class AmericanExpressCard extends BankCard {

	public AmericanExpressCard(String cardNumber, GregorianCalendar expiryDate) {
		super(cardNumber, expiryDate);
		bankName = "American Express";
	}

	public String getMaskedCardNumber() {
		String maskedCardNumber = "xxxx-xxxx-xxxx-" + cardNumber.substring(cardNumber.lastIndexOf("-") + 1);
		return maskedCardNumber;
	}

}

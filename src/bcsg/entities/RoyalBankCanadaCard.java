package bcsg.entities;

import java.util.GregorianCalendar;

public class RoyalBankCanadaCard extends BankCard {

	public RoyalBankCanadaCard(String cardNumber, GregorianCalendar expiryDate) {
		super(cardNumber, expiryDate);
		bankName = "Royal Bank of Canada";
	}

	public String getMaskedCardNumber() {
		String maskedCardNumber = cardNumber.substring(0,cardNumber.indexOf("-")) + "-xxxx-xxxx-xxxx";
		return maskedCardNumber;
	}

}

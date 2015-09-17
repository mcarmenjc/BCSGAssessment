package bcsg.entities;

import java.util.GregorianCalendar;

public class HSBCCanadaCard extends BankCard {
	public HSBCCanadaCard(String cardNumber, GregorianCalendar expiryDate)  {
		super(cardNumber, expiryDate);
		bankName = "HSBC Canada";
	}
	
	public String getMaskedCardNumber(){
		String maskedCardNumber = cardNumber.substring(0,2) + "xx-xxxx-xxxx-xxxx";
		return maskedCardNumber;
	}
}

package bcsg.entities;

import java.util.GregorianCalendar;

public class BankCardFactory {
	public static BankCard getBankCard(String cardNumber, GregorianCalendar expiryDate, String bankName){
		BankCard card = null;
		String upperName = bankName.toUpperCase();
		if (upperName.equals("HSBC CANADA")){
			card = new HSBCCanadaCard(cardNumber, expiryDate); 
		}
		if (upperName.equals("ROYAL BANK OF CANADA")){
			card = new RoyalBankCanadaCard(cardNumber, expiryDate); 
		}
		if (upperName.equals("AMERICAN EXPRESS")){
			card = new AmericanExpressCard(cardNumber, expiryDate); 
		}
		return card;
	}
}

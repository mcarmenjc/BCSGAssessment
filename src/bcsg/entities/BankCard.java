package bcsg.entities;

import java.util.GregorianCalendar;

public abstract class BankCard {
	protected String cardNumber;
	protected GregorianCalendar expiryDate;
	protected String bankName;
	
	public BankCard(String cardNumber, GregorianCalendar expiryDate) {
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public GregorianCalendar getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(GregorianCalendar expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public abstract String getMaskedCardNumber();
}

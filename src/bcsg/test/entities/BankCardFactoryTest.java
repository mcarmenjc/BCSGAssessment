package bcsg.test.entities;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;

import bcsg.entities.*;

public class BankCardFactoryTest {
	@Test
	public void HSBCCanadaCardShouldBeCorrectlyCreatedWhenBankIsHSBCCanada() {
		BankCard card = BankCardFactory.getBankCard("1234-1234-1234-1234", new GregorianCalendar(), "HSBC Canada");
		assertTrue(card instanceof HSBCCanadaCard);
	}

	@Test
	public void RoyalBankCanadaCardShouldBeCorrectlyCreatedWhenBankIsRoyalBankOfCanada() {
		BankCard card = BankCardFactory.getBankCard("1234-1234-1234-1234", new GregorianCalendar(), "Royal Bank of Canada");
		assertTrue(card instanceof RoyalBankCanadaCard);
	}
	
	@Test
	public void AmericanExpressCardShouldBeCorrectlyCreatedWhenBankIsAmericanExpress() {
		BankCard card = BankCardFactory.getBankCard("1234-1234-1234-1234", new GregorianCalendar(), "American Express");
		assertTrue(card instanceof AmericanExpressCard);
	}
}

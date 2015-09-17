package bcsg.test.entities;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import bcsg.entities.RoyalBankCanadaCard;

public class RoyalBankCanadaCardTest {

	private RoyalBankCanadaCard card;
	
	@Before
	public void setUp() throws Exception {
		GregorianCalendar expiryDate = new GregorianCalendar();
		expiryDate.set(2015, 2, 1);
		card = new RoyalBankCanadaCard("4519-4532-4524-2456", expiryDate);
	}

	@Test
	public void CardNumberShouldBeCorrect() {
		assertEquals("4519-4532-4524-2456", card.getCardNumber());
	}

	@Test
	public void ExpiryDateShouldBeCorrect() {
		GregorianCalendar expiryDate = new GregorianCalendar();
		expiryDate.set(2015, 2, 1);
		assertEquals(expiryDate, card.getExpiryDate());
	}
	
	@Test
	public void BankNameShouldBeRoyalBankOfCanada() {
		assertEquals("Royal Bank of Canada", card.getBankName());
	}
	
	@Test
	public void CardNumberShouldBeCorrectlyMasked() {
		assertEquals("4519-xxxx-xxxx-xxxx", card.getMaskedCardNumber());
	}

}

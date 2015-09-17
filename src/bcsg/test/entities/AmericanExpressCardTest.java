package bcsg.test.entities;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import bcsg.entities.AmericanExpressCard;

public class AmericanExpressCardTest {

	private AmericanExpressCard card;
	
	@Before
	public void setUp() throws Exception {
		GregorianCalendar expiryDate = new GregorianCalendar();
		expiryDate.set(2015, 2, 1);
		card = new AmericanExpressCard("3786-7334-8965-345", expiryDate);
	}

	@Test
	public void CardNumberShouldBeCorrect() {
		assertEquals("3786-7334-8965-345", card.getCardNumber());
	}

	@Test
	public void ExpiryDateShouldBeCorrect() {
		GregorianCalendar expiryDate = new GregorianCalendar();
		expiryDate.set(2015, 2, 1);
		assertEquals(expiryDate, card.getExpiryDate());
	}
	
	@Test
	public void BankNameShouldBeAmreicanExpress() {
		assertEquals("American Express", card.getBankName());
	}
	
	@Test
	public void CardNumberShouldBeCorrectlyMasked() {
		assertEquals("xxxx-xxxx-xxxx-345", card.getMaskedCardNumber());
	}

}

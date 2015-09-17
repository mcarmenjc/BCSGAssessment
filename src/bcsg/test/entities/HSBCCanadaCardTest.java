package bcsg.test.entities;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import bcsg.entities.HSBCCanadaCard;

public class HSBCCanadaCardTest {
	private HSBCCanadaCard card;
	
	@Before
	public void setUp() throws Exception {
		GregorianCalendar expiryDate = new GregorianCalendar();
		expiryDate.set(2015, 2, 1);
		card = new HSBCCanadaCard("5601-2345-3446-5678", expiryDate);
	}

	@Test
	public void CardNumberShouldBeCorrect() {
		assertEquals("5601-2345-3446-5678", card.getCardNumber());
	}

	@Test
	public void ExpiryDateShouldBeCorrect() {
		GregorianCalendar expiryDate = new GregorianCalendar();
		expiryDate.set(2015, 2, 1);
		assertEquals(expiryDate, card.getExpiryDate());
	}
	
	@Test
	public void BankNameShouldBeHSBCCanada() {
		assertEquals("HSBC Canada", card.getBankName());
	}
	
	@Test
	public void CardNumberShouldBeCorrectlyMasked() {
		assertEquals("56xx-xxxx-xxxx-xxxx", card.getMaskedCardNumber());
	}
}

package bcsg.test.repositories;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bcsg.entities.AmericanExpressCard;
import bcsg.entities.BankCard;
import bcsg.repositories.BankCardRepository;

public class BankCardRepositoryTest {

	private BankCardRepository repository;
	private List<BankCard> cards;
	
	@Before
	public void setUp() throws Exception {
		repository = new BankCardRepository("./testData/cardsExample.csv");
		cards = repository.getAllCardsOrderedByExpiryDate();
	}
	
	@Test
	public void CardsShouldBeCorrectlyRead() {
		assertEquals(3, cards.size());
	}
	
	@Test
	public void CardExpiryDateShouldBeCorrectlyGenerated(){
		SimpleDateFormat formatter=new SimpleDateFormat("MMM-yyyy");
		assertEquals("Nov-2017", formatter.format(cards.get(1).getExpiryDate().getTime()));
	}

	@Test
	public void CardDataShouldBeCorrectlyRead(){	
		assertEquals("HSBC Canada", cards.get(1).getBankName());
		assertEquals("5601-2345-3446-5678", cards.get(1).getCardNumber());
	}
	
	@Test
	public void CardsShouldBeOrderedDescendingByExpiryDate(){	
		assertEquals("American Express", cards.get(0).getBankName());
		assertEquals("HSBC Canada", cards.get(1).getBankName());
		assertEquals("Royal Bank of Canada", cards.get(2).getBankName());
	}
}

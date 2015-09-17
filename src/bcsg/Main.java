package bcsg;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.List;

import bcsg.entities.BankCard;
import bcsg.repositories.BankCardRepository;

public class Main {

	public static void main(String[] args) {
		BankCardRepository repository = new BankCardRepository("./testData/cardsExample.csv");
		SimpleDateFormat formatter=new SimpleDateFormat("MMM-yyyy");
		List<BankCard> cards = repository.getAllCardsOrderedByExpiryDate();
		for (BankCard card : cards) {
		    System.out.println(formatter.format(card.getExpiryDate().getTime()) + 
		    		" - " + card.getMaskedCardNumber() + 
		    		" - " + card.getBankName() );
		}
	}

}

package bcsg.repositories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import bcsg.entities.BankCard;
import bcsg.entities.BankCardFactory;

public class BankCardRepository {
	private String fileName;
	
	public BankCardRepository(String fileName){
		this.fileName = fileName;
	}

	private GregorianCalendar ParseCardExpiryDate(String[] cardData) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("MMM-yyyy");
		Date parsed = dateFormat.parse(cardData[2]);
		GregorianCalendar date = new GregorianCalendar();
		date.setTime(parsed);
		return date;
	}
	
	public List<BankCard> getAllCardsOrderedByExpiryDate(){
		List<BankCard> cards = new ArrayList<BankCard>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
		{
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] cardData = line.split(";");
				GregorianCalendar date = ParseCardExpiryDate(cardData);
				cards.add(BankCardFactory.getBankCard(cardData[1], date, cardData[0]));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		cards.sort((card1, card2) -> card1.getExpiryDate().compareTo(card2.getExpiryDate()));
		return cards;
	}
}

package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> cards; 
	
	public List<Card> getCards() {
		return cards;
	}

	public void add(Card card) {
		this.cards.add(card);
	}

	public Deck(List<Card> cards) {
		super();
		this.cards = cards;
	}	
	
	public Deck() {
		super();
		this.cards = new ArrayList<Card>();
	}	
}

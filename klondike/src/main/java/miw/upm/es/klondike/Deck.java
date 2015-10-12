package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	protected List<Card> cards; 
	
	public List<Card> getCards() {
		return cards;
	}

	public void add(Card card) {
		this.cards.add(card);
	}
	
	public void addToBegginning(Card card) {
		this.cards.add(0, card);
	}
	
	public Card removeAndRetrieveLast() {
		return (Card) this.cards.remove(cards.size() - 1);
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

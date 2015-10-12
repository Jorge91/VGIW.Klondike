package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.List;

public class FoundationDeck extends Deck {

	private Foundation foundation;
	
	
	
	public FoundationDeck(List<Card> cards, Foundation foundation) {
		super(cards);
		this.foundation = foundation;
	}
	
	public FoundationDeck(Foundation foundation) {
		super();
		this.foundation = foundation;
	}



	public boolean canAddCard(int cardValue, Foundation foundation) {
		Card lastCard = null;
		if (cards.size() != 0) {
			lastCard = cards.get(cards.size() - 1);
		}
		
		int majorValue;
		if (lastCard == null) {
			majorValue = Board.cardsByFoundation + 1;
		} else {
			majorValue = lastCard.getValue();
		}
		
		if (cardValue + 1 != majorValue) {
			return false;
		}
		
		if (this.foundation != foundation) {
			return false;
		}
		
		return true;	
	}
	
}

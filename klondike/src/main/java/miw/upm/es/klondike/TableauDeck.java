package miw.upm.es.klondike;

import java.util.List;

public class TableauDeck extends Deck {

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
			if (lastCard.isCovered()) {
				return false;
			}
		}

		if (cardValue != majorValue - 1) {
			return false;
		}

		if (lastCard != null) {
			if (lastCard.getFoundation() == foundation) {
				return false;
			}
		}

		return true;
	}

	public void uncoverLastCard() {
		if (cards.size() != 0) {
			Card lastCard = cards.get(cards.size() - 1);
			if (lastCard.isCovered())
				lastCard.setCovered(false);
		}
	}

}

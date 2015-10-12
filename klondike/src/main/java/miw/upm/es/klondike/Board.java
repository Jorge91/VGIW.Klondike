package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Board {
	
	//TODO:
	public static final int cardsByFoundation = 12;
	public static final Foundation[] foundations = {new Foundation("o"), 
													new Foundation("c"), 
													new Foundation("e"), 
													new Foundation("b")
													};
	public static final int numberOfTableauDecks = 7;
	
	private Random randomGenerator;

	public List<TableauDeck> tableau; 
	public Deck mainDeck;
	public Deck waste;
	public Map<Foundation, FoundationDeck> foundation;
	
	public Board() {
		List<Card> totalCards = new ArrayList<Card>();
		randomGenerator = new Random();
		
		for (int i = 0; i< cardsByFoundation; i++) {
			for (int j = 0; j < foundations.length; j++) {
				totalCards.add(new Card(i + 1, foundations[j], true));
			}
		}
		
		this.tableau = new ArrayList<TableauDeck>();
		for (int k = 0; k < numberOfTableauDecks; k++) {
			TableauDeck deck = new TableauDeck();
			for (int m = 1; m <= k + 1 ; m++) {
				int index = (int) randomGenerator.nextInt(totalCards.size());
				Card card = (Card) totalCards.remove(index);
				if (m == k+1) card.setCovered(false);
		        deck.add(card);
			}
			this.tableau.add(deck);
		}
		
		this.foundation = new HashMap<Foundation, FoundationDeck>();
		for (int n = 0; n < foundations.length; n++) {
			this.foundation.put(foundations[n], new FoundationDeck(foundations[n]));
		}
		
		this.mainDeck = new Deck(totalCards);	
		this.waste = new Deck();

	}


	public List<TableauDeck> getTableau() {
		return tableau;
	}


	public Deck getWaste() {
		return waste;
	}
	
	public Deck getMain() {
		return mainDeck;
	}


	public Map<Foundation, FoundationDeck> getFoundation() {
		return foundation;
	}
	
	public FoundationDeck getFoundationDeckByFoundation(Foundation foundation) {
		return this.foundation.get(foundation);
	}


	public TableauDeck getTableauDeckByNumber(int selectedTableau) {
		return tableau.get(selectedTableau);
	}
	

	public FoundationDeck getFoundationDeckByFoundationName(String name) {
		Foundation foundation = null;
		for (int i = 0; i < foundations.length; i++) {
			System.out.println(name);
			System.out.println(foundations[i].getName());
			if (foundations[i].getName().matches(name)) foundation = foundations[i];
		}
		return getFoundationDeckByFoundation(foundation);
	}
	

	
}

package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
	
	//TODO:
	public static final int cardsByFoundation = 12;
	public static final String[] foundations = {"o", "c", "e", "b"};
	public static final int numberOfTableauDecks = 7;
	
	private Random randomGenerator;

	public List<Deck> tableau; 
	public Deck mainDeck;
	public Deck waste;
	public List<Deck> foundation;
	
	
	// isFinished
	
	//public Board getBoard() {
		
	//}
	
	// Constructor por defecto: inicializa todos los mazos
	public Board() {
		List<Card> totalCards = new ArrayList<Card>();
		randomGenerator = new Random();
		
		for (int i = 0; i< cardsByFoundation; i++) {
			for (int j = 0; j < foundations.length; j++) {
				totalCards.add(new Card(i + 1, foundations[j], true));
			}
		}
		
		// Los 7 mazos del tableau
		this.tableau = new ArrayList<Deck>();
		for (int k = 0; k < numberOfTableauDecks; k++) {
			Deck deck = new Deck();
			for (int m = 1; m <= k + 1 ; m++) {
				int index = (int) randomGenerator.nextInt(totalCards.size());
				Card card = (Card) totalCards.remove(index);
				if (m == k+1) card.setCovered(false);
		        deck.add(card);
			}
			this.tableau.add(deck);
		}
		
		// Los 4 palos
		this.foundation = new ArrayList<Deck>();
		for (int n = 0; n < foundations.length; n++) {
			this.foundation.add(new Deck());
		}
		
		// Mazo principal
		this.mainDeck = new Deck(totalCards);	
		
		// mazo waste
		this.waste = new Deck();

	}


	public List<Deck> getTableau() {
		return tableau;
	}


	public Deck getWaste() {
		return waste;
	}
	
	public Deck getMain() {
		return mainDeck;
	}


	public List<Deck> getFoundation() {
		return foundation;
	}


	


	
	

	
}

package miw.upm.es.klondike;

public class WasteDeckController extends CardDeckController {

	public WasteDeckController(Board board) {
		super(board);
	}

	public Deck visibleDeck() {
		return board.getWaste();
	}
	
	
}

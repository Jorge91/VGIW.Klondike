package miw.upm.es.klondike;

public class FoundationDeckController extends CardDeckController {

	private Foundation foundation;
	
	public FoundationDeckController(Board board, Foundation foundation) {
		super(board);
		this.foundation = foundation;
	}

	public Deck visibleDeck() {
		return board.getFoundation().get(foundation);
	}
	
	public String getFoundationName() {
		return foundation.getName();
	}
	
	
	
}
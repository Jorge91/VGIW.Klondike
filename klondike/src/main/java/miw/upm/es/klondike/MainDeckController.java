package miw.upm.es.klondike;

public class MainDeckController extends CardDeckController {

	public MainDeckController(Board board) {
		super(board);
	}

	public Deck visibleDeck() {
		return board.getMain();
	}
	
	
	
}

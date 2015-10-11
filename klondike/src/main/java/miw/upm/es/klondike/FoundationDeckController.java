package miw.upm.es.klondike;

public class FoundationDeckController extends CardDeckController {

	private int position;
	
	public FoundationDeckController(Board board, int position) {
		super(board);
		this.position = position;
	}

	public Deck visibleDeck() {
		return board.getFoundation().get(position);
	}
	
	public String getFoundationName() {
		return Board.foundations[position];
	}
	
	
	
}
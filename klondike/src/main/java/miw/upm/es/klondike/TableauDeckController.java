package miw.upm.es.klondike;

public class TableauDeckController extends CardDeckController {

	private int position;
	
	public TableauDeckController(Board board, int position) {
		super(board);
		this.position = position;
	}

	public Deck visibleDeck() {
		return board.getTableau().get(position);
	}
	
	public int getTableauNumber() {
		return position + 1;
	}
	
	
	
}
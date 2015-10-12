package miw.upm.es.klondike;

public abstract class CardDeckController extends Controller {

	protected CardDeckController(Board board) {
		super(board);
	}

	abstract Deck visibleDeck();
}

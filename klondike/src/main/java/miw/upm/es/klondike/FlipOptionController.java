package miw.upm.es.klondike;

public class FlipOptionController extends OptionController {

	protected FlipOptionController(Board board) {
		super(board);
	}

	@Override
	public void performAction() {
		int numberOfTableaus = board.getTableau().size();
		int tableau = new AskNumberView().askNumberView(numberOfTableaus, "¿De qué escalera?");
		
		TableauDeck tableauDeck = (TableauDeck) board.getTableauDeckByNumber(tableau);
		tableauDeck.uncoverLastCard();
		
		Game.getGame().play();
	}

}

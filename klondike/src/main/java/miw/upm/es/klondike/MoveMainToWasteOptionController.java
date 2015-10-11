package miw.upm.es.klondike;

public class MoveMainToWasteOptionController extends OptionController {
	
	private final int cardsToMove = 3;

	protected MoveMainToWasteOptionController(Board board) {
		super(board);
	}

	@Override
	public void performAction() {
		if (board.getMain().getCards().size() >= cardsToMove) {
			for (int i = 0; i < cardsToMove; i++) {
				Card card = board.mainDeck.removeAndRetrieveLast();
				card.setCovered(false);
				board.waste.add(card);
			}
		}
		Game.getGame().play();
		
	}

}

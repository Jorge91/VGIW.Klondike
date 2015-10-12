package miw.upm.es.klondike;

public class MoveWasteToFoundationOptionController extends OptionController {

	protected MoveWasteToFoundationOptionController(Board board) {
		super(board);
	}

	@Override
	public void performAction() {

		if (board.waste.getCards().size() > 0) {
			Card card = board.waste.removeAndRetrieveLast();

			FoundationDeck foundationDeck = (FoundationDeck) board.getFoundationDeckByFoundation(card.getFoundation());
			boolean canAdd = foundationDeck.canAddCard(card.getValue(), card.getFoundation());

			if (!canAdd) {
				board.waste.add(card);
				new ErrorView().render();
			} else {
				foundationDeck.add(card);
			}

		} else {
			new ErrorView().render();
		}

		Game.getGame().play();
	}

}

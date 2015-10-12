package miw.upm.es.klondike;

public class MoveTableauToFoundationOptionController extends OptionController {

	protected MoveTableauToFoundationOptionController(Board board) {
		super(board);
	}

	@Override
	public void performAction() {

		int numberOfTableaus = board.getTableau().size();
		int selectedTableau = new AskNumberView().askNumberView(numberOfTableaus, "¿Mover desde qué escalera?");
		TableauDeck tableauDeck = (TableauDeck) board.getTableauDeckByNumber(selectedTableau);

		if (tableauDeck.getCards().size() > 0) {

			Card card = tableauDeck.removeAndRetrieveLast();

			if (card.isCovered()) {
				new ErrorView().render();
			} else {
				FoundationDeck foundationDeck = (FoundationDeck) board
						.getFoundationDeckByFoundation(card.getFoundation());
				boolean canAdd = foundationDeck.canAddCard(card.getValue(), card.getFoundation());
				if (!canAdd) {
					tableauDeck.add(card);
					new ErrorView().render();
				} else {
					foundationDeck.add(card);
				}
			}

		} else {
			new ErrorView().render();
		}

		Game.getGame().play();
	}

}

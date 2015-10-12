package miw.upm.es.klondike;

public class MoveWasteToTableauOptionController extends OptionController {

	protected MoveWasteToTableauOptionController(Board board) {
		super(board);
	}

	@Override
	public void performAction() {
		if (board.waste.getCards().size() > 0) {
			Card card = board.waste.removeAndRetrieveLast();

			int numberOfTableaus = board.getTableau().size();
			int selectedTableau = new AskNumberView().askNumberView(numberOfTableaus, "¿Mover a qué escalera?");

			TableauDeck tableauDeck = (TableauDeck) board.getTableauDeckByNumber(selectedTableau);
			boolean canAdd = tableauDeck.canAddCard(card.getValue(), card.getFoundation());

			if (!canAdd) {
				board.waste.add(card);
				new ErrorView().render();
			} else {
				tableauDeck.add(card);
			}

		} else {
			new ErrorView().render();
		}

		Game.getGame().play();
	}

}

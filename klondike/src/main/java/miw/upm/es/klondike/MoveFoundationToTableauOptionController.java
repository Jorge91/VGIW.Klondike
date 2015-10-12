package miw.upm.es.klondike;

public class MoveFoundationToTableauOptionController extends OptionController {

	protected MoveFoundationToTableauOptionController(Board board) {
		super(board);
	}

	@Override
	public void performAction() {

		String fromFoundation = new AskCharView().askCharView("¿Mover desde qué palo? (Letra)");

		int numberOfTableaus = board.getTableau().size();
		int toTableau = new AskNumberView().askNumberView(numberOfTableaus, "¿Mover a qué escalera?");

		TableauDeck tableauDeckTo = (TableauDeck) board.getTableauDeckByNumber(toTableau);

		FoundationDeck foundationDeck = board.getFoundationDeckByFoundationName(fromFoundation);

		if (foundationDeck == null) {
			System.out.println(foundationDeck);
			new ErrorView().render();
		} else {
			Card card = foundationDeck.removeAndRetrieveLast();
			boolean canAdd = tableauDeckTo.canAddCard(card.getValue(), card.getFoundation());

			if (!canAdd) {
				new ErrorView().render();
			} else {
				tableauDeckTo.add(card);
			}

		}

		Game.getGame().play();
	}

}

package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.List;

public class MoveTableauToTableauOptionController extends OptionController {

	protected MoveTableauToTableauOptionController(Board board) {
		super(board);
	}

	@Override
	public void performAction() {

		int numberOfTableaus = board.getTableau().size();
		int fromTableau = new AskNumberView().askNumberView(numberOfTableaus, "¿Mover desde qué escalera?");
		int toTableau = new AskNumberView().askNumberView(numberOfTableaus, "¿Mover a qué escalera?");

		if (fromTableau == toTableau) {
			new ErrorView().render();
		} else {

			TableauDeck tableauDeckFrom = (TableauDeck) board.getTableauDeckByNumber(fromTableau);
			TableauDeck tableauDeckTo = (TableauDeck) board.getTableauDeckByNumber(toTableau);

			if (tableauDeckFrom.uncoveredCards() <= 0) {
				new ErrorView().render();
			} else {

				int cardsToMove = new AskNumberView().askNumberView(tableauDeckFrom.uncoveredCards(),
						"¿Cuántas cartas?") + 1;

				Card firstToMove = tableauDeckFrom.getCards().get(tableauDeckFrom.getCards().size() - cardsToMove);

				boolean canAdd = tableauDeckTo.canAddCard(firstToMove.getValue(), firstToMove.getFoundation());
				if (!canAdd) {
					new ErrorView().render();
				} else {
					List<Card> listToMove = new ArrayList<Card>();
					for (int j = 0; j < cardsToMove; j++) {
						listToMove.add(tableauDeckFrom.removeAndRetrieveLast());
					}
					for (int k = 0; k < cardsToMove; k++) {
						tableauDeckTo.add(listToMove.get(0));
					}

				}

			}
		}


		Game.getGame().play();
	}

}

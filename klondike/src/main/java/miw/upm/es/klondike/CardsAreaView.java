package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.List;

public class CardsAreaView {

	private CardsAreaController cardsAreaController;

	private MainDeckView mainDeckView;
	private WasteDeckView wasteDeckView;
	private List<FoundationDeckView> foundationDeckViews;
	private List<TableauDeckView> tableauDeckViews;

	public CardsAreaView(Controller controller) {
		this.cardsAreaController = (CardsAreaController) controller;

		Board board = cardsAreaController.getBoard();

		mainDeckView = new MainDeckView(new MainDeckController(board));
		wasteDeckView = new WasteDeckView(new WasteDeckController(board));

		foundationDeckViews = new ArrayList<FoundationDeckView>();
		for (int i = 0; i < Board.foundations.length; i++) {
			foundationDeckViews.add(new FoundationDeckView(new FoundationDeckController(board, Board.foundations[i])));
		}

		tableauDeckViews = new ArrayList<TableauDeckView>();
		for (int i = 0; i < board.getTableau().size(); i++) {
			tableauDeckViews.add(new TableauDeckView(new TableauDeckController(board, i)));
		}
	}

	public void render() {

		mainDeckView.render();
		wasteDeckView.render();
		for (int i = 0; i < foundationDeckViews.size(); i++) {
			foundationDeckViews.get(i).render();
		}
		for (int j = 0; j < tableauDeckViews.size(); j++) {
			tableauDeckViews.get(j).render();
		}

	}

}

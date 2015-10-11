package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.List;

public class CardsAreaView {
	
	private CardsAreaController cardsAreaController;
	
	private MainDeckView mainDeckView;
	private WasteDeckView wasteDeckView;
	private List<FoundationDeckView> foundationDeckViews;
	private List<TableauDeckView> tableauDeckViews;
	
	public CardsAreaView(Controller controller){
		this.cardsAreaController = (CardsAreaController) controller;
		
		Board board = cardsAreaController.getBoard();
		
		mainDeckView = new MainDeckView(new MainDeckController(board));
		wasteDeckView = new WasteDeckView(new WasteDeckController(board));
		
		foundationDeckViews = new ArrayList<FoundationDeckView>();
		for (int i = 0; i < board.getFoundation().size(); i++) {
			foundationDeckViews.add(new FoundationDeckView(new FoundationDeckController(board, i)));
		}
		
		tableauDeckViews = new ArrayList<TableauDeckView>();
		for (int i = 0; i < board.getTableau().size(); i++) {
			tableauDeckViews.add(new TableauDeckView(new TableauDeckController(board, i)));
		}
	}

	public void render() {

		//Print main
		mainDeckView.render();
		// Print waste
		wasteDeckView.render();
		// Print foundations
		for (int i = 0; i < foundationDeckViews.size(); i++) {
			foundationDeckViews.get(i).render();
		}
		// Print tableau
		for (int j = 0; j < tableauDeckViews.size(); j++) {
			tableauDeckViews.get(j).render();
		}
		
	}
	
}

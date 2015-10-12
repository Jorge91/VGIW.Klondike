package miw.upm.es.klondike;

public class MoveWasteToMainOptionController extends OptionController {
	
	protected MoveWasteToMainOptionController(Board board) {
		super(board);
	}

	@Override
	public void performAction() {
		int cardsInWaste = board.waste.getCards().size();
		for (int i = 0; i < cardsInWaste; i++) {
			System.out.println(i);

			Card card = board.waste.removeAndRetrieveLast();
			card.setCovered(true);
			board.mainDeck.addToBegginning(card);
			
		
		}
		
		Game.getGame().play();
		
	}

}

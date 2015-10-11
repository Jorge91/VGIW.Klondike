package miw.upm.es.klondike;

public class GameView {

	private GameController gameController;
	
	private CardsAreaView cardsAreaView;
	private MenuView menuView;

	public GameView(GameController gameController) {
		super();
		this.gameController = gameController;
		cardsAreaView = new CardsAreaView(new CardsAreaController(gameController.getBoard()));
		
		
	}
	
	public void render() {
		cardsAreaView.render();
		//menuView.render();
	}
	
	
	
}

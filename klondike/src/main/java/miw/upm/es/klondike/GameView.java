package miw.upm.es.klondike;

public class GameView {

	private GameController gameController;

	private CardsAreaView cardsAreaView;
	private MenuView menuView;

	public GameView(GameController gameCtrl) {
		super();
		this.gameController = gameCtrl;
		cardsAreaView = new CardsAreaView(new CardsAreaController(gameController.getBoard()));
		menuView = new MenuView(new MenuController(gameController.getBoard()));

	}

	public void render() {
		cardsAreaView.render();
		menuView.render();
	}

}

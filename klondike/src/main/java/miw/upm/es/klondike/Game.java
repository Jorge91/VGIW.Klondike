package miw.upm.es.klondike;

public class Game {
	
	private Board board;
	
	
	//private ColocateControllerFactory colocateControllerFactory;
	
	private GameView gameView;
	private GameController gameController;
		
	//private GameView gameView;
	
	
	public void play() {
		gameView.render();
	
	}

	public static void main(String[] args) {
		new Game().play();
	}

	
	public Game() {
		super();
		
		this.board = new Board();
		this.gameController = new GameController(this.board);
		this.gameView = new GameView(gameController);
	}
	
	

}

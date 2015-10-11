package miw.upm.es.klondike;

public class Game {
	
	private Board board;
	private static Game game;
	
	
	//private ColocateControllerFactory colocateControllerFactory;
	
	private GameView gameView;
	private GameController gameController;
		
	//private GameView gameView;
	
	
	public void play() {
		gameView.render();
	
	}

	public static void main(String[] args) {
		Game.getGame().play();
	}

	
	private Game() {
		super();
		
		this.board = new Board();
		this.gameController = new GameController(this.board);
		this.gameView = new GameView(gameController);
	}
	
	public static Game getGame() {
		if (game == null) {
			game = new Game();
		} 
		return game;
		
	}
	
	

}

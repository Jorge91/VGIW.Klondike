package miw.upm.es.klondike;

public abstract class Controller {

	protected Board board;

	protected Controller(Board board) {
		assert board != null;
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

}
package miw.upm.es.klondike;

public abstract class OptionController extends Controller {

	protected OptionController(Board board) {
		super(board);
	}

	public abstract void performAction();
	
	

}

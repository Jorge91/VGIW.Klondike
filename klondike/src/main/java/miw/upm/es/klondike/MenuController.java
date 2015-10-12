package miw.upm.es.klondike;

public class MenuController extends Controller {

	protected MenuController(Board board) {
		super(board);

	}

	public void performOption(OptionView optionView) {
		optionView.optionController.performAction();
	}

}

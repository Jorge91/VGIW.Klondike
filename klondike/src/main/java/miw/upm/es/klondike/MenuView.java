package miw.upm.es.klondike;

import java.util.ArrayList;
import java.util.List;

public class MenuView {

	private MenuController menuController;
	private List<OptionView> optionViews;

	public MenuView(MenuController menuController) {
		super();
		this.menuController = menuController;

		Board board = menuController.getBoard();

		this.optionViews = new ArrayList<OptionView>();
		this.optionViews.add(new MoveMainToWasteOptionView(new MoveMainToWasteOptionController(board)));
		this.optionViews.add(new MoveWasteToMainOptionView(new MoveWasteToMainOptionController(board)));
		this.optionViews.add(new MoveWasteToFoundationOptionView(new MoveWasteToFoundationOptionController(board)));
		this.optionViews.add(new MoveWasteToTableauOptionView(new MoveWasteToTableauOptionController(board)));
		this.optionViews.add(new MoveTableauToFoundationOptionView(new MoveTableauToFoundationOptionController(board)));
		this.optionViews.add(new MoveTableauToTableauOptionView(new MoveTableauToTableauOptionController(board)));
		this.optionViews.add(new MoveFoundationToTableauOptionView(new MoveFoundationToTableauOptionController(board)));
		this.optionViews.add(new FlipOptionView(new FlipOptionController(board)));
		this.optionViews.add(new ExitOptionView(new ExitOptionController(board)));

	}

	public void render() {
		IO io = new IO();
		io.writeln("-----------------");

		for (int i = 0; i < optionViews.size(); i++) {
			io.write((i + 1) + ": ");
			optionViews.get(i).render();
		}

		if (optionViews.size() == 0) {
			io.write("No hay opciones");
		} else {
			menuController
					.performOption(optionViews.get(new AskNumberView().askNumberView(optionViews.size(), "¿Opción?")));
		}

	}

}

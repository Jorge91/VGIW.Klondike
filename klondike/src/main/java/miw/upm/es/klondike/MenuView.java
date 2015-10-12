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

		// TODO: con factory
		this.optionViews = new ArrayList<OptionView>();
		this.optionViews.add(new MoveMainToWasteOptionView(new MoveMainToWasteOptionController(board)));
		this.optionViews.add(new MoveWasteToMainOptionView(new MoveWasteToMainOptionController(board)));
		this.optionViews.add(new MoveWasteToTableauOptionView(new MoveWasteToTableauOptionController(board)));
	}

	public void render() {
		IO io = new IO();
		io.writeln("-----------------");
		
		// render all options
		//TODO: factory
		for (int i = 0; i < optionViews.size(); i++) {
			io.write((i + 1) + ": ");
			optionViews.get(i).render();
		}
		
		
		
		// render ask
		if (optionViews.size() == 0) {
			io.write("No hay opciones" );
		} else {
			int optionChosen = -1;
			//TODO: usar AskNumberView
			while(optionChosen < 0 || optionChosen > optionViews.size()){
			optionChosen =  io.readInt("¿Opción? [1-" + optionViews.size() + "]: " );
			}
			// respuesta: llamar al controller
			menuController.performOption(optionViews.get(optionChosen - 1));
			
			
			
			
		}
		
		
		
		
	}

}

package miw.upm.es.klondike;

public class MoveWasteToTableauOptionView extends OptionView {

	public MoveWasteToTableauOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Mover de descarte a escalera");
	}

}

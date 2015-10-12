package miw.upm.es.klondike;

public class MoveWasteToMainOptionView extends OptionView {

	public MoveWasteToMainOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Mover de descarte a baraja");
	}

	

}

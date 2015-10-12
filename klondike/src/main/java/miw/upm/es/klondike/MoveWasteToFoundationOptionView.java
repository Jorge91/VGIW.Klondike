package miw.upm.es.klondike;

public class MoveWasteToFoundationOptionView extends OptionView {

	public MoveWasteToFoundationOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Mover de descarte a palo");
	}

}

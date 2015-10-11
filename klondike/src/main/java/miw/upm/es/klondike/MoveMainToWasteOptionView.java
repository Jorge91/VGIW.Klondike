package miw.upm.es.klondike;

public class MoveMainToWasteOptionView extends OptionView {

	public MoveMainToWasteOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Mover de baraja a descarte");
	}

	

}

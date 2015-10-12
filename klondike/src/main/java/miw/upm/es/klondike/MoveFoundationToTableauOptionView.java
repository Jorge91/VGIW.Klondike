package miw.upm.es.klondike;

public class MoveFoundationToTableauOptionView extends OptionView {

	public MoveFoundationToTableauOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Mover de palo a escalera");
	}

}

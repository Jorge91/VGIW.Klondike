package miw.upm.es.klondike;

public class MoveTableauToFoundationOptionView extends OptionView {

	public MoveTableauToFoundationOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Mover de escalera a palo");
	}

}

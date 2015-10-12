package miw.upm.es.klondike;

public class MoveTableauToTableauOptionView extends OptionView {

	public MoveTableauToTableauOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Mover de escalera a escalera");
	}

}

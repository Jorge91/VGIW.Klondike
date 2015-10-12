package miw.upm.es.klondike;

public class FlipOptionView extends OptionView {

	public FlipOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Voltear carta");
	}

}

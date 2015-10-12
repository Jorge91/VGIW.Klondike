package miw.upm.es.klondike;

public class ExitOptionView extends OptionView {

	public ExitOptionView(OptionController optionController) {
		super(optionController);
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Salir");
	}

}

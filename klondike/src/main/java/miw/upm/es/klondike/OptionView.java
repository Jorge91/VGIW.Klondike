package miw.upm.es.klondike;

public abstract class OptionView {

	protected OptionController optionController;

	public OptionView(OptionController optionController) {
		super();
		this.optionController = optionController;
	}

	public abstract void render();

}

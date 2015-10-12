package miw.upm.es.klondike;

public class FoundationDeckView extends CardDeckView {

	public FoundationDeckView(FoundationDeckController controller) {
		super(controller);
	}
	
	public void render() {
		IO io = new IO();
		io.write(((FoundationDeckController)controller).getFoundationName() + ": ");
		super.render();
	}
	

	
}
package miw.upm.es.klondike;

public class TableauDeckView extends CardDeckView {

	public TableauDeckView(TableauDeckController controller) {
		super(controller);
	}
	
	public void render() {
		IO io = new IO();
		io.write(((TableauDeckController)controller).getTableauNumber() + ": ");
		super.render();
	}
	

	
}
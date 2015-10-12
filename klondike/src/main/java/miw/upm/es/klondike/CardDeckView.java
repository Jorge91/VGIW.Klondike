package miw.upm.es.klondike;

public abstract class CardDeckView {

	protected CardDeckController controller;
	private Deck deck;

	public CardDeckView(CardDeckController controller) {
		super();
		this.controller = controller;
		deck = this.controller.visibleDeck();
	}

	public void render() {
		IO io = new IO();

		String toPrint = "";
		for (int i = 0; i < deck.getCards().size(); i++) {
			Card card = deck.getCards().get(i);
			toPrint += card.isCovered() ? "]" : card.getCardName();
		}
		if (toPrint == "")
			toPrint = "<vacío>";

		io.writeln(toPrint);
	}

}

package miw.upm.es.klondike;

public class Card {

	private int value;
	private Foundation foundation;
	private boolean covered;
	
	public Card(int value, Foundation foundation, boolean covered) {
		super();
		this.value = value;
		this.foundation = foundation;
		this.covered = covered;
	}

	public int getValue() {
		return value;
	}

	public Foundation getFoundation() {
		return foundation;
	}

	public boolean isCovered() {
		return covered;
	}
	
	public String getCardName() {
		return "[" + value + foundation.getName() + "]";
	}

	public void setCovered(boolean covered) {
		this.covered = covered;
	}
	
}

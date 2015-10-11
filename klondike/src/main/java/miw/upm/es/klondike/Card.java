package miw.upm.es.klondike;

public class Card {

	private int value;
	private String foundation;
	private boolean covered;
	
	public Card(int value, String foundation, boolean covered) {
		super();
		this.value = value;
		this.foundation = foundation;
		this.covered = covered;
	}

	public int getValue() {
		return value;
	}

	public String getFoundation() {
		return foundation;
	}

	public boolean isCovered() {
		return covered;
	}
	
	public String getCardName() {
		return "[" + value + foundation + "]";
	}

	public void setCovered(boolean covered) {
		this.covered = covered;
	}
	
}

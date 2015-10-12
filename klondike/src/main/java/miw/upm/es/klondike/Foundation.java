package miw.upm.es.klondike;

public class Foundation {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Foundation(String name) {
		super();
		this.name = name;
	}
	
	public boolean compareFoundations(Foundation foundation) {
		return this.name == foundation.getName();
	}
	
	
	
}

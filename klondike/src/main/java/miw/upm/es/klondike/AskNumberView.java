package miw.upm.es.klondike;

public class AskNumberView {

	
	public int askNumberView(int sizeOfOptions, String question) {
		IO io = new IO();
		int optionChosen = -1;
		
		while(optionChosen < 0 || optionChosen > sizeOfOptions){
			optionChosen =  io.readInt(question + "[1-" + sizeOfOptions + "]: " );
		}
		return optionChosen;
		
	}

	
}

package miw.upm.es.klondike;


public class AskCharView {

	
	public String askCharView(String question) {
		IO io = new IO();
		Character optionChosen = null;
		
		while(optionChosen == null){
			optionChosen =  io.readChar(question);
		}
		return "" + optionChosen;
		
	}

	
}

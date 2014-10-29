package OefeningHoofdstuk4;

public class main {

	public static void main(String[] args) {
		Dierenwinkel winkel = new Dierenwinkel();
		
		winkel.voegToe(new Hamster("Hamster"));	
		winkel.voegToe(new Hond("Hond"));
		winkel.voegToe(new Kat("Kat"));
		
		winkel.printOverzicht();
	}
}

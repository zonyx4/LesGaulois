package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois ("Ast�rix", 8);
		asterix.parler("Bonjour � tous");
		Romain minus = new Romain ("Minus", 6);
		minus.parler("UN GAU...UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}

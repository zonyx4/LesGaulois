package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois ("Ast�rix", 8);
		Gaulois obelix = new Gaulois ("Ob�lix", 15);
		Druide panoramix = new Druide ("Panoramix", 5, 10);
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain ("Minus", 6);
		minus.parler("UN GAU...UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}

package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	this.nom = nom;
	this.effetPotionMin = effetPotionMin;
	this.effetPotionMax = effetPotionMax;
	this.forcePotion = 1;
	parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int preparerPotion() {
		Random r = new Random();
		
		int forcePotion = r.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;
		if (forcePotion > 7) {
			System.out.println(prendreParole()+ "« " + "J'ai préparé une super potion de force" + "»" );
		}
		else {
			System.out.println(prendreParole()+ "« " + "Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force" + "»");
		}
		System.out.println(forcePotion);
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()=="Obélix") {
			this.parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide ("Panoramix", 5, 10);
		panoramix.preparerPotion();
		panoramix.preparerPotion();
		panoramix.preparerPotion();
	}
}

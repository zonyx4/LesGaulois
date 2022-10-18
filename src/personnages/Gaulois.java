package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force = force;
	}
	
	public int getEffetPotion() {
		return effetPotion;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}

	private String prendreParole() {
		return "Le gaulois " + nom +" :";
	}
	
	public void boirePotion(int potion) {
		System.out.println(prendreParole() +"« Merci Druide, je sens que ma force est "+ Integer.toString(potion) +" fois décuplée. »");
		setEffetPotion(effetPotion * potion);
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+romain.getNom());
		romain.recevoirCoup(force * effetPotion / 3);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix", 8);
		System.out.println(asterix.toString());
		asterix.parler("Je suis le plus fort");
		Romain eclatus = new Romain ("Eclatus", 7);
		asterix.boirePotion(3);
		asterix.frapper(eclatus);
		asterix.frapper(eclatus);
		asterix.frapper(eclatus);
		asterix.frapper(eclatus);
	}
}

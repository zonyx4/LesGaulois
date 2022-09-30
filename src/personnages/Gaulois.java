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

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
		}

	private String prendreParole() {
		return "Le gaulois" + nom +" :";
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		//TODO cr�er un main permettant de tester la classe Gaulois
	}
}

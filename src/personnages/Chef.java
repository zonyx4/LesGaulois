package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Chef(String nom, int force ) {
		this.nom = nom;
		this.force = force;
	}
	
	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		return "Le chef " + nom + " du village " + village.getNom() + " : ";
	}
	
	public void boirePotion(int potion) {
		System.out.println(prendreParole() +"� Merci Druide, je sens que ma force est "+ Integer.toString(potion) +" fois d�cupl�e. �");
		setEffetPotion(effetPotion * potion);
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "+romain.getNom());
		romain.recevoirCoup(force * effetPotion / 3);
	}
}

package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		chef.setVillage(this);
	}
	
	public Chef getChef() {
		return chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[nbVillageois]=gaulois;
		this.nbVillageois++;
	}
	
//	public int trouverHabitant(Gaulois gaulois) {
//		for (int i=0; i< this.nbVillageois; i++) {
//			if (this.villageois[i].getNom() == gaulois.getNom()) {
//				return i;
//			}
//		}
//	}
	
	public Gaulois trouverHabitant(int ref) {
		return villageois[ref];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + this.chef.getNom() + " vivent les légendaires gaulois : ");
		for (int i=0; i < this.nbVillageois;i++) {
			System.out.println("- " + this.villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		
		//Gaulois gaulois = village.trouverHabitant(30);
		//il y a 30 villageois en tout, mais les index vont de 0 à 29 et non jusqu'à 30	
		
		Chef abraracourcix = new Chef("Abraracourcix", 6);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		astérix est d'indice 0 et nom d'indice 1
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
	}
}
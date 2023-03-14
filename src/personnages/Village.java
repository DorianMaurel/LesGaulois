package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private static Gaulois[] villageois ;
	private static int nbVillageois = 0 ;
	private int nbVillageoisMaximum ;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nbVillageois = nbVillageois;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public static Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	
	public static void afficherVillageois() {
		System.out.println("Dans le village du chef " + Chef.getNom() +" vivent les légendaires gaulois :");
		for (int i=0; i<nbVillageois;i++) {
			Gaulois gaulois = trouverHabitant(i);
			   System.out.println("- " + gaulois.getNom());
			}
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductible", 30);
		///Gaulois gaulois1 = village.trouverHabitant(30);
		/// Le max a été atteind
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obelix", 25);
		Village.ajouterHabitant(obelix);
		
		Village.afficherVillageois();

	}
}

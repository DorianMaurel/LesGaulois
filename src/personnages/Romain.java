package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "La force d'un romain dois être positive";
		int forceAvant = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		int forceApres = force;
		assert forceApres < forceAvant : "La force dois diminier après le coup";
	}
	
	public static void main(String[] args) {
		Romain cesar = new Romain("Cesar", 4);
		System.out.println(cesar.getNom());
		System.out.println(cesar.prendreParole());
		cesar.recevoirCoup(8);
		
		Romain minus = new Romain("Minus", 6);
		minus.parler("Salut");
		minus.recevoirCoup(4);
	
		
	}
}

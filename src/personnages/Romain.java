package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipement[];
	private int nbEquipement = 0;
	
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
	
	
	// FONCTION EN RAPPORT AVEC L'EQUIPEMENT
	public String sEquiper(Equipement stuff) {
		if (nbEquipement >= 2) {
			return "Le soldat " + getNom() +" est déjà bien protégé !";
		} else if (equipement[nbEquipement] == stuff && equipement[nbEquipement] != null) {
			return "Le soldat " + getNom() + " possede déja un " + equipement[0];
		}
		
		switch (stuff) {
			case CASQUE :
				equiperEquipement(stuff);
				break;
			case BOUCLIER :
				equiperEquipement(stuff);
				break;
		}
		return "Le soldat " + getNom() + "s'équipe avec un" + equipement[nbEquipement];
	}

	private void equiperEquipement(Equipement stuff) {
		equipement[nbEquipement] = stuff;
		nbEquipement += 1;
	}
	
	
	
	
	
	public static void main(String[] args) {
		//CREATION DU PERSONNAGE ET TEST DES FONCTON getNom, prendreParole, recevoirCoup ET	parler
		Romain cesar = new Romain("Cesar", 4);
		System.out.println(cesar.getNom());
		System.out.println(cesar.prendreParole());
		cesar.recevoirCoup(8);
		cesar.parler("J'ai très mal");
		
		
		// TEST DE LA PRE/POST CONDITION
		Romain minus = new Romain("Minus", 6);
		minus.recevoirCoup(4);
		
		
		//TEST DE L'ENUM EQUIEMENT
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);

		//TEST DE LA FOCTION sEquiper
		minus.sEquiper(Equipement.CASQUE);
	}
}

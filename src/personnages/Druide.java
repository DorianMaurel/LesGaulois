package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut allerd'une force " + effetPotionMin + " � "+ effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	
	// A FAIRE CAR ARRIVE PA A FAIRE L'OBJET RANDOM
	
	///public String preparerPotion() {
		/// a faire 
	///	Random random = new Random(this.effetPotionMax);
		
	///	if (random >= 7) {
		///	return parler("J'ai prepar� une super potion de force");
	///	} else {
		///	return parler("Je n'ai pas reussis � trouver tous les ingredients, ma potion est seulement de force");
	///	}
///	}
	
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		
	}
}

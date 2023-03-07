package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		/// Creation des personnage de l'histoire 
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);

		/// Debut du scenario
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU...UNE GAUGAU");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}

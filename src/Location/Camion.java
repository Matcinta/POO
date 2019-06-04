package Location;

public class Camion extends VehiculeLourd {

	// variables d'instance définit les caractéristiques propres à notre objet
	// Camion
	// ici aucune variable propre a Camion

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Camion
	public Camion(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis,
			int pvolume) {

		// super fait référence aux variables d'instance de la classe mère
		super(pmodele, panneeModele, pprixAchat, pimmatriculation, ppermis, pvolume);

	}

	@Override
	public String toString() {
		return super.toString() + "\nVolume: " + (this.volume) + " m3";
	}

	// ************* ACCESSEURS *************

	// pas besoin ici car pas de variable d'instance propre a Camion

	// ************* MUTATEURS *************

	// pas besoin ici car pas de variable d'instance propre a Camion
}

package Location;

public class Camion extends VehiculeLourd {

	// variables d'instance d�finit les caract�ristiques propres � notre objet
	// Camion
	// ici aucune variable propre a Camion

	// CONSTRUCTEUR: doit porter le m�me nom que notre classe, soit ici Camion
	public Camion(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis,
			int pvolume) {

		// super fait r�f�rence aux variables d'instance de la classe m�re
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

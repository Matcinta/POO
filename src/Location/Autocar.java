package Location;

public class Autocar extends VehiculeLourd {

	// variables d'instance définit les caractéristiques propores à notre objet
	// Autocar

	private int nbPassagers;

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Autocar
	// on lui passe des parametres

	public Autocar(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis,
			int pvolume, int pnbPassagers) {

		// super fait référence aux variables d'instance de la classe mère
		super(pmodele, panneeModele, pprixAchat, pimmatriculation, ppermis, pvolume);

		// this. fait référence à la variable d'instance de notre classe déclarée juste
		// au-dessus
		this.nbPassagers = pnbPassagers;
	}

	// ************* ACCESSEURS *************

	// retourne le nombre de passagers de notre objet Autocar
	public int getNbPassagers() {
		return nbPassagers;
	}

	// ************* MUTATEURS *************

	// définit le nombre de passagers de notre objet Autocar
	public void setNbPassagers(int nbPassagers) {
		this.nbPassagers = nbPassagers;
	}

	@Override
	public String toString() {
		return super.toString() + "\nVolume: " + (this.volume) + " m3 \nNombre de passagers: " + this.nbPassagers;
	}

	public boolean peutTransporterPassagers(int pnbPassagers, float volumeMoyenParPassager) {
		if (pnbPassagers > this.nbPassagers) {
			return false;
		}
		return this.volume >= pnbPassagers * volumeMoyenParPassager;
	}

	// public boolean peutTransporterPassagers(int pnbPassagers) {
	// float volBagage = pnbPassagers * 0.1f;
	// if (pnbPassagers <= 53 && volBagage <= 3) {
	// return this.nbPassagers > pnbPassagers;
	// }
	// return this.nbPassagers < pnbPassagers;
	// }
}

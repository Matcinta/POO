package Location;

public class VehiculeLourd extends Vehicule {

	// variables d'instance définit les caractéristiques propores à notre objet
	// VéhiculeLourd
	protected int volume;

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici
	// VehiculeLourd
	// on lui passe des parametres
	public VehiculeLourd(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis,
			int pvolume) {

		// super fait référence aux variables d'instance de la classe mère
		super(pmodele, panneeModele, pprixAchat, pimmatriculation, ppermis);

		// this. fait référence aux variables d'instances de notre classe déclarées
		// juste au-dessus
		this.volume = pvolume;
	}

	// ************* ACCESSEURS *************

	// retourne le volume de notre objet VehiculeLourd
	public int getVolume() {
		return volume;
	}

	// ************* MUTATEURS *************

	// définit le volume de notre objet VehiculeLourd
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean peutTransporterVolume(int pvolume) {
		return this.volume >= pvolume;
	}

}

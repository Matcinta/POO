package Location;

public final class Voiture extends Vehicule {

	// variables d'instance définit les caractéristiques propores à notre objet
	// Voiture
	private boolean autoradio;

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Voiture
	// on lui passe des parametres
	public Voiture(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis,
			boolean pautoradio) {

		// super fait référence aux variables d'instance de la classe mère
		super(pmodele, panneeModele, pprixAchat, pimmatriculation, ppermis);

		// this. fait référence aux variables d'instances de notre classe déclarées
		// juste au-dessus
		this.autoradio = pautoradio;
	}

	// ************* ACCESSEURS *************

	// retourne si notre objet Voiture possède un autoradio ou non
	public boolean isAutoradio() {
		return autoradio;
	}

	// ************* MUTATEURS *************

	// définit si notre objet Voiture possède un autoradio ou non
	public void setAutoradio(boolean autoradio) {
		this.autoradio = autoradio;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPossède un autoradio: " + (this.autoradio ? "Oui" : "Non");
	}

}

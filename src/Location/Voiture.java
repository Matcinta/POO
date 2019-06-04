package Location;

public final class Voiture extends Vehicule {

	// variables d'instance d�finit les caract�ristiques propores � notre objet
	// Voiture
	private boolean autoradio;

	// CONSTRUCTEUR: doit porter le m�me nom que notre classe, soit ici Voiture
	// on lui passe des parametres
	public Voiture(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis,
			boolean pautoradio) {

		// super fait r�f�rence aux variables d'instance de la classe m�re
		super(pmodele, panneeModele, pprixAchat, pimmatriculation, ppermis);

		// this. fait r�f�rence aux variables d'instances de notre classe d�clar�es
		// juste au-dessus
		this.autoradio = pautoradio;
	}

	// ************* ACCESSEURS *************

	// retourne si notre objet Voiture poss�de un autoradio ou non
	public boolean isAutoradio() {
		return autoradio;
	}

	// ************* MUTATEURS *************

	// d�finit si notre objet Voiture poss�de un autoradio ou non
	public void setAutoradio(boolean autoradio) {
		this.autoradio = autoradio;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPoss�de un autoradio: " + (this.autoradio ? "Oui" : "Non");
	}

}

package Location;

public class VehiculeLourd extends Vehicule {

	// variables d'instance d�finit les caract�ristiques propores � notre objet
	// V�hiculeLourd
	protected int volume;

	// CONSTRUCTEUR: doit porter le m�me nom que notre classe, soit ici
	// VehiculeLourd
	// on lui passe des parametres
	public VehiculeLourd(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis,
			int pvolume) {

		// super fait r�f�rence aux variables d'instance de la classe m�re
		super(pmodele, panneeModele, pprixAchat, pimmatriculation, ppermis);

		// this. fait r�f�rence aux variables d'instances de notre classe d�clar�es
		// juste au-dessus
		this.volume = pvolume;
	}

	// ************* ACCESSEURS *************

	// retourne le volume de notre objet VehiculeLourd
	public int getVolume() {
		return volume;
	}

	// ************* MUTATEURS *************

	// d�finit le volume de notre objet VehiculeLourd
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean peutTransporterVolume(int pvolume) {
		return this.volume >= pvolume;
	}

}

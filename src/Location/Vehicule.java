package Location;

public abstract class Vehicule {

	// variables d'instance: définissent les caractéristiques de note objet Véhicule
	protected String modele;
	protected int anneeModele;
	protected float prixAchat;
	protected String immatriculation;
	protected char permis;

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Véhicule
	// on lui passe des parametres
	public Vehicule(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis) {

		// this. fait référence aux variables d'instances de notre classe déclarées
		// ci-dessus
		// pmodele, panneeModele, pprixAchat, pimmatriculation, ppermis sont les
		// parametres du constructeur
		this.modele = pmodele;
		this.anneeModele = panneeModele;
		this.prixAchat = pprixAchat;
		this.immatriculation = pimmatriculation;
		this.permis = ppermis;
	}

	// ************* ACCESSEURS *************

	// retourne le modèle de notre objet Véhicule
	public String getModele() {
		return modele;
	}

	// retourne l'année du modèle de notre objet Véhicule
	public int getAnneeModele() {
		return anneeModele;
	}

	// retourne le prix d'achat de notre objet Véhicule
	public float getPrixAchat() {
		return prixAchat;
	}

	// retourne l'immatriculation de notre objet Véhicule
	public String getImmatriculation() {
		return immatriculation;
	}

	// retourne le type de permis de notre objet Véhicule
	public char getPermis() {
		return permis;
	}

	// ************* MUTATEURS *************

	// définit le modele du vehicule
	public void setModele(String modele) {
		this.modele = modele;
	}

	// définit l'année du vehicule
	public void setAnneeModele(int anneeModele) {
		this.anneeModele = anneeModele;
	}

	// définit le prix d'achat du vehicule
	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	// définit l'immatriculation du vehicule
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	// définit le type de permis du vehicule
	public void setPermis(char permis) {
		this.permis = permis;
	}

	@Override
	public String toString() {
		return "Marque: " + this.modele + "\nAnnéee de mise en circulation: " + this.anneeModele + "\nPrix d'achat: "
				+ this.prixAchat + "€\nImmatriculation: " + this.immatriculation + "\nType de permis: " + this.permis;
	}

	public int age() {
		return 2019 - this.anneeModele;

	}

	public float coutLocation() {
		if (this.age() < 1) {
			return this.getPrixAchat() / 200;
		}
		return this.getPrixAchat() / 250;

	}
}

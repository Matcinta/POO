package Location;

public abstract class Vehicule {

	// variables d'instance: d�finissent les caract�ristiques de note objet V�hicule
	protected String modele;
	protected int anneeModele;
	protected float prixAchat;
	protected String immatriculation;
	protected char permis;

	// CONSTRUCTEUR: doit porter le m�me nom que notre classe, soit ici V�hicule
	// on lui passe des parametres
	public Vehicule(String pmodele, int panneeModele, float pprixAchat, String pimmatriculation, char ppermis) {

		// this. fait r�f�rence aux variables d'instances de notre classe d�clar�es
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

	// retourne le mod�le de notre objet V�hicule
	public String getModele() {
		return modele;
	}

	// retourne l'ann�e du mod�le de notre objet V�hicule
	public int getAnneeModele() {
		return anneeModele;
	}

	// retourne le prix d'achat de notre objet V�hicule
	public float getPrixAchat() {
		return prixAchat;
	}

	// retourne l'immatriculation de notre objet V�hicule
	public String getImmatriculation() {
		return immatriculation;
	}

	// retourne le type de permis de notre objet V�hicule
	public char getPermis() {
		return permis;
	}

	// ************* MUTATEURS *************

	// d�finit le modele du vehicule
	public void setModele(String modele) {
		this.modele = modele;
	}

	// d�finit l'ann�e du vehicule
	public void setAnneeModele(int anneeModele) {
		this.anneeModele = anneeModele;
	}

	// d�finit le prix d'achat du vehicule
	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	// d�finit l'immatriculation du vehicule
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	// d�finit le type de permis du vehicule
	public void setPermis(char permis) {
		this.permis = permis;
	}

	@Override
	public String toString() {
		return "Marque: " + this.modele + "\nAnn�ee de mise en circulation: " + this.anneeModele + "\nPrix d'achat: "
				+ this.prixAchat + "�\nImmatriculation: " + this.immatriculation + "\nType de permis: " + this.permis;
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

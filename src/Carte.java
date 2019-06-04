
public class Carte {

	// variables d'instance: d�finissent les caract�ristiques de note objet Carte
	private String color;
	private int valeur;

	// CONSTRUCTEUR: doit porter le m�me nom que notre classe, soit ici Carte
	// on lui passe des parametres
	public Carte(String pcolor, int pvaleur) {

		// this. fait r�f�rence aux variables d'instances de notre classe d�clar�es
		// ci-dessus
		// pcolor et pvaleur sont les parametres du constructeur
		this.color = pcolor;
		this.valeur = pvaleur;
	}

	// ************* ACCESSEURS *************

	// retourne la couleur de notre objet Carte
	public String getColor() {
		return color;
	}

	// retourne la valeur de notre objet Carte
	public int getValeur() {
		return valeur;
	}

	// ************* MUTATEURS *************

	// d�finit la couleur de la carte
	public void setColor(String pcolor) {
		this.color = pcolor;
	}

	// d�finit la valeur de la carte
	public void setValeur(int pvaleur) {
		this.valeur = pvaleur;
	}

}
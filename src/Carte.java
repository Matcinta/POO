
public class Carte {

	//variables d'instance: définissent les caractéristiques de note objet Carte
	private String color;
	private int valeur;

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Carte
	// on lui passe des parametres
	public Carte(String pcolor, int pvaleur) {
		super(); // ???

		//this. fait référence aux variables d'instances de notre classe déclarées ci-dessus
		//pcolor et pvaleur sont les parametres du constructeur
		this.color = pcolor;
		this.valeur = pvaleur;
	}

	// ************* ACCESSEURS *************

	// retourne la couleur de notre objet Carte
	public String getColor() {
		return color;
	}

	//retourne la valeur de notre objet Carte
	public int getValeur() {
		return valeur;
	}

	// ************* MUTATEURS *************

	//définit la couleur de la carte
	public void setColor(String pcolor) {
		this.color = pcolor;
	}

	// définit la valeur de la carte
	public void setValeur(int pvaleur) {
		this.valeur = pvaleur;
	}
}
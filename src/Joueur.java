
public class Joueur {

	private String nom;
	private Jeu jeu;

	// on instancie un nouveau jeu de 26 cartes

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Joueur
	// on lui passe des parametres
	public Joueur(String pnom) {

		// this. fait référence aux variables d'instances de notre classe déclarées
		// ci-dessus
		// pnom est le parametre du constructeur
		this.nom = pnom;
		this.jeu = new Jeu();
	}

	// ************* ACCESSEURS *************

	// retourne le nom de notre objet Joueur
	public String getNom() {
		return nom;
	}

	public Jeu getJeu() {
		return jeu;
	}

	// ************* MUTATEURS *************

	// définit le nom de la carte
	public void setNom(String pnom) {
		this.nom = pnom;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public void jouer(Joueur j1, Joueur j2) {

		int score1 = 0;
		int score2 = 0;
		for (int i = 0; i < j1.getJeu().getCartes().length; i++) {
			if (j1.getJeu().getCartes()[i].getValeur() < j2.getJeu().getCartes()[i].getValeur()) {
				score2 = score2 + 1;
				System.out.println(score1);
				System.out.println(score2);
			} else if (j1.getJeu().getCartes()[i].getValeur() > j2.getJeu().getCartes()[i].getValeur()) {
				score1 = score1 + 1;
				System.out.println(score1);
				System.out.println(score2);
			}
		}

	}
}
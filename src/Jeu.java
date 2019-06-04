import java.util.Random;

public class Jeu {

	// variable d'instance
	private Carte[] cartes;

	// Constructeur
	public Jeu() {

		// on instancie un nouveau jeu de 52 cartes
		this.cartes = new Carte[52];

	}

	// Constructeur
	public Jeu(Carte[] cartes) {

		// on instancie un nouveau jeu de 52 cartes
		this.cartes = cartes;

	}

	// Getters
	public Carte[] getCartes() {
		return cartes;
	}

	// Setters
	public void setCartes(Carte[] cartes) {
		this.cartes = cartes;
	}

	// m�thode Jeu
	public void initialisation() {

		// variable d'instance: d�finit les caract�ristiques de notre objet Jeu ou
		// Carte?
		// d�claration d'un tableau nomm� couleurs contenant des attributs (4) de type
		// String
		String[] couleurs = { "Coeur", "Pique", "Carreau", "Trefle" };

		// on initialise un pointeur k � 0
		int k = 0;
		// boucle principale qui est r�p�t�e 4 fois
		for (int i = 0; i < couleurs.length; i++) {

			// boucle secondaire qui est r�p�t�e 13 fois
			for (int j = 1; j <= 13; j++) {
				// le pointeur k augmente de 1 � chaque tour de boucle et cr��e une nouvelle
				// Carte de couleur i et de valeur j dans le tableau
				cartes[k++] = new Carte(couleurs[i], j);
			}

		}
	}

	// m�thode afficher qui ne renvoie rien (void)
	public void afficher() {
		// boucle qui va de 0 � 52 cartes
		for (int i = 0; i < cartes.length; i++) {
			// j'affiche les couleurs et valeurs de cartes dans le tableau aux index de 0 �
			// 52

			if (cartes[i] == null)
				break;

			System.out.println(cartes[i].getColor() + cartes[i].getValeur());
		}

	}

	/*
	 * m�thode m�langer qui ne renvoie rien mais utilise la methode permuter
	 * j'indiquerai le nombre de permutation que je veux faire en parametre quand
	 * j'appelerai la m�thode dans le main
	 */
	public void melanger(int nbpermutation) {
		for (int i = 0; i < nbpermutation; i++) {
			this.permuter();
		}
	}

	// m�thode permuter qui ne renvoie rien (void)
	public void permuter() {
		// je cr�� un nouveau chiffre al�atoire
		Random rand = new Random();
		// je d�clare une variable a de type int qui correspond
		// � un index al�atoire dans le tableau cartes
		int a = rand.nextInt(cartes.length);
		int b = rand.nextInt(cartes.length);

		// je d�clare un objet temp de type Carte qui correspond � la carte � l'index
		// a du tableau
		Carte temp = cartes[a];
		// je place ma carte � l'index b, dans l'index a
		cartes[a] = cartes[b];
		// je place ma carte temp, dans l'index b
		cartes[b] = temp;

	}

	// m�thode diviser de type Jeu
	public Jeu diviser() {
		// je cr��e un jeu1 (tableau) qui contient la moiti� du jeu de 52 cartes
		Carte[] jeu1 = new Carte[cartes.length / 2];
		// je cr��e un jeu2 (tableau) qui contient la moiti� du jeu de 52 cartes
		Carte[] jeu2 = new Carte[cartes.length / 2];

		// je place les 26 premieres cartes (index 0 � 25) dans le tableau jeu1
		for (int i = 0; i < cartes.length / 2; i++) {
			jeu1[i] = this.cartes[i];
		}
		// je d�clare une variable k instanci�e � 0 pour attribuer les index
		// 0 � 25 dans mon nouveau tableau jeu2
		int k = 0;
		// je place les 26 cartes suivantes (index 51 � 26) dans le tableau jeu2
		for (int i = cartes.length - 1; i >= cartes.length / 2; i--) {
			jeu2[k++] = this.cartes[i];
		}
		// ?
		this.cartes = jeu1;

		// ?
		Jeu newGame = new Jeu(jeu2);
		return newGame;

	}

	public void distribuer(Jeu jeu1, Jeu jeu2) {

		for (int i = 0; i < cartes.length / 2; i++) {
			jeu1.getCartes()[i] = this.cartes[i * 2];
			jeu2.getCartes()[i] = this.cartes[i * 2 + 1];
		}
	}

}

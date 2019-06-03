import java.util.Random;

public class Jeu {

	//variable d'instance ?
	private Carte[] cartes;

	// méthode Jeu
	public Jeu() {
		// on instancie un nouveau jeu de 52 cartes
		this.cartes = new Carte[52];

		// variable d'instance: définit les caractéristiques de notre objet Jeu ou Carte?
		// déclaration d'un tableau nommé couleurs contenant des attributs (4) de type String
		String[] couleurs = { "Coeur", "Pique", "Carreau", "Trefle" };

		// on initialise un pointeur k à 0
		int k = 0;
		// boucle principale qui est répétée 4 fois
		for (int i = 0; i < couleurs.length; i++) {

			// boucle secondaire qui est répétée 13 fois
			for (int j = 1; j <= 13; j++) { 
				// le pointeur k augmente de 1 à chaque tour de boucle et créée une nouvelle
				// Carte de couleur i et de valeur j dans le tableau 
				cartes[k++] = new Carte(couleurs[i], j);
			}

		}
	}

	// méthode afficher qui ne renvoie rien (void)
	public void afficher() {
		//boucle qui va de 0 à 52 cartes
		for (int i = 0; i < cartes.length; i++) {
			//j'affiche les couleurs et valeurs de cartes dans le tableau aux index de 0 à 52
			System.out.println(cartes[i].getColor() + cartes[i].getValeur());
		}

	}

	/* méthode mélanger qui ne renvoie rien mais utilise la methode permuter
	 j'indiquerai le nombre de permutation que je veux faire en parametre
	quand j'appelerai la méthode dans le main */
	public void melanger(int nbpermutation) {
		for (int i = 0; i < nbpermutation; i++) {
			this.permuter();
		}
	}

	// méthode permuter qui ne renvoie rien (void)
	public void permuter() {
		//je créé un nouveau chiffre aléatoire
		Random rand = new Random();
		//je déclare une variable a de type int qui correspond
		// à un index aléatoire dans le tableau cartes
		int a = rand.nextInt(cartes.length);
		int b = rand.nextInt(cartes.length);

		//je déclare un objet temp de type Carte qui correspond à la carte à l'index a du tableau
		Carte temp = cartes[a];
		// je place ma carte à l'index b, dans l'index a
		cartes[a] = cartes[b];
		// je place ma carte temp, dans l'index b
		cartes[b] = temp;

	}

	// méthode diviser de type Jeu
	public Jeu diviser() {
		//je créée un jeu1 (tableau) qui contient la moitié du jeu de 52 cartes
		Carte[] jeu1 = new Carte[cartes.length / 2];
		//je créée un jeu2 (tableau) qui contient la moitié du jeu de 52 cartes
		Carte[] jeu2 = new Carte[cartes.length / 2];

		//je place les 26 premieres cartes (index 0 à 25) dans le tableau jeu1
		for (int i = 0; i < cartes.length / 2; i++) {
			jeu1[i] = this.cartes[i];
		}
		//je déclare une variable k instanciée à 0 pour attribuer les index
		// 0 à 25 dans mon nouveau tableau jeu2
		int k = 0;
		//je place les 26 cartes suivantes (index 51 à 26) dans le tableau jeu2
		for (int i = cartes.length - 1; i >= cartes.length / 2; i--) {
			jeu2[k++] = this.cartes[i];
		}
		// ?
		this.cartes = jeu1;

		// ?
		Jeu newGame = new Jeu(jeu2);
		return newGame;

	}
	// ??
	public Jeu(Carte[] temp) {
		this.cartes = temp;
	}
}

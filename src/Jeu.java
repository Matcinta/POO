import java.util.Random;

public class Jeu {

	private Carte[] cartes;

	public Jeu() {
		this.cartes = new Carte[52];

		String[] couleurs = { "Coeur", "Pique", "Carreau", "Trefle" };

		int k = 0;
		for (int i = 0; i < couleurs.length; i++) {
			for (int j = 1; j <= 13; j++) {
				cartes[k++] = new Carte(couleurs[i], j);
			}

		}
	}

	public void afficher() {
		for (int i = 0; i < cartes.length; i++) {
			System.out.println(cartes[i].getColor() + cartes[i].getValeur());
		}

	}

	public void melanger(int nbpermutation) {
		for (int i = 0; i < nbpermutation; i++) {
			this.permuter();
		}
	}

	public void permuter() {
		Random rand = new Random();
		int a = rand.nextInt(cartes.length);
		int b = rand.nextInt(cartes.length);

		Carte temp = cartes[a];
		cartes[a] = cartes[b];
		cartes[b] = temp;

	}

	public Jeu diviser() {

		Carte[] jeu1 = new Carte[cartes.length / 2];
		Carte[] jeu2 = new Carte[cartes.length / 2];

		for (int i = 0; i < cartes.length / 2; i++) {
			jeu1[i] = this.cartes[i];
		}
		int k = 0;
		for (int i = cartes.length - 1; i >= cartes.length / 2; i--) {
			jeu2[k++] = this.cartes[i];
		}
		this.cartes = jeu1;

		Jeu newGame = new Jeu(jeu2);
		return newGame;

	}

	public Jeu(Carte[] temp) {
		this.cartes = temp;
	}
}

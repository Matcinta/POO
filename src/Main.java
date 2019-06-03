public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jeu bataille = new Jeu();

		System.out.println("mélange des cartes");
		bataille.melanger(100);
		bataille.afficher();

		Jeu bataille2 = bataille.diviser();

		System.out.println("distribution des cartes paquet 1:");
		bataille.afficher();
		System.out.println("distribution des cartes paquet 2:");
		bataille2.afficher();

	}

}

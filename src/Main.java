public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Type de l'objet: Jeu ; nom de l'objet: bataille; on instancie un objet de type Jeu avec new;
		Jeu bataille = new Jeu();

		// Affiche que les cartes sont mélangées
		System.out.println("mélange des cartes");

		// j'applique la méthode mélanger à mon objet Jeu bataille (je mélange 100 fois)
		bataille.melanger(100);
		//j'applique la méthode afficher à mon objet Jeu bataille
		bataille.afficher();

		// on instancie un objet bataille2 de type Jeu qui vaut ?;
		Jeu bataille2 = bataille.diviser();


		System.out.println("distribution des cartes paquet 1:");
		bataille.afficher();
		System.out.println("distribution des cartes paquet 2:");
		bataille2.afficher();

	}

}

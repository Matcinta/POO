import java.util.Random;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jeuduplusoumoins();
	}

	public static void jeuduplusoumoins() {
		Random rand = new Random();
		int a = rand.nextInt(100) + 1;

		Scanner scanner = new Scanner(System.in);

		int valeur = -1;
		int nombrecoups = 0;

		do {
			System.out.println("Veuillez saisir un nombre compris entre 1 et 100:");
			valeur = scanner.nextInt();
			nombrecoups++;

			if (valeur > a) {
				System.out.println("C'est moins!");
			} else if (valeur < a) {
				System.out.println("C'est plus!");
			} else {
				System.out.println("C'est gagné!");
			}
		} while (valeur != a);

		System.out.println("Vous avez gagné en" + nombrecoups + "coups");
	}

}

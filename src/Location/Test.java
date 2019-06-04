package Location;

public class Test {

	public static void main(String[] args) {

		Voiture v1 = new Voiture("Twingo", 2017, 10_000, "1234 AZ 49", 'B', true);

		Camion c1 = new Camion("J9", 2014, 20_000, "987 BCD 75", 'B', 25);

		Autocar a1 = new Autocar("FRI", 2005, 90_000, "4567 WX 01", 'D', 3, 53);

		// Voiture v1
		System.out.println(v1.toString());
		System.out.println("Age du véhicule: " + v1.age() + " ans");
		System.out.println("Les frais de location pour ce véhicule sont de:");
		System.out.println(v1.coutLocation() + " €/jour\n");

		// Camion c1
		System.out.println(c1);
		System.out.println("Age du véhicule: " + c1.age() + " ans");
		System.out.println(c1.peutTransporterVolume(7));
		System.out.println("Les frais de location pour ce véhicule sont de:");
		System.out.println(c1.coutLocation() + " €/jour\n");

		// Autocar a1
		System.out.println(a1);
		System.out.println("Age du véhicule: " + a1.age() + " ans");
		System.out.println("Les frais de location pour ce véhicule sont de:");
		System.out.println(a1.coutLocation() + " €/jour");

		int passager = 30;
		System.out.println("Cet autocar peut-il transporter " + passager + " passagers?\n");
		System.out.println(a1.peutTransporterPassagers(passager, 0.1f) + "\n");

	}

}

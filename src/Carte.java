
public class Carte {

	private String color;
	private int valeur;

	public Carte(String color, int valeur) {
		super();

		this.color = color;
		this.valeur = valeur;
	}

	public String getColor() {
		return color;
	}

	public int getValeur() {
		return valeur;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}
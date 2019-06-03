
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("maison"));
	}

	public static boolean isPalindrome(String mot) {

		mot = mot.toLowerCase();
		for (int i = 0; i < mot.length() / 2; i++) {
			if (mot.charAt(i) != mot.charAt(mot.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}

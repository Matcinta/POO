public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(6));
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}

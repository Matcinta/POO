
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPerfect(5));
	}

	public static boolean isPerfect(int number) {

		if (number < 1) {
			return false;
		}

		int sum = 1;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return (number == sum);
	}
}
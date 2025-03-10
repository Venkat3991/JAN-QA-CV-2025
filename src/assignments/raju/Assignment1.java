package assignments.raju;

public class Assignment1 {

	// write a reusable program to extract numbers from string and make the sum of
	// digits
	// String : "abc123$%^dfADg4%%567"
	// 0/p: 1234567 -> 1+2+3+4+5+6+7 = 28

	public static void summOfDigitsFromString(String str) {
		int sum = 0;
		for (char eachChar : str.replaceAll("[^0-9]", "").toCharArray()) {
			sum = sum + (int) (eachChar - '0');
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		summOfDigitsFromString("abc123$%^dfADg4%%567");
	}

}

package assignments.venkat;

public class Assignment1 {

	public static void main(String[] args) {
		int num = 5; 
       
        if (isPrime(num)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
		

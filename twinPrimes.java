package day01;

public class TwinPrimes {
	
	public static boolean isPrime(int num) {
		for (int i=2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static String getTwinPrimes(int start, int end) {
		String twinPrimes = "";
		if (start < 0 || end < 0 || start > 100 || end > 100 || start >= end) {
			return "Error";
		}
		
		for (int i = start; i <= end; i++) {
			if (i+2 <= end) {
				if (isPrime(i) && isPrime(i+2)) {
					twinPrimes += i + ", " + (i+2) + "; ";
				}
			}
		}
		
		if (twinPrimes.length() == 0) {
			twinPrimes = "No Twin primes found.";
		}
		return twinPrimes;
	}
	public static void main(String[] args) {
		System.out.print(getTwinPrimes(3,30));

	}

}

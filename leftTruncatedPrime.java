package day01;

public class leftTruncatedPrime {

	public static boolean isPrime(int num) {
		for (int i =2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int getCount(int num) {
		int ctr = 0;
		while(num > 0) {
			ctr += 1;
			num /= 10;
		}
		return ctr;
	}
	
	public static boolean isLeftTruncatedPrime(int num) {
		while(num > 0) {
			int count = getCount(num);
			if (!isPrime(num) || num/(int)Math.pow(10, count-1) == 0) {
				return false;
			}
			num = num % (int)Math.pow(10, count-1);
		}
		return true;
	}
	
	public static int getCountOfLeftTruncatedPrimes(int start, int end) {
		int count = 0;
		if (start > end) {
			return -1;
		}
		else if(start < 0 || end < 0) {
			return -2;
		}
		else if(start == 0 || end == 0) {
			return -3;
		}
		else {
			for (int i = start; i <= end; i++) {
				if (isLeftTruncatedPrime(i)) {
					count += 1;
				}
			}
			return count;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Total number of Left Truncated Prime numbers between 1 to 1000 are : " + getCountOfLeftTruncatedPrimes(1,1000));
		
		
	}

}

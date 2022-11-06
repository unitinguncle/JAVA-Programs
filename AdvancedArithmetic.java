package day06;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
	
	public int divisorSum(int n) {
		int sum = 0;
		for (int i=1; i<=n; i++) {
			if (n%i==0)
				sum+=i;
		}
		return sum;
	}
	
}

public class Guided2 {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		System.out.println("Sum of divisors = "+calc.divisorSum(6));
	}

}

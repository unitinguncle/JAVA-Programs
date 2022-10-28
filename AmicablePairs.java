package day01;

public class AmicablePairs {

	public static int getSumOfProperDivisors(int num) {
		int sum = 0;
		for (int i=1; i<=num/2; i++) {
			if (num%i == 0)
				sum += i;
		}
		return sum;
	}
	
	public static int sumOfAmicablePairs(int start, int end) {
		int result = 0, sum = 0;
		for (int i=start; i<=end; i++) {
			sum = getSumOfProperDivisors(i);
			
			if (i == getSumOfProperDivisors(sum) && i != sum){
				result += i;
		}}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.print(sumOfAmicablePairs(1,1000000));
	}

}

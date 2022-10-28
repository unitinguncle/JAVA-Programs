package day01;

public class QuadraticSequence {

	public static String getQuadraticSequence(int num) {
		if (num <= 0) {
			return null;
		}
		int sum = 1;
		String result = sum + "";
		
		for (int i=2; i <= num; i++) {
			sum += i;
			result += ", " + sum;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getQuadraticSequence(10));
		
	}

}

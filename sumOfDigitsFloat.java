package day03;

public class sumOfDigitsFloat {
	
	public static int digitSum(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}

	public static String concateSumOfDigits(double num) {
		String numb = "" + num;
		int p1=0, p2=0;
		String[] numberSplit = numb.split("[.]");
		p1 = Integer.parseInt(numberSplit[0]);
		p2 = Integer.parseInt(numberSplit[1]);
		
		return (digitSum(p1) + ":" + digitSum(p2));
		
	}
	public static void main(String[] args) {
		System.out.println(concateSumOfDigits(120.520));
	}

}

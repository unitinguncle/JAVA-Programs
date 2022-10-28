package day01;

public class AdamNumber {

	public static int square(int num) {
		return (num*num);
	}
	
	public static int reverse(int num) {
		int revNum = 0;
		int remainder = 0;
		
		while(num>0){
			remainder = num % 10;
			revNum = (revNum * 10) + remainder;
			num /= 10;
		}
		return revNum;
	}
	
	public static boolean isAdamNumber(int num) {
		int numSquare = square(num);
		int revNum = reverse(num);
		int revNumSquare = square(revNum);
		
		if(numSquare == reverse(revNumSquare)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.print(isAdamNumber(12));
	}

}

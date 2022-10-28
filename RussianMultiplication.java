package day01;

public class RussianMultiplication {

	public static int getProduct(int num1, int num2) {
		if (num1 < 0 || num2 < 0){
			return -1;
		}
		int product = 0;
		while (num1 >= 1)  {
			if (num1 % 2 != 0){
				product += num2;
			}
			num1 = (int)num1 / 2;
			System.out.println(num2);
			num2 *= 2;
		}
		return product;
	}
	
	public static void main(String[] args) {
		System.out.print("The Russian product of 11 and 12 is : "+ getProduct(11,12));
		
	}

}

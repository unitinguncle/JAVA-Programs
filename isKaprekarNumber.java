package day02;

public class test {

	public static String isKaprekarNumber(int num) {
		if (num < 0)
			return "-1";
		else if (num==0) 
			return "-2";
		
		String square = (num * num) + "";
		int half = square.length() / 2;
		int firstHalf = Integer.parseInt(square.substring(0,half));
		int secondHalf = Integer.parseInt(square.substring(half));
		
		if (num == (firstHalf + secondHalf)) 
			return "True";
		
		return "False";
		
	}
	public static void main(String[] args) {
		System.out.println(isKaprekarNumber(45));
	}

}

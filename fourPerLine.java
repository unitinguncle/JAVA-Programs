package day01;

public class fourPerLine {

	public static String getFourPerLine(int num) {
		String result = "";
		if (num < 0) 
			return "-1";
		else if (num ==0)
			return "-2";
		else if (num > 99)
			return "-3";
		for (int i=1; i<=num; i++) {
			result += " " + i;
			if (i % 4 == 0) {
				result 	+= "\n";
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.print(getFourPerLine(20));
	}

}

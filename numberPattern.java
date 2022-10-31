package day02;

public class numberPattern {

	public static String NumberPattern4(int rows){
		String pattern = "";
		
		if(rows < 0)
			return "-1";
		else if(rows == 0)
			return "-2";
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				pattern += (i*j) + " ";
			}
			pattern += "\n";
		}
		return pattern;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(NumberPattern4(5));
	}

}

package day03;

public class rotateString {

	public static String rotate(String str, int pos) {
		String result = "";
		if (str.length() == 0)
			return null;
		if (pos <= 0 || pos > str.length())
			return str;
		int len = str.length();
		result += str.substring(len - pos) + str.substring(0, len - pos);
		
		return result;
		
	}
	public static void main(String[] args) {
		System.out.println(rotate("talent", 3));
	}

}

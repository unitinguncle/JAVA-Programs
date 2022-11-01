package day03;

public class positiveString {

	public static boolean isValidString(String word){
		if (word.length() <= 0)
			return false;
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++){
			char letter = word.charAt(i);
			if (!Character.isAlphabetic(letter))
				return false;
		}
		return true;
	}
	
	public static boolean isPositiveString(String word) { 
		if (!isValidString(word))
			return false;
		word = word.toLowerCase();
		int asc = (int)word.charAt(0);
		System.out.println(asc);
		for (int i=1; i < word.length(); i++){
			System.out.println((int)word.charAt(i));
			if((int)word.charAt(i) < asc)
				return false;
			asc = (int)word.charAt(i);
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPositiveString("abcdEfghij"));
	}

}

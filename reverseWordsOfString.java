package day03;

public class reverseString {

	public static String reverseWord(String word) { 
		String result = "";
		for (int i = word.length()-1; i >= 0 ; i--) {
			result += word.charAt(i);
		}
		return result;
	}
	
	public static String reverse(String sent) {
		if (sent == null || sent.length() <= 0)
			return null;
		String wordArr[] = sent.split(" ");
		String result = "";
		for (int i=0; i < wordArr.length; i++)
			result += reverseWord(wordArr[i]) + " ";
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("talent sprint"));
	}

}

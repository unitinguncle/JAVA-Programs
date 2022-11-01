package day03;
import java.util.regex.Pattern;


public class wordContainsPattern {
	
	public static boolean isPatternMatching(String word, String check){
		int ind = word.indexOf(check);
		if(ind >= 0)
			return true;
		return false;
	}

	public static String[] getWordsContainPattern(String arr[], String check) {
		int len = arr.length, j = 0;
		String resultArray[] = new String[len];
		for (int i= 0; i<len; i++) {
			if (isPatternMatching(arr[i].toLowerCase(), check.toLowerCase()))
				resultArray[j++] = arr[i].toUpperCase();
		}
		return resultArray;
	}
	public static void main(String[] args) {
		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies",
				"England", "India", "Australia", "Pakistan", "Bangladesh"};
		String pattern = "an";
		String result[] = getWordsContainPattern(words, pattern);
		for (int i = 0; i < result.length; i++) 
			if (result[i] != null)
				System.out.println(result[i]);
	}
}

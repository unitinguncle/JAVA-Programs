package day03;

public class validTime {

	public static boolean isValidTime(String str) {
		if (str.length() == 8 && str.charAt(2) == ':' && str.charAt(5) == ':') {
			int hr = Integer.parseInt("" + str.charAt(0)+str.charAt(1));
			int min = Integer.parseInt("" + str.charAt(3)+str.charAt(4));
			int sec = Integer.parseInt("" + str.charAt(6)+str.charAt(7));
			if (hr >=0 && hr <=24 && min >= 0 && min <= 60 && sec >= 0 && sec <= 60)
				return true;		
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isValidTime("23:59:61"));
	}

}

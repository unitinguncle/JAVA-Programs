package day02;

public class boxPattern {

	public static String createBoxPattern(int v1, int v2) {
		if(v1 < 0 || v2 < 0)
			return "-1";
		if(v1 == 0 || v2 == 0)
			return "-2";
		String result = "";
		for (int i=1; i <= v2; i++)
			result += "*";
		result += "\n";
		for (int i= 1; i <= v1-2; i++){
			result += "*";
			for (int j=1; j<=v2-2; j++)
				result += " ";
			result += "*\n";
		}
		for (int i=1; i <= v2; i++)
			result += "*";
		return result;
	}

	public static void main(String[] args) {
		System.out.println(createBoxPattern(4,5));
	}

}

package day02;

public class oddPalindrome {
	
	public static int getReverse(int num) {
		 int rev = 0;
		 while(num > 0) {
			 int rem = num % 10;
			 rev = rev*10 + rem;
			 num /= 10;
		 }
		 return rev;
	}
	
	public static String getOddPalindromeList(int startNum, int endNum) {
		String str = "";
		
		if (startNum <= 0 || endNum <= 0 || startNum < 100 || endNum > 999 || startNum >= endNum)
			return "Error";
		for (int i = startNum; i <= endNum; i++) {
			if (i==getReverse(i) && i % 2 !=0)
				str += i + ", ";
		}
		
		return str.substring(0, str.length() - 2);
}
	public static void main(String[] args) {
		System.out.print(getOddPalindromeList(100,200));
	}

}

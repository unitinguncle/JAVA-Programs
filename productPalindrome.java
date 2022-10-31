package day02;

public class productPalindrome {
	public static boolean isPalindrome(int num) {
		int num2 = num;
		int rev = 0;
		while(num > 0) {
			rev = (rev*10) + (num%10);
			num /= 10;
		}
		
		return (num2 == rev);
	}
	public static int getCount(int startNum, int endNum) {
		if (endNum > 1000)
			return -1;
		else if (startNum > endNum)
			return 0;
		else if (startNum < 0 || endNum < 0)
			return -2;
		
		int count = 0;
		for (int i=startNum; i<=endNum; i++){
			for (int j=startNum; j<=endNum; j++){
				if(isPalindrome(i*j))
					count++;
			}
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println(getCount(10,100));
		
	}

}

package day02;

public class occurenceCounter {

	public static int getCount(int[] inputArray, int num) {
		int count = 0;
		if (inputArray == null || inputArray.length == 0) {
			return -1;
		}
		for (int i=0; i < inputArray.length; i++) {
			if (inputArray[i] == num) {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		int[] intArray = new int[] {1,2,3,4,5,6,3,3,4,5,3,2,1,2,3,4,4,4};
		System.out.println(getCount(intArray, 4));
		
	}

}

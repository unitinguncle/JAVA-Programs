package day02;

public class sumOfModifiedElement {

	public static int getSumOfModifiedElements(int arr[]) {
		int sum = 0;
		if (arr.length == 0)
			return -1;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < 0)
				return -2;
			if (arr[i] == 0)
				return -3;
			if(arr[i]%2==0)
				sum += arr[i]*2;
			else
				sum += (int)(arr[i]/2);
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {10,15,20,25,30,35,40,45,50};
		System.out.println(getSumOfModifiedElements(arr));
	}

}

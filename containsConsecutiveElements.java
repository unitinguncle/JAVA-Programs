package day02;

public class consecutiveElements {

	public static int validateInputs(int[] arr, int target) {
		if (arr.length == 0)
			return -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0)
				return -2;
		}
		if (target <= 0)
			return -3;
		return 1;
	}

	public static boolean containsConsecutiveElements(int[] arr, int target) {
		if(validateInputs(arr, target) == 1){
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				if (sum < target)
					sum += arr[j];
				else if (sum == target)
					return true;
				else if (sum > target)
					break;
			}
		}}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,-3,5,7,9};
		int target = 8;
		System.out.println(validateInputs(arr,target));
		System.out.println(containsConsecutiveElements(arr,target));

	}

}

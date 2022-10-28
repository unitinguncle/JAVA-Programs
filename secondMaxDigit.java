package day01;

public class secondMaxDigit {

	public static int findSecondMaxDigit(int num) {
		int rem = 0, lar = 0, slar = 0;
		while(num>0) {
			rem = num%10;
			if(rem > slar){
				if(rem > lar){
					slar = lar;
					lar = rem;
				}
				else if(rem!=lar){
					slar = rem;
				}
			}
			num /= 10;
		}
		return slar;
	}
	
	public static void main(String[] args) {
		System.out.print(findSecondMaxDigit(288999534));
	}

}

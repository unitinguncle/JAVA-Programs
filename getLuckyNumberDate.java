package day03;

public class luckyNumber {

	public static int converMMMtoMM(String month){
		String monthArr[] = {"january", "february", "march", "april", "may", "june",
				"july", "august", "september", "october", "november", "december"};
		for (int i= 0; i < monthArr.length; i++){
			if (monthArr[i].indexOf(month.toLowerCase()) >= 0)
				return i+1;
		}
		return -1;
	}
	
	public static int getSumOfDigits(int num){
		int sum = 0;
		while(num>0){
			sum += num%10;
			num /=10;
		}
		if (sum > 9)
			return getSumOfDigits(sum);
		else 
			return sum;
	}
	
	public static int getLuckyNumber(String date) {
		
		String dateSplit[] = date.split("-");
		int day = Integer.parseInt(dateSplit[0].trim());
		int month = converMMMtoMM(dateSplit[1]);
		int year = Integer.parseInt(dateSplit[2].trim());
		String convDate = "" + day + month + year;
		System.out.println(year);
		int result = getSumOfDigits(Integer.parseInt(convDate));
		if (day <= 0 || day > 31 || month == -1 || year <1000 || year > 9999)
			return -1;
		else 
			return result;
	}
	public static void main(String[] args) {
		String date = "15-NOV-2016";
		int result = getLuckyNumber(date);
		if (result == -1)
			System.out.println("Invalid Input");
		else
			System.out.println(result);
	}

}

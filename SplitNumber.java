package mc.sn.day2;

public class SplitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int number =123456;//653148,987456,528963,547512
		int sum = 0;
		for(int i=0;i<6;i++) {
			int splitnumber = number % 10;
			//System.out.println(splitnumber);
			number = number / 10;
			//System.out.println(number);
			sum = sum + splitnumber;
			System.out.println(sum);
		}
		System.out.println();
		System.out.println(sum);
	}

}

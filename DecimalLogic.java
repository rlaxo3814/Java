package mc.sn.day4;

public class DecimalLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeCode pc = new PracticeCode();
		
		int sum = 0; 
		for(int i=0;i<9;i++) {
			 int number = i + 2;
			 //System.out.println(number);
			 boolean flag = pc.isPrimeNumber(number);
			 if(flag) {
				 sum = sum + number;
				 System.out.println(number+"소수다");
			 }else {
				 System.out.println(number+"소수가 아니다");
			 }
			 
		 }
		System.out.println("sum is "+sum);
		 
		
	}

}

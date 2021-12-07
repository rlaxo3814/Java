package mc.sn.day5;
import java.util.Random;
public class RandomSelect {
	

	public void testString1() {
		String str1 = new String("Hello");
		String str3 = new String("Hello");
		System.out.println(str1);
		String str2 = "Hello";
		System.out.println(str2);
		int a = 3;
		int b = 3;
		if(str3==str2) {
			System.out.println("a==b");
		}else {
			System.out.println("a!=b");
		}
		
		if(str1.equals(str2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}
	public void testClass1() {
		System.out.println("testClass1");
		//무작위수를 구할때 사용하는 클래스는 Random클래스 입니다.
		Random r = new Random();
		int rnd = r.nextInt(45); //0<=rnd<45
		System.out.println(rnd);
		
	}
	public void getNumbersV2() {
		//1~45까지의 무작위수 6개를 구하여 출력하는 코드를 작성하시오
		int[] numbers = new int[6];
		boolean flag = false;
		int count = 0;
		while(!flag) {
			Random r = new Random();
			int rnd = r.nextInt(45)+1; //1<=rnd<46
			//중복이 아닐때 아래 문장 실행
			//배열 검사해서 같은 숫자가 없으면 
			boolean checkNumber = false;
			for(int i=0;i<count;i++) {
				if(numbers[i]==rnd) {
					checkNumber = true;
					System.out.println("중복: "+rnd);
					break;
				}
			}
			if(!checkNumber) {
				numbers[count] = rnd;
				count = count + 1;
			} 
			
			System.out.println(rnd);
			//6개를 모두 생성했다면
			if(count==6) {
				flag = true;
			}
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}


​		
	}
	
	public void getNumbers() {
		//1~45까지의 무작위수 6개를 구하여 출력하는 코드를 작성하시오
		int[] numbers = new int[6];
		for(int i=0;i<6;i++) {
			Random r = new Random();
			int rnd = r.nextInt(45)+1; //1<=rnd<46
			numbers[i] = rnd;
			System.out.println(rnd);
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}


​		
	}
}


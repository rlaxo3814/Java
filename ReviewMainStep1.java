package mc.sn.step1;

public class ReviewMainStep1 {

	public static void main(String[] args) {
		// 1 ~ 10까지 반복문을 이용하여 콘솔에 출력하는 코드를 작성하시오
		for(int i=0;i<10;i++) {
			// 콘솔 출력하는 코드 작성
			int value = i + 1;
			System.out.println(value);
		}
		
		//printNumber를 호출하는 코드를 작성하시오
		//1. 현재 클래스의 인스턴스를 생성한다.
		ReviewMainStep1 rm =  new ReviewMainStep1();
		//2. 생성인스턴스의 변수를 이용하여 printNumber메소드를 호출한다.
		rm.printNumber();
	}
	
	


	// 1 ~ 10까지 콘솔에 출력하는 메소드를 정의하시오
	public void printNumber() {
		// 데이터 타입이 int이고 식별자가 number인 변수에 기본값을 할당한다
		int number = 0;
		// 10번 반복하는 for문을 정의하시오
		for(int i=0;i<10;i++)
		{
			//for의 정의를 이용하여 1~10까지의 수를 가지는 number라는 변수를 구성하시오
			number = i + 1;
			// number변수를 출력하시오
			System.out.println(number); 
		}
		
	}

}

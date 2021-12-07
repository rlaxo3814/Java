package mc.sn.day5;

public class RandomNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain tm = new TestMain();
		tm.test1();
	}
	
	public void test1() {
		System.out.println("test1");
		// PracticeClass의 testClass1메소드를 호출하는 코드 작성하시오
		PracticeClass pc = new PracticeClass();
		//pc.testClass1();
		//pc.getNumbersV2();
		//pc.testString1();
		pc.getNumbers();
	}

}

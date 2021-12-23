package mc.sn.jdbc.day13;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMain om = new ObjectMain();
		om.test1();//출력값은 null
	}
	
	public void test1() {
		Car car = new Car();
		System.out.println(car.getBrand());
	}

	public void test2() {
		Student student = new Student();//컴파일이 안된다
	}
	
}

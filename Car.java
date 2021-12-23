package mc.sn.jdbc.day13;

public class Car {
	private String brand;
	public Car() {//기본생성자 가 있어야 실행 클래스에서 Car 인스턴스가 실행된다 
		//생성자 생성해서 자동으로 초기화된다 그래서 실행클래스 에서 실행하면 null이 출력된다
		
	}
	public Car(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}

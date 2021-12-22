package mc.sn.jdbc.day13;

public class Student extends Person {
	//Person을 상속받기때문에 Person 기본 생성자를 생성 해줘야 된다
	private int studentNo;
	public Student() {
		// 무인자 생성자는 아래에서 자동으로 생성된다(단 상위에 생성자가 있을 경우 자동으로 생성이 되지 않는다)
		
	}
	public Student(int studentNo) {
		this.studentNo = studentNo;
	}
	
}

package mc.sn.jdbc.day15;

public class StdData {//데이터 객체 만드는 법, 클래스는 object클래스를 상속받는다
	//name, addr 필드로 하는 데이터 클래스를 만드시오
	private String name;
	private String addr;
	
	public StdData(String name, String addr) {//만들때 생성자를 통해 값을 세팅하겠다
		this.name = name;
		this.addr = addr;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override//아래에 있는 메소드를 오버라이드에 들어가있는 규칙을 검사해라(5가지 규칙)
	//상위클래스 내용을 받아오면서 내용만 바꿔주는거임, 중복정의(1.이름(메소드),2.파라메터리스트(체크하는것 갯수,타입,순서)
	public String toString() {//객체의 중요한 정보를 밖으로 알려주는 역할
		// TODO Auto-generated method stub
		return name+","+addr;
	}
}

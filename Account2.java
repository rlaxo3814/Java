package mc.sn.day7review;

//은닉성을 적용하여 데이터 클래스를 구성하시오
public class Account2 {
	//밑에 3문장 필드라고 부른다(멤버변수) 객체지향의 3가지:상속,다형성,은닉성
	private int balance;//잔고(정수),변수 선언
	private String owner;//계좌주(문자열),문자열은 String을 쓴다, 변수 선언
	private String ano;//계좌번호(문자열), 변수 선언
	public Account() {//public 이 기본생성자 생성자 이름은 클래스에서 가져온다
	//기본생성자	
	}
	public Account(int balance, String owner, String ano) {//필드를 한꺼번에 처리하는 생성자를 만드세요
		this.balance = balance;
		this.owner = owner;
		this.ano = ano;
	}
	
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {//파라메터(int balance)
		this.balance = balance;
	}
	public String getAno() {
		return this.ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override//toStr쓰고 컨트롤+스페이스 누르면 오버라이딩 자바 클래스 클릭 하면됨
	public String toString() {
		// TODO Auto-generated method stub
		return this.ano+" "+this.owner+" "+this.balance;
	}


​	
}
​	

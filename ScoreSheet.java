package mc.sn.day8;
//은닉성 적용하여 데이터 객체를 작성하시오
public class ScoreSheet {
	//성적과 이름을 표현하는 변수 작성
	private String name;
	private int kor;	
	private int eng;
	private int math;
	private int total;
	
	
	
	public ScoreSheet(String name, String kor, String eng, String math) {//()파라메터 리스트
		this.name = name;
		this.kor = Integer.parseInt(kor);
		this.eng = Integer.parseInt(eng);
		this.math = Integer.parseInt(math);
		this.cacluTotal();
	}
	
	public int getTotal() {
		return total;
	}
	private void cacluTotal() {
		this.total = this.kor + this.eng + this.math;
	}
	
	public String getName() {//getset불러오는 방법 우클릭+소스 getset클릭 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		this.cacluTotal();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		this.cacluTotal();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		this.cacluTotal();
	}
	
	
	
	
	
}

package mc.sn.gisa;

public class GisaScoreData {
	// 문제를 풀기 위한 데이터 클래스
	private int sno;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private String accCode;// 문자열 이라서 String 코드를 사용
	private String localCode;// 문자열 이라서 String 코드를 사용

	public GisaScoreData() {// 생성자,값이 들어가 있으면 안되서 초기화

	}

	public GisaScoreData(int sno, int kor, int eng, int math, int total, String accCode, String localCode) {
		// 파라메터의 역할에 대해 알아두자
																									
		this.sno = sno;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.accCode = accCode;
		this.localCode = localCode;
	}

	public int calcuNo2() {//정보처리기사 2번문제에 대한 과정
		return kor + eng;
	}
	public int calcuNo3() {
		return eng + math;
	}
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getAccCode() {
		return accCode;
	}

	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

}

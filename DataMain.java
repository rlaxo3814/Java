package mc.sn.day8;

public class DataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test()호출하는 코드 작성
		DataMain dm = new DataMain();
		dm.test2();
	}

	// csv파일은 콤마로 구분된 데이터를 가지고 있는 파일이라는 뜻(중요한 개념임)
	public void test() {
		System.out.println("문자열 데이터 처리");
		String data = "kim,54,84,62";// 부분 문자열을 토큰(token)이라 부른다
		String[] temp = data.split(",");// temp는 배열 , split가 콤마로 문자열 나눠구분해준다
		for (int i = 0; i < temp.length; i++) {// temp 배열을 작성하시오
			System.out.println(temp[i]);
		}
		// kim이라는 학생이 받은 총점을 출력해 보세요
		int total = 0;
		try {// 에러가 발생할지 몰라 try를 씀{}
			total = Integer.parseInt(temp[1].trim()) + Integer.parseInt(temp[2].trim())
					+ Integer.parseInt(temp[3].trim());// trim은 앞과 뒤의 빈칸을 제거한다
		} catch (Exception e) {// 그때 에러가 발생하면 이렇게 처리할게 Catch
			// NumberFormatException은 Exception클래스 안에 들어가 있다
			// 어떤에러가 발생하는지 API에 다 나와있다 API에서 공부해야된다
			System.out.println("예외발생");// 에러 발생한 출력값 이렇게 출력 할게
		}

		System.out.println(total);
	}

	public void test2() {
		String data1 = "kim,54,84,62"; // token/토큰
		String data2 = "lee,39,98,61";// token/토큰
		String data3 = "park,84,51,90";// token/토큰
		String data4 = "choi,61,78,52";// token/토큰
		String data5 = "koo,94,48,91";// token/토큰
		String[] scores = { data1, data2, data3, data4, data5 };
		ScoreSheet[] sheets = new ScoreSheet[5];
		for (int i = 0; i < scores.length; i++) {
			String[] temp = scores[i].split(",");
			sheets[i] = new ScoreSheet(temp[0], temp[1], temp[2], temp[3]);
		}
		for (int i = 0; i < sheets.length; i++) {
			System.out.println(sheets[i].getName());
			System.out.println(sheets[i].getTotal());
			// System.out.println(sheets[i].getKor()+sheets[i].getEng()+sheets[i].getMath());
		}
	}
}

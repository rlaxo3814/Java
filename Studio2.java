package mc.sn.lotto.v2;

import java.util.ArrayList;

public class Studio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//onAir 메소드 호출하는 코드 작성
		Studio2 studio = new Studio2();
		studio.onAir();
	}

	public void onAir() {
		System.out.println("지금부터 로또 추첨을 시작합니다.");
		ArrayList<LottoBall2> balls = this.makeBalls();
		LottoMachine2 machine = new LottoMachine2(balls);
		machine.getBalls(6);
		System.out.println("감사합니다.");
	}
	
	private ArrayList<LottoBall2> makeBalls() {
		ArrayList<LottoBall2> balls = null;
		balls = new ArrayList<LottoBall2>();
		for(int i=0;i<45;i++) {
			balls.add(new LottoBall2(i+1));
		}
		
		return balls;
	}
}

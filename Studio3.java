package mc.sn.lottov3;

import java.util.ArrayList;

public class Studio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//onAir 메소드 호출하는 코드 작성
		Studio3 studio = new Studio3();
		studio.onAir();
	}

	public void onAir() {
		System.out.println("지금부터 로또 추첨을 시작합니다.");
		ArrayList<LottoBall3> balls = this.makeBalls();
		LottoMachine3 machine = new LottoMachine3(balls);
		machine.getBalls(6);
		System.out.println("감사합니다.");
	}
	
	private ArrayList<LottoBall3> makeBalls() {
		ArrayList<LottoBall3> balls = null;
		balls = new ArrayList<LottoBall3>();
		for(int i=0;i<45;i++) {
			balls.add(new LottoBall3(i+1));
		}
		
		return balls;
	}
}

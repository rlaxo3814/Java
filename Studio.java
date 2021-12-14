package mc.sn.lotto;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//onAir 메소드 호출하는 코드 작성
		Studio studio = new Studio();
		studio.onAir();
	}

	public void onAir() {
		System.out.println("지금부터 로또 추첨을 시작합니다.");
		LottoBall[] balls = this.makeBalls();
		LottoMachine machine = new LottoMachine(balls);
		machine.getBalls(6);
		System.out.println("감사합니다.");
	}
	
	private LottoBall[] makeBalls() {
		LottoBall[] balls = null;
		balls = new LottoBall[45];
		for(int i=0;i<45;i++) {
			balls[i] = new LottoBall(i+1);
		}
		
		return balls;
	}
}

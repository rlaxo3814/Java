package mc.sn.lotto.v2;

import java.util.ArrayList;
import java.util.Random;

public class LottoMachine2 {
	private ArrayList<LottoBall2> balls;//ArrayList<> 중복을 배제하기 위해서 쓴다
	public LottoMachine2(ArrayList<LottoBall2>balls) {
		this.balls = balls;//생성자
	}
	
	public void getBalls(int max) {
		//중복제거 할 필요없음
		boolean flag = false;
		int count = 0;
		LottoBall2 ball = null;
		while(!flag) {
			ball =  this.getBall();
			System.out.println("이번 추점공은 "+ball+"번 입니다.");
			count++;
			if(count==max) {
				flag = true;
			}
			try {
				Thread.sleep(1000);//1초마다 값이 나오게 하는 문법
			} catch (InterruptedException e) {//검사하는 문법이  try랑 catch
				// TODO Auto-generated catch block  // Catch(Exception e) 이건 그냥 공식
				e.printStackTrace();
			}
		}
	}
	
	private LottoBall2 getBall() {
		LottoBall2 ball = null;
		Random r = new Random();
		int rnd = r.nextInt(balls.size()); //정수의 변수 선언
		ball = balls.remove(rnd); // remove는 뽑히면서 공이 삭제된다
		return ball; // ball 나온것을 출력
	}
}

package mc.sn.lottov3;

import java.util.ArrayList;
import java.util.Random;


public class LottoMachine3 {
	private ArrayList<LottoBall3>balls;
	public LottoMachine3(ArrayList<LottoBall3>balls) {
		this.balls = balls;//생성자
	}
	
	public void getBalls(int max) {
		boolean flag = false;
		int count = 0;
		LottoBall3 ball = null;
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
	
	private LottoBall3 getBall() {
		LottoBall3 ball = null;
		Random r = new Random();
		int rnd = r.nextInt(balls.size()); //정수의 변수 선언
		ball = balls.remove(rnd); // 정수의 변수 랜덤의 공들이 볼과 같다
		return ball; // ball 나온것을 출력
	}
}

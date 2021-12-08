package mc.sn.day6;

import java.util.Scanner;

public class ReviewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyCalendar mc = new MyCalendar();
		//mc.viewMonth(5);
		
		ReviewMain rm = new ReviewMain();
				rm.test();
	}
	
	public void test2() {
		MyCalendar mc = new MyCalendar();
		mc.testCalendar();
	}
	
	public void test() {
		boolean flag = false;
		Scanner scan = new Scanner(System.in);//입력을 처리할때 쓰이는 것 Scanner
		while(!flag) {
		System.out.print("\n\nPlease write Month >>>");
		
		String line = scan.nextLine();//nextLine 문자열 전체 입력하는것
		System.out.println(line);
		if(line.equals("q")) {
			flag = true;
		}else {
			int month = Integer.parseInt(line);//문자열을 정수형으로 바꿔주는 역할
			MyCalendar mc = new MyCalendar();
			mc.viewMonth(month);
			}
		
		}
		scan.close();//외부자원을 쓰고 나서는 반드시 close를 써서 닫아줘야한다.
	}

}

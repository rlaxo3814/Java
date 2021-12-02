```java
package mc.sn.day3;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
		//int result = pm.add(5,6);
		//System.out.println(result);
		pm.viewMonth(9);
	}	

	public void viewMonth(int month) {//파라메터(int month)
		// 아래 기본 달력 코드에서 중복과 고정을 제거하는 코드를 작성하세요
		int year = 2021;
		int space = 0;
		int lastDay = 0;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			lastDay = 31;
		} else if(month==2) {
			lastDay = 28;
			//윤년 체크로직
			if(year%400==0 || year%4==0&&year%100!=0){
				lastDay = 29;
			}
		} else {
			lastDay = 30;
		}
		//해당 월의 1일 어디서 요일 시작하는 구하는 변수
		if(month==2||month==3||month==11) {
			space = 1; //월요일
		} else if(month==6) {
			space = 2; //화요일
		} else if(month==9||month==12) {
			space = 3;
		} else if(month==4||month==7) {
			space = 4;
		} else if(month==5) {
			space = 6;
        } else if(month==8) {
        	space = 0; //생략가능, 기본값으로 초기화되어 있음
        }
					
		System.out.println("2021년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			int day = i+1;
			System.out.print(day+"\t");
			if((day+space)%7==0) {//day==7||day==14||day==21||day==28
				System.out.println();
			}
		}
	}
	
	public int add(int num1, int num2) {//파라메터 리스트
		int a = num1;
		int b = num2;
		//System.out.println(a+b);
		return a+b;
	}
	
}

```


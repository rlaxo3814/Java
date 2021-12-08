package mc.sn.day6;

import java.util.Calendar;
import java.util.Date;

public class MyCalendar {
	public void testCalendar() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		Date date = new Date();
		year = date.getYear()+1900;
		System.out.println("year "+year);
		
	}
	public void viewMonth(int month) {
		
		Calendar cal =null;
		cal = Calendar.getInstance();
		cal.set(2021, month-1,1);
		
		int year = 2021;
		//int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		//int[] spaces = {5,1,1,4,2,6,4,0,3,5,1,3};
		
		int space = cal.get(Calendar.DAY_OF_WEEK)-1;//요일,수요일이 4여서 1을뺀다
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//일자
		
		System.out.println(year+"년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			int day = i+1;
			System.out.print(day+"\t");
			if((day+space)%7==0) { //day==7||day==14||day==21||day==28
				System.out.println();
			} 
		}
		
	}


public void viewMonthOld(int month) {
	System.out.println("print month");
	int year = 2021;
	int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	int[] spaces = {5,1,1,4,2,6,4,0,3,5,1,3};
	
	int space = spaces[month-1];
	int lastDay = lastDays[month-1];
	
	System.out.println(year+"년 "+month+"월");
	System.out.println("일\t월\t화\t수\t목\t금\t토");
	for(int i=0;i<space;i++) {
		System.out.print("\t");
	}
	for(int i=0;i<lastDay;i++) {
		int day = i+1;
		System.out.print(day+"\t");
		if((day+space)%7==0) { //day==7||day==14||day==21||day==28
			System.out.println();
		} 
	}
}	
}
		
	
	


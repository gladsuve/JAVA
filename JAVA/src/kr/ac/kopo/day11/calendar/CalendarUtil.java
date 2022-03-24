package kr.ac.kopo.day11.calendar;

import java.util.Calendar;

public class CalendarUtil {

	private Calendar c;
	
	public CalendarUtil() {
		c = Calendar.getInstance();
	}
	public void showByYear(int year) {
		for(int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}
	
	public void showByMonth(int year, int month) {
		System.out.println("< " + year + "년 " + month + "월 >");
		//Calendar c = Calendar.getInstance();
		
		// year / month / 1
		c.set(year, month-1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK); //1(일) ~ 7(토)
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);				
		
		showByDay(week, lastDay);
	}
	
	private void showByDay(int week, int lastDay) {
		System.out.println("--------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		int cnt = 0;
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
			++cnt;
		}
		for (int date = 1; date <= lastDay; date++) {
			System.out.print(date + "\t");
			if(date == lastDay || ++cnt % 7 == 0) {
				System.out.println();
			}
		}
	System.out.println("--------------------------------------------------");	
	}
}






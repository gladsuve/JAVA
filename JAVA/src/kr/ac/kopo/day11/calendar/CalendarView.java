package kr.ac.kopo.day11.calendar;

import java.util.Scanner;

public class CalendarView {
	
	private Scanner sc = new Scanner(System.in);
	
	private int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	public void process() {
		int year = 0;
		int month = 0;
		CalendarUtil util = new CalendarUtil();
		int type = getInt("원하는 항목을 선택하세요(1. 특정년도 2. 특정월 3. 종료) => ");
		switch(type) {
		case 1:
			year = getInt("년도를 입력하세요 : ");
			util.showByYear(year);
			break;
		case 2:
			year = getInt("년도를 입력하세요 : ");
			month = getInt("월을 입력하세요 : ");
			util.showByMonth(year, month);
			break;
		case 3:
			System.out.println("프로그램 종료");
			System.exit(0);
			}
		}
}
	

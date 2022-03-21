package kr.ac.kopo.day04.homework;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		int snail = 0, hour = 0;

		while(snail < 100) {
			snail += (snail < 50 ? 5-1 : 5-2);
			System.out.println("[" + ++hour + "시간후] 달팽이가 올라간 총높이 : " 
					+ snail + "M");
		}
		
		/*
		int snail = 0, hour = 0;
		
		while((snail+= 5) < 100) {
			snail += snail < 50 ? -1 : -2;
			System.out.println("[" + ++hour + "시간후] 달팽이가 올라간 총높이 : " 
							+ snail + "M");
		}
		System.out.println("[" + ++hour + "시간후] 달팽이가 올라간 총높이 : " 
				+ snail + "M");
		*/
		
		/*
		int snail = 0, hour = 0;
		
		while(snail < 100) {
			snail += 5;
			snail += snail < 50 ? -1 : -2;
			System.out.println("[" + ++hour + "시간후] 달팽이가 올라간 총높이 : " 
					+ snail + "M");
		}
		*/
	}
}

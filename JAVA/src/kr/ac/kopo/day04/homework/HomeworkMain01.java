package kr.ac.kopo.day04.homework;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		int step = 3;
		
		for(int dan = 2; dan <= 9; dan += step) {
			
			for(int i = 0; i <= 9; i++) {
			
				for(int j = dan; j <= 9 && j < dan + step; j++) {
					if(i == 0)
						System.out.printf("*** %d단 ***\t", j);
					else
						System.out.printf("%d * %d = %d\t", j, i, j* i);
				}
				System.out.println();
				
			}
			System.out.println();
		}
		
	}
}

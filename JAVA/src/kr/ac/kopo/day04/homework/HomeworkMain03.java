package kr.ac.kopo.day04.homework;

public class HomeworkMain03 {

	public static void main(String[] args) {
		
		int star = 1;
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= star; j++) {
				System.out.print('*');
			}
			
			System.out.println();
			if(i < 5)
				star++;
			else
				star--;
		}
	}
}

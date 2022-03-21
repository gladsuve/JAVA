package kr.ac.kopo.day04.homework;

public class HomeworkMain06 {

	public static void main(String[] args) {
		
		int line = (int)(Math.random() * 10) + 3;	// 3 ~ 13
		if(line % 2 == 0)
			line--;
		
		int star = line/2;
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= line; j++) {
				if(j <= star || j > line-star) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}
			}
			System.out.println();
			star += i <= line/2 ? -1 : 1; 
		}
		
	}
}

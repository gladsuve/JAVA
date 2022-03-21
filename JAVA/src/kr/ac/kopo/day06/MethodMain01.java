package kr.ac.kopo.day06;

/*
 	**********
 	Hello
 	**********
 	Hi
 	**********
 	Bye
 	**********
 	
 	반환형 메소드명([파라미터]) {
 		문장;
 		문장;
 	}
 */

public class MethodMain01 {
	
	static int printStar(char ch, int cnt) {
		
		for(int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
		
		return ch + cnt;
	}
	
	static void aaa() {
		boolean bool = true;
		System.out.println("A");
		System.out.println("B");
		if(bool) {
			return;
		}
		System.out.println("C");
		System.out.println("D");
		return;
	}
	
	public static void main(String[] args) {
		
//		aaa();
		
		int code = printStar('A', 10);
		System.out.println("Hello");
		printStar('B', 20);
		System.out.println("Hi");
		printStar('a', 5);
		System.out.println("Bye");
		printStar('z', 8);
	}
}









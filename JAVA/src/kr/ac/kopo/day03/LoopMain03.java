package kr.ac.kopo.day03;

public class LoopMain03 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i % 2 == 1) {
				System.out.println(i + "자바의 세계로 오세요");
			}
		}
		/*
		for(int i = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.println(i + "자바의 세계로 오세요");
		}
		*/
	}
}

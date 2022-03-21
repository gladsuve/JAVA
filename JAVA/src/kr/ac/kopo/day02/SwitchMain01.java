package kr.ac.kopo.day02;

import java.util.Scanner;

/*
	1 ~ 3사이의 정수 입력 : 
	1 입력시 "ONE" 출력
	2 입력시 "TWO" 출력
	3 입력시 "THREE" 출력
	그 외    "ERROR" 출력
 */

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("ONE");
			break;
		case 2 : 
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		default : 
			System.out.println("ERROR");
		}
		
		/*
		if(num == 1) {
			System.out.println("ONE");
		} else if(num == 2) {
			System.out.println("TWO");
		} else if(num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/
	}
}










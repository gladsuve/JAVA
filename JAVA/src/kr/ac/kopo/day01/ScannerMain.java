package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine();
		System.out.println("str : " + str);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("a : " + a);
		
	}
}

package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain05 {
	
	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
		Random r = new Random();
		int num = r.nextInt(3); // 0, 1, 2
		System.out.println("num : " + num);
		System.out.println(10 / num);
		
		String str = "hello";
		System.out.println("str : " + str);
		System.out.println(str.charAt(10));
		} catch(ArithmeticException | StringIndexOutOfBoundsException ae) {
			System.out.println("예외처리 : " + ae.getMessage());
//			ae.printStackTrace();
		}/*catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException : " 
		+ se.getMessage());
		}
		*/
			System.out.println("main end...");
	}

}

package kr.ac.kopo.day02;

public class SwitchMain02 {

	public static void main(String[] args) {

		String str = new String("Hello");
		
		switch(str) {
		case "Hello" : 
			System.out.println("TRUE");
			break;
		default : 
			System.out.println("FALSE");
		}
	}
}

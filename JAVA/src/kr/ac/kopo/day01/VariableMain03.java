package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		
		int a;
		byte b = 10;
		
		a = /* (int) */b;		// int = (int)byte
		
		b = (byte)a;	// byte = (byte)int
		
		System.out.println(10 + 20);
		System.out.println(10 + 20.0);
		System.out.println(10 + (int)20.0);
		
		double d = 10 + 20.2;
		int e = (int)(10 + 20.2);		// int e = (int)30.2;
		
		final int NUM = 100;
		System.out.println("num : " + NUM);
		
//		double aaa = Math.PI*10;
		
		char ch = '!';
		ch = '\'';
		ch = '\n';
		ch = '\\';
		System.out.println(ch);
		
		String path = "D:\\Lecture\\java-workspace";
		System.out.println(path);
		
		String str = "\"ab\"";
		System.out.println(str);
	}
}













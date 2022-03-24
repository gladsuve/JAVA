package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain08 {

	public static void main(String[] args) {
		
		try {
		b();
		} catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		a();
	}
	
	public static void b() throws FileNotFoundException,ArrayIndexOutOfBoundsException {

		int[] arr = new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}
	public static void a() {
		
		try {
			String str = null;
			System.out.println(str.length());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

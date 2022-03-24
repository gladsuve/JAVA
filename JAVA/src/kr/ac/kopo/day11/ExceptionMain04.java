package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain04 {
	
	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
		FileReader fr = new FileReader("a.txt"); //checked Exception
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
			System.out.println("main end...");
	}

}

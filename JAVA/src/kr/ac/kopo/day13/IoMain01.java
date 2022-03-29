package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;

public class IoMain01 {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		
		while(true) {
			try {
			int c = is.read();
			if (c == -1) break;
			System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

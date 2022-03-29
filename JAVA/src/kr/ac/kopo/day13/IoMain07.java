package kr.ac.kopo.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

/*
  iotest/IoMain05.java -> IoMain05.java.txt 복사
 */

public class IoMain07 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			
			fr = new FileReader("iotest/IoMain05.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("iotest/IoMain05.java.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				pw.println(data);
			}
			bw.flush();
			System.out.println("파일 복사를 완료하였습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();			
		} finally {
			FileClose.close(br);
			FileClose.close(fr);
			FileClose.close(bw);
			FileClose.close(fw);
			FileClose.close(pw);
		}
	}
}

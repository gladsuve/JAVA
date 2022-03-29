package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoMain03 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			long start = System.currentTimeMillis();			
			while(true) {
				int c = fis.read();
				if (c == -1) break;
				fos.write(c);
			}
			fos.flush();
			
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			}
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("파일복사가 완료되었습니다.");
	}
}

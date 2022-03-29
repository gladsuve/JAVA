package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class IoMain09 {
	
	public static void write() {
		
		Icecream ice = new Icecream("월드콘", 2000);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		try {
			fos = new FileOutputStream("iotest/object.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ice);
			System.out.println("object.txt에 저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
	}
	
	
	public static void read() {
		
		Icecream ice = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object.txt");
			ois = new ObjectInputStream(fis);
			
			ice = (Icecream)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois, fis);
		}
		
		System.out.println(ice);
	}
	
	
	
	
	public static void main(String[] args) {
		
		read();
//		write();
	}

}

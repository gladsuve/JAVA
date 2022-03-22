package kr.ac.kopo.day09.abs01;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc = new Scanner(System.in);
	
	public String select() {
		
		System.out.print("프린터를 선택하세요(1.LG 2.SAMSUNG) => ");
		String type = sc.nextLine();
		return type;
	}
	
	public void work(String type) {
		switch(type) {
		case "1" :
			LGPrinter lg = new LGPrinter();
			lg.lgPrint();
			break;
		case "2" :
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			break;
			
		}
		
	}
	
	public void process() {
		
		String type = select();
		work(type);
	}

}

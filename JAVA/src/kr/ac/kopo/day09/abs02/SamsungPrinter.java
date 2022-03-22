package kr.ac.kopo.day09.abs02;

public class SamsungPrinter extends Printer{

	@Override
	public void print() {
		System.out.println("삼성프린트에서 출력중...");
	}
	
	
	public void samPrint() {
		System.out.print("삼성프린터에서 출력합니다.");
	}
}

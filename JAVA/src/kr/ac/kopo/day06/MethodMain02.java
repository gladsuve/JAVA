package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을잡니다");
	}
	
	void 냐용거린다() {
		System.out.println("고양이가 냐용합니다");
	}
}

class Method {
	// 메소드 오버로딩(overloading)
	// 같은 클래스내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른것
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(boolean b) {
		System.out.println("call(boolean) 메소드 호출...");
	}
	
	void call(String str, int n) {
		System.out.println("call(String, int) 메소드 호출...");
	}
	
	void call(int n, String str) {
		System.out.println("call(int, String) 메소드 호출...");
	}
}

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(10.3);
		m.call(true);
		m.call("hello", 5);
		m.call(5, "hello");
		
		고양이 나비 = new 고양이();
		
		나비.냐용거린다();
	}
}







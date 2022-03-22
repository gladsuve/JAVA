package kr.ac.kopo.day09;

class A {
	A() {
		System.out.println("A() 호출...");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B() 호출...");
	}
}

class C extends B {
	C() {
		super();
		System.out.println("C() 호출...");
	}
}
public class ExtendsMain02 {

}

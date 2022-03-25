package kr.ac.kopo.day12;

/*
  	기본자료형			Wrapper Class
  	boolean			Boolean
  	char			Character
  	byte			Byte
  	short			Short
 	int				Integer
  	long			Long
  	float			Float
  	double			Double
  	
  	
  	class Boolean {
  		private boolean value;
  		}
 */

public class WrapperMain {

	public static void main(String[] args) {
		
		int i = 100;
		Integer i2 = new Integer(100);
		Integer i5 = Integer.valueOf(100);
		Integer i3 = 100; // auto boxing
		int i4 = new Integer(100); // auto unboxing
		
		System.out.println(Integer.parseInt("123") + 100); //parseInt : 리턴타입 기본자료형 integer
		System.out.println(Integer.valueOf("123") + 100); //valueOf : 리턴타입 참조자료형 integer
	}
}

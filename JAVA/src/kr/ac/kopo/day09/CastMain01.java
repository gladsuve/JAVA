package kr.ac.kopo.day09;

public class CastMain01 {
	
	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
	*/
	
	/*
	 * 묵시적 형변환으로 인해
	 * Parent p = new Parent();
	 * Parent p = new Child01();
	 * Parent p = new Child02();
	 * 자식 클래스가 부모 클래스의 메소드를 Override하고 있기 때문에
	 * 묵시적 형변환 가능
	 */
	
	
	public static void print(Parent p) {
		p.print();
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		}
		
//		System.out.println("Child01 : " + (p instanceof Child01)); 
//		System.out.println("Child02 : " + (p instanceof Child02));
//		System.out.println("Parent : " + (p instanceof Parent));
		/*
		뭐가 올지 모르기 때문에 안되는 코드 
		Child01 c = (Child01)p;
		c.study();
		c.sleep();
		 */
		
	}
	

	public static void main(String[] args) {
		
		
		Child01 c01 = new Child01();
		print(c01);//new Child01()도 사용 가능
		
		/*
		Child01 c01 = new Child01();
		c01.print();
		*/
		
		Child02 c02 = new Child02();
		print(c02);
		
		/*
		Child02 c02 = new Child02();
		c02.print();
		*/
		
		Parent p = new Parent();
		print(p);
		/*
		Parent p = new Parent();
		p.print();
		*/
	}
}

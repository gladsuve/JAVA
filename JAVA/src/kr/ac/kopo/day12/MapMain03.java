package kr.ac.kopo.day12;

/*
class Member {
	
	
	private String name;
	private String phone;
	public Member() {


	}
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Member m = (Member)obj;
		if(this.name != null && this.name.equals(m.name)) {
			return false;
		}
		if(this.name != null && this.name.equals(m.phone)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Member [name = " + name + ", phone = " + phone + "]";
	}
	
}


*/


public class MapMain03 {

	public static void main(String[] args) {
		
		Member m = new Member("홍길동" , "010-1111-2222");
		Member m2 = new Member("홍길동" , "010-1111-2222");
		
		
		
		if(m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");
		}
		
		
		
		
		/*
		String s01 = new String("hello");
		String s02 = new String("hello");
		
		if(s01 == s02) {
			System.out.println("s01 == s02");
		} else {
			System.out.println("s01 != s02");
		}
		
		
		
		if(s01.equals(s02)) {
			System.out.println("s01 == s02");
		} else {
			System.out.println("s01 != s02");
		}
		*/
	}
}

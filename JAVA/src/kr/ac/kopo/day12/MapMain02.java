package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * alt + shift + 누른 후 c 선택 => 기본생성자
 * 					   o 선택 => 매개변수 생성자
 * 					   r 선택 => getter / setter 메소드
 * 					   v 선택 => override / implement 메소드
 * 					   s 선택 => toString() 메소드
 */


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
	public String toString() {
		return "Member [name = " + name + ", phone = " + phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	

	
	/*
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
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
	*/
}

class Car {
	private String name;
	private String carNumber;
	public Car() {
		
	}
	public Car(String name, String carNumber) {
		super();
		this.name = name;
		this.carNumber = carNumber;
	}
	
	
}



public class MapMain02 {
	
	public static void main(String[] args) {
		
		Map<Member, Car> map = new HashMap<Member, Car>();
		
		map.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "33가 3333"));
		map.put(new Member("윤길동", "010-3333-4444"), new Car("K5", "45나 1234"));
		map.put(new Member("홍길동", "010-1111-2222"), new Car("카니발", "82다 8282"));
		
		
		System.out.println("총 개수 : " + map.size());
		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
//		System.out.println("hello".hashCode());
//		System.out.println(new String("hello").hashCode());
//		System.out.println(new String("hello").hashCode());
		
		
		
		/*
		Set<Entry<Member, Car>> entrys = map.entrySet();
		for(Entry<Member, Car> data : entrys) {
			Member member = data.getKey();
			Car car = data.getValue();
			
			System.out.println(member);
		}
		*/
	}

}

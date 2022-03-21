package kr.ac.kopo.day08.extend;


// 관리자(Manager)는 사원(Employee)의 한 형태다 조건 부합 => 상속 관계로 표현
public class Manager03 extends Employee {

	Employee[] empList; // 관리사원목록
	
	Manager03() {
		//super(); 생략
	}
	
	Manager03(String name, int salary, String grade, Employee[] empList) {
		//super(); 기본적으로 super가 숨어있다.
		super(name, salary, grade); //매개변수가 있는 경우 super 생성자 생략 불가
		this.empList = empList;
	}
	
	@Override
	void info() {
		super.info(); //기본으로는 this.info()가 호출이 됨(sub 메소드의 info를 호출)
		//System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
		
		System.out.println("------------------------------------");
		System.out.println("\t 관리사원 목록");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------------");
	}

	
}

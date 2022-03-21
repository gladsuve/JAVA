package kr.ac.kopo.day08;

public class Employee {
	
	String name;
	int salary;
	String grade;
	static int employeeCnt; // 총 사원수를 기억
	
	Employee() {
		employeeCnt++;
		
	}

	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		employeeCnt++;
	}
	
	void info() {
		System.out.println("이름 : " + name + ", 연봉 : " + salary + ", 직급 : " + grade);
	}
	
	static void employeeCntInfo() {
		System.out.println("총 사원 수 : " + employeeCnt + "명");
	}
}

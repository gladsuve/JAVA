package kr.ac.kopo.day11;

import java.util.LinkedList;
import java.util.List;

/*
 List : 순서 O, 중복 O
 	- ArrayList
 	- LinkedList
 	
 	add()
 	get()
 	size()
 	remove()
 	clear()
 	isEmpty()
 	contains()
 	addall()
 */

public class ListMain {
	
	public static void main(String[] args) {
	
//		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>(); //JDK 1.7부터 사용가능
		List<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one");
		System.out.println("전체 원소의 개수 : " + list.size() + "개");
		
		System.out.println("< PRINT >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("\"one\"삭제 : " 
				+ (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\"삭제 : " 
				+ (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\"삭제 : " 
				+ (list.remove("one") ? "성공" : "실패"));
		
		
		System.out.println("< 1.5버전 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("0번째 문자열 : " +  list.get(0));
		System.out.println("0번째 위치한 문자열 삭제 : " + list.remove(0));
		System.out.println("0번째 문자열 : " +  list.get(0));
	}

}

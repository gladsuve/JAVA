package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		
//		String[] strArr = {"데이터분석", "자바", "교육"};
		String[] strArr = new String[5];
		int loc = 0;
		strArr[loc++] = "폴리텍";
		strArr[loc++] = "데이터분석";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
		
		/*
		 * 배열의 전체 원소를 출력 방식
		 * 1. index를 이용한 출력  (원소접근: 0 ~ length-1)
		 * 2. 1.5버전의 for문을 이용한 출력
		 * 3. Arrays.toString() 메소드를 이용한 출력
		 */
		System.out.println("< index를 이용한 출력 >");
		for(int i = 0 ; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("< 1.5버전의 for문 이용 출력 >");
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println("< Arrays.toString() 메소드 이용 출력 >");
		String result = Arrays.toString(strArr); 	// "[원소, 원소, 원소, ...]"
		System.out.println(result);
	}
	
}



















package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {

		int[] arr;
		
		// 정수 5개를 가지는 배열 생성
		arr = new int[5]; // arr[0] ~ arr[4]
		System.out.println("arr : " + arr);
		System.out.println("배열의 원소 총 개수 : " + arr.length + "개");
		System.out.println("첫번째 원소 : " + arr[0]);
		System.out.println("두번째 원소 : " + arr[1]);
		System.out.println("세번째 원소 : " + arr[2]);
		System.out.println("네번째 원소 : " + arr[3]);
		System.out.println("다섯번째 원소 : " + arr[4]);

		System.out.println("-----------------------------");
		
//		for(int i = 0; i < 5; i++) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 원소 : " + arr[i]);
		}
		
		System.out.println("-----------------------------");
		// 각원소값에 10, 20, 30, 40, 50 대입
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;

		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 원소 : " + arr[i]);
		}
	}
}







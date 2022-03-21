package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
		int count = sc.nextInt();
		sc.nextLine();
		
		Icecream[] iceArr = new Icecream[count];
		for(int i = 0; i < count; i++) {
			
			iceArr[i] = new Icecream();
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		}
	
		System.out.println("< " + iceArr.length + "개 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].name 
					+ "\t" + iceArr[i].price);
		}
		
		/*
		int no = 0;
		for(Icecream ice : iceArr) {
			System.out.println(++no + "\t" + ice.name + "\t" + ice.price);
		}
		*/
		
	}
}










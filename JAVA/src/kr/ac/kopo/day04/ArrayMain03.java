package kr.ac.kopo.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		/*
		int data = 1;
		for(int num : arr) {
			num = data++;
		}
		*/
		
		System.out.println("< PRINT >");
		for(int num : arr) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		*/
	}
}

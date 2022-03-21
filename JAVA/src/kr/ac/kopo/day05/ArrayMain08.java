package kr.ac.kopo.day05;

public class ArrayMain08 {

	public static void main(String[] args) {
		
		String[] strArr = new String[3];
		
		strArr[0] = "hello";
		strArr[1] = new String("good");
		strArr[2] = "byebye~~~";
		
		for(String str : strArr) {
			System.out.println(str);
		}
		
	}
}

package kr.ac.kopo.day03.homework;

public class HomeworkMain03 {

	public static void main(String[] args) {
		
		int upperCnt = 'Z' - 'A' + 1;
		int lowerCnt = 'z' - 'a' + 1;
		
		char ch = 'B';
		if(ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch + ('a' - 'A'));
		} else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - ('a' - 'A'));
		}
		
	}
}

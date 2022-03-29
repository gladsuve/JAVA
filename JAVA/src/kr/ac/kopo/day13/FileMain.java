package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		if(dirObj.exists() == true) {
			
			File[] list = dirObj.listFiles();
			for(File f : list) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory() ? "디렉토리" : "파일");
			}
			
	/*
			String[] list = dirObj.list();
			for (String data :list) {
				System.out.println(data);
				File fileObj = new File(dirObj.getName() + "/" + data);
				System.out.println(fileObj.isDirectory() ? "디렉토리" : "파일");
	*/

		}
		
		
		/*
		File dirObj = new File("iotest/강아지/리트리버");
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		
		
		
		// 상위 폴더도 존재하지 않을 때
		if(dirObj.exists() == false) {
			dirObj.mkdirs();
		}
		
		// 가장 하위 폴더만 없을 때
		if(dirObj.exists() == false) {
			dirObj.mkdir();
		}
		*/

	
		
		
		
		/*
		File fileObj = new File("iotest/a.txt");
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("부모 : " + parent);
		
		System.out.println("파일 존재여부 : " + fileObj.exists());
		long fileSize = fileObj.length();
		System.out.println("파일 크기 : " + fileSize + "byte(s)");
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		long lastTime = fileObj.lastModified();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
		 */
	}
}

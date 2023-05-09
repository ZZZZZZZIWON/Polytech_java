package chap08;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File f = new File("C:\\javaex\\file.txt");
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println("파일크기 : "+f.length()); // file의 속성에 나와있는 크기(바이트)랑 비교
	
		f = new File("C:\\javaex");
		if(f.isDirectory()) {
			System.out.println("Directory가 맞습니다");
			
		File[] subfiles = f.listFiles(); // listFiles()는 File[] 형태로 반환
		for (File ff : subfiles) {
			System.out.println(ff.getName());
		}
		}
	}
}

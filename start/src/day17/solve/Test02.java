package day17.solve;

import java.io.*;

public class Test02 {
	
/*
 	
 	이전 예제에서 만든 파일(FileTest01.txt)을 읽어보자.
 	
 */

	public Test02() {
		// 할 일
		// 1. 파일로 연결된 스트림 준비
		FileInputStream fin = null;
		
		try {
			// 스트림 연결
			fin = new FileInputStream("src/day17/result/FileTest01.txt");
			
		// 2. 한 글자만 읽기
		int ch = fin.read();
		
		// 3. 출력
		System.out.println("읽은 문자 : " + (char)ch);
		
		// 여러 글자를 읽기
		byte[] buff = new byte[10];
		int len = fin.read(buff);
		
		// byte 배열을 문자열로 변환하기
		String str = new String(buff, 0, len);
		System.out.println("읽은 내용 : " + str);
		
		/*
		
		// Test01.java 파일을 읽어서 출력해보자.
		fin = new FileInputStream("src/day17/Test01.java");
		// 몇 글자를 읽어야할지 모르기 때문에 반복해서 처리
		// 더 이상 읽을 내용이 없을 때까지 반복해서 처리
		// 더 이상 읽을 내용이 없는 경우는
		// 		int read(byte[] b)
		// 함수의 반환값이 -1을 반환해줌
		// 따라서 함수실행의 반환값이 -1이 될 때까지 반복해서 처리
		while(true) {
			// byte[] 준비
			byte[] buff = new byte[1024];
			// 데이터 읽기
			int len = fin.read(buff);
			if(len == -1) {
				break;
			}
			
			// 읽은 byte 배열을 문자열로 변환해서 출력
			String str = new String(buff, 0, len);
			
			// 출력
			System.out.print(str);
			}
			
			*/
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
			
			} catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}

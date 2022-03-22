package day17.solve;

import java.io.*;

/*

	파일에 내용을 저장하는 프로그램을 만들어보자.
	
 */

public class Test01 {

	public Test01() {
		// 파일에 저장하기 위해서는 파일로 연결된 스트림 필요
		FileOutputStream fout = null;
		// 예외 처리 필요하기 때문에
		try {
			fout = new FileOutputStream("C:\\class\\java\\git\\start\\start\\src\\day17\\result\\FileTest01.txt");
		//	fout = new FileOutputStream("src/day16/result/FileTest01.txt");
			
			// 1. 한 글자만 입력해보자.
			fout.write('j'); // char ==> int로 자동 형변환
			
			// 2. 여러 글자를 내보내보자.
			// 문자열 준비
			String song = "Hey boy\r\nMake 'em whistle like a missile, bomb, bomb";
			// 준비된 문자열을 바이트 배열로 변환
			byte[] buff = song.getBytes();
			// 배열을 스트림에 흘려보내기
			fout.write(buff);
			
			// 문자열 일부만 추출하고 싶다면
			
			/*
			
			String song = "Make 'em whistle like a missile, bomb, bomb";
			byte[] buff = song.getBytes();
			fout.write(buff, 9, buff.length -9);
			
			*/
			
			System.out.println("### 파일 저장 성공 ###");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 외부장치와 연결된 경우는 해당 외부장치의 사용이 끝나면 닫아주는 것이 원칙
			try {
				fout.close();
			} catch(Exception e) {} // 예외 전이는 호출한 곳에서 다시 적어줌
		
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}

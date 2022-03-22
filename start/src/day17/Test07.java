package day17;

/*
	
	키보드를 이용해서 문자를 입력받아보자.
	
 */

import java.io.*;
import java.util.*;

public class Test07 {

	public Test07() {
		
		/*
		 	참고 ]
		 		
		 		키보드 역시 입력장치로 외부장치
		 		자주 사용하는 외부장치이므로
		 		이미 스트림을 준비한 변수가 존재함
		 		
		 		System.in
		 		
		 */
		
		System.out.print("입력해주세요! : ");
		int ch = 0;
		try {
			
			/*
			
			// 1. 한 글자만 읽어보기
			ch = System.in.read();
			// 출력
			System.out.println("입력한 문자 : " + (char)ch);
			
			
			// 2. 문장을 입력해서 읽어보기
			// 여러 문자를 기억할 변수 준비
			byte[] buff = new byte[256];
			// 배열을 만들 때 입력한 숫자가 한번에 읽을 수 있는 데이터의 양을 결정함
			int len = System.in.read(buff); // len : 읽은 문자의 개수를 반환해줌
			// 읽은 데이터를 문자로 변환해서 출력
			String str = new String(buff, 0, len);
			// 출력
			System.out.println("입력 문장 : " + str);
			
			 */
			
			// 3. 주로 네트워크 처리를 할 때 많이 사용하는 방법
			byte[] buff = new byte[256];
			// 배열에 기본값을 'A'로 채우기
			Arrays.fill(buff, (byte)'A'); // 배열의 모든 방에 'A'로 채워넣기
			int len = System.in.read(buff, 10, 100);
			// 준비된 배열인 buff에 11번째 방부터 읽은 내용을 기억해라
			// 최대 100까지만 읽어라 (100글자만 읽어옴)
			String str = new String(buff, 0, len + 10);
			System.out.println("입력한 내용 : " + str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

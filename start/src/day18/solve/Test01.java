package day18.solve;

import java.io.*;

/*

	char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요.
	
 */

public class Test01 {

	public Test01() {
		// 타겟(기본)스트림 준비
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/day18/result/휘파람.txt");
			
			// 1. 한 글자(2바이트)만 저장해보자.
			char ch = '휘';
			fw.write(ch);
			
			// 2. 여러 글자를 저장해보자.
			// 문자열 준비
			String str = "\t\t\t휘파람\r\n\t\t\t\t\t블랙핑크";
			// 여기서는 문자 단위로 처리를 해야하므로
			// 문자 배열 준비
			// 문자열을 문자 배열로 변환시켜주는 함수 : toCharArray()
			
			char[] buff = str.toCharArray();
			fw.write(buff);
			
			/*
					
					참고 ]
						
						char 단위는 텍스트 데이터만 처리하도록 되어있으므로
						기본 함수에 문자처리 기능이 추가되었음
						
			 */
			
			fw.write(str);
			
			System.out.println("*** 저장 성공 ***");
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				
			} catch(Exception e){}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}

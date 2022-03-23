package day18.solve;

import java.io.*;

/*
	
	result 폴더의 blackpink.txt 파일을 읽어보자.
	
	기본 스트림은 바이트 기반으로
	보조 스트림은 문자 기반 스트림으로 연결해서 처리해보자.

	참고 ]
		
		스트림을 사용할 때 주의사항
			1. 반드시 방향이 같아야 함
			2. 크기가 같아야 함
		을 지켜줘야 하는데
		위의 조건처럼 다른 계열의 스트림을 연결해서 사용해야 하는 경우는
		
		InputStreamReader / OutputStreamWriter를 이용해서 서로를 연결해 사용해야 함
		
		이 때 주의사항으로는
			반드시 기본 스트림은 바이트 기반이어야 하고
			보조 스트림은 문자 기반 스트림이어야 함
			
 */

public class Test08 {

	public Test08() {
		// 기본 스트림 준비
		FileInputStream fin = null;
		// 보조보조 스트림
		InputStreamReader isr = null;
		// 보조 스트림
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day18/result/blackpink.txt");
			isr = new InputStreamReader(fin);
			br = new BufferedReader(isr);
			
			// 몇 번 읽어야할지 알 수 없기 때문에
			while(true) {
				String str = br.readLine();
				
				if(str == null) {
					break;
				}
				
				System.out.println(str);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}

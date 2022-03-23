package day18.solve;

import java.io.*;

/*
	
	이미지 파일을 문자 단위 스트림으로 복사해보자.
		result / heejin4.jpg ==> heejin4_copy.jpg
	
	원칙은 문자 단위 스트림으로 주고받으면 안 됨
	바이트코드가 역순이 될 수 있기 때문에
	
	결과는 복사된 이미지 파일이 보이지 않는것이 정상
	
 */

public class Test03 {

	public Test03() {
		// 기본 스트림 두개 필요 (읽는것 쓰는것 두개)
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/day18/result/heejin4.jpg");
			fw = new FileWriter("src/day18/result/heejin4_copy.jpg");
			
			// 몇 번 반복해야 하는지 알 수 없으므로
			char[] buff = new char[1024];
			while(true) {
				// 한 쪽에서 읽어서 배열에 채워주기
				int len = fr.read(buff);
				
				// 읽은 데이터가 없는 경우
				if(len == -1) {
					break;
					
				}
				
				// 다른 쪽에 내용 쓰기
				fw.write(buff, 0, len);
			}
			
			// 결과 출력
			System.out.println("*** 복사 성공 ***");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

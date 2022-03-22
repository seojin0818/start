package day17;

/*

	파일에 내용을 저장하는 프로그램을 작성하세요.
	단, BufferedStream을 사용하세요.
	
 */

import java.io.*;

public class Test08 {

	public Test08() {
		// 1. 반드시 장치에는 기본 스트림이 연결되어야 함
		FileOutputStream fout = null;
		
		// 2. 필요에 따라서 보조(필터)스트림을 연결할 수 있음
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("src/day17/result/bufferTest01.txt"); // 타겟(기본) 스트림 만들기
			bout = new BufferedOutputStream(fout); // 필터(보조) 스트림
			
			// 내용 만들기
			String str = "Uh, 휘 파람, 파람, 파람 (can you hear that?)";
			// 내용을 byte 배열로 변환하기
			byte[] buff = str.getBytes();
			// 데이터를 보조 스트림에 써주기
			bout.write(buff);
			
			/*
			 	
			 	아직 버퍼가 가득 채워지지 않았으므로
			 	버퍼의 내용이 fout으로 전달되지 않음
			 	따라서 저장되지 않음
			 	
			 	반드시 습관적으로 작업이 완료된 시점에서
			 	버퍼를 비워주는 습관을 가짐
			 	
			 */
			
			bout.flush();
			
			System.out.println("***** 작업 완료 *****");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}

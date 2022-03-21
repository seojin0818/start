package day16;

/*

	data.txt 파일을 읽어서 Map으로 저장해보자.
	
 */

import java.io.*;
import java.util.*;

public class Test08 {

	public Test08() {
		Properties prop = new Properties();
		// 이 맵을 외부 파일과 연결할 예정
		
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("start/src/day16/data.txt");
			// 여기 경로는 전체 절대 경로를 사용해도 됨
			// 이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 경로를 새롭게 정해서 처리하므로
			// 위 규칙을 따르면 됨
			
			// 이제 이 파일의 내용을 Properties가 읽도록 함
			prop.load(fin);
			// 위 작업이 완료되면 파일의 내용을 읽어서 Map으로 만들어 놓았음
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (Exception e) {}
				
			}
			
			// 위 작업이 완료되면 HashMap에 데이터가 저장된 것처럼 사용하면 됨
			String name = (String) prop.get("name");
			// 출력
			System.out.println("저장된 이름 : " + name);
		}
	

	public static void main(String[] args) {
		new Test08();
	}

}

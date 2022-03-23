package day18;

import java.io.*;

/*
	
	제니의 정보를 Friend 클래스를 이용해서 저장해보자.
	
	ObjectOutputStream을 이용해서 저장
 */
public class Test06 {

	public Test06() {
		// 기본 스트림
		FileOutputStream fout = null;
		
		// 보조 스트림
		ObjectOutputStream oout = null;
		
		// 데이터 만들기
		Friend jn = new Friend();
		jn.setName("제니");
		jn.setTel("010-1111-1111");
		jn.setMail("jennie@githrd.com");
		jn.setAddr("YGM");
		jn.setBlood("AB");
		jn.setAge(27);
		jn.setHeight(165.5F);
		jn.setGen('F');
		jn.setRh(true);
		
		try {
			fout = new FileOutputStream("src/day18/result/jennie.txt");
			// 필터 스트림 연결
			oout = new ObjectOutputStream(fout);
			
			// 준비된 데이터 쓰기
			oout.writeObject(jn);
			// 이처럼 클래스 전체를 입출력하는 행위를 직렬화라고 표현
			
			System.out.println("*** 저장 성공 ***");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
			
	}

	public static void main(String[] args) {
		new Test06();
	}

}

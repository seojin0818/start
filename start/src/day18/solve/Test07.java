package day18.solve;

import java.io.*;

/*
	
	Test06에서 저장한 jennie.txt 파일을 읽어보자.
	
	ObjectOutputStream으로 저장한(내보낸) 파일은
	반드시 ObjectInputStream으로 읽어야 함
	그리고 보내는 쪽과 받는 쪽에 모두 동일한 클래스가 있어야 함
	
 */

public class Test07 {

	public Test07() {
		// 기본 스트림
		FileInputStream fin = null;
		// 보조 스트림
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream("src/day18/result/jennie.txt");
			oin = new ObjectInputStream(fin);
			
			// 클래스 통째로 읽어오기
			Friend jny = (Friend) oin.readObject();
			String name = jny.getName();
			String tel = jny.getTel();
			String mail = jny.getMail();
			String addr = jny.getAddr();
			String blood = jny.getBlood();
			int age = jny.getAge();
			float height = jny.getHeight();
			char gen = jny.getGen();
			boolean rh = jny.isRh();
			
			// 출력
			System.out.println("이름 : " + name);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("주소 : " + addr);
			System.out.println("혈액형 : " + blood);
			System.out.println("나이 : " + age);
			System.out.println("신장 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("rh : " + rh);
			
			System.out.println(jny);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

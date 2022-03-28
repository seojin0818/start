package ping;

// 핑서버 프로그램을 제어하는 클래스

import java.util.*;

public class Test01 {

	public Test01() {
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.println("*** 핑서버 프로그램 ***\n서버기동 : start\n서버중단 : quit\n 명령을 입력하세요.");
		
		String str = sc.nextLine();
		
		switch(str) {
		case "start" :
			new Test02();
			break;
		
		case "quit" :
			// 할 일 없음
			break;
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}

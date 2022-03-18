package day15;

/*
	문제 1 ]
	
		아이디를 입력 받아서
		입력 받은 아이디가 유효한 아이디인지 아닌지를 판별해주는 프로그램을 작성하세요.
		
		아이디는
			첫 글자는 영문대문자로 시작하고
			두번째부터는 영문숫자를 사용할 수 있음
			글자수는 5글자 이상이어야 함
			
 */

import java.util.*;
import java.util.regex.*;

public class Ex01 {

	public Ex01() {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력 받기 전 입력 메세지 출력
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		// 정규식 검사
		// 1. 패턴 정의
		Pattern form = Pattern.compile("[A-Z][a-zA-Z0-9]{4,}");
		
		// 2. 패턴에 맞는지 검사
		Matcher mat = form.matcher(id);
		
		// 3. 결과 판별
		boolean bool = mat.matches();
		
		String result = bool ? "유효한" : "유효하지 않은";
		
		// 결과 출력
		System.out.println("입력하신 아이디 " + id + " 는 " + result + " 아이디 입니다.");
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

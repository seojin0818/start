package day04.ex;

import java.util.*;
// // 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨
public class Ex0202 {
/*
 
 2. 숫자 또는 알파벳을 입력 받아서
	그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
	
 */

	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("입력할 숫자 또는 알파벳 : ");
		
		// 3) 입력 받은 문자열 저장
		String str = sc.nextLine();
		
		// 4) 문자열에서 문자 추출
		char ch = str.charAt(0);
		
		// 5) 판별
		// 특수문자 - 숫자 - 대문자 - 소문자
		String result = (ch >= 'a' & ch <= 'z') ? ("소문자") : (ch >= 'A' & ch <= 'Z') ? ("대문자") : ("숫자");
		
		// 6) 출력
		System.out.println("입력 받은 데이터는 " + result + " 입니다.");
		
		
		
		
	}
}

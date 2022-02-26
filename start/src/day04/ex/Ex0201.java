package day04.ex;

import java.util.Scanner;
// // 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Ex0201 {


/*

	1. 알파벳을 입력 받아서
	그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.

*/
	public static void main(String[] args){
	// 진입점 함수
		
	// 문제 1번 할 일
	// 1) 입력 도구 준비
	Scanner sc = new Scanner(System.in);
	
	// 2) 입력 받기 전 입력 메세지 출력
	System.out.print("입력할 알파벳 : ");
	
	// 3) 문자열을 입력 받음
	String str = sc.nextLine();
	
	// 4) 문자열에서 문자 추출
	char ch = str.charAt(0);
	
	// 5) 판별
	// 대문자인지 소문자인지 기준을 어떻게 잡을까?
	// 특수문자 - A ~ Z - 특수문자 - a ~ z - 특수문자
	String result = (ch >= 'A' && ch <= 'Z') ? ("대문자") : ("소문자");
	
	// 6) 최종 출력
	System.out.println("입력 받은 알파벳은 " + result + " 입니다.");
	
}
	
}

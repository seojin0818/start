package day04.ex;

import java.util.Scanner;

public class Ex0201 {


/*

	1. 알파벳을 입력 받아서
	그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
	
	2. 숫자 또는 알파벳을 입력 받아서
	그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.

*/
	public static void main(String[] args){
		
	// 할 일
	// 입력 도구 준비
	Scanner sc = new Scanner(System.in);
	// 입력 메세지 출력
	System.out.print("입력할 알파벳 : ");
	// 문자열을 입력 받음
	String str = sc.nextLine();
	// 문자열에서 문자를 추출
	char ch = str.charAt(0);
	// 대문자인지 소문자인지 기준을 어떻게 잡을까?
	// 특수문자 - A ~ Z - 특수문자 - a ~ z - 특수문자
	String result = (ch >= 'A' & ch <= 'Z') ? ("대문자") : ("소문자");
	
	// 결과를 출력한다.
	System.out.println("입력 받은 알파벳은 " + result + " 입니다.");
	
		==> 알파벳이 아니라 모든 문자가 판별된다. 수정 필요
	
}
}

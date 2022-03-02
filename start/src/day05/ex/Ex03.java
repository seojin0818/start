package day05.ex;

/*
 	
 	문제 3 ]
 		
 		문자열을 입력 받아서
 		문자를 한 글자씩 추출해서 출력하세요.
 		
 	참고 ]
 		
 		문자열의 길이를 알아내는 방법
 		int 변수 = 문자열.length();
 		
 */

import java.util.*;
//이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Ex03 {

	public static void main(String[] args) {
	// 진입점 함수
		
			// 할 일
			// 1) 입력 도구 준비
			Scanner sc = new Scanner(System.in);
			
			// 2) 입력 받기 전 입력 메세지 출력
			System.out.print("문자열 입력 : ");
			// System.out.print(내용);
			// 내용 출력 + 줄 바꿈 x
			
			// 3) 입력 받은 문자열 저장
			String str = sc.nextLine();
			
			// 4) 문자열 길이 구하기
			int no = str.length();
			
			// 5) 문자열에서 문자 추출
			// char ch = str.charAt(0);
			// for(char j = 0 ; j < ch ; j++) {
				
				for(int i = 0 ; i < no ; i++) {
				System.out.println((i + 1) + " 번째 문자 추출 : ");
				
				}
			}
	}

/* 강사님 풀이 ]
	
	// 문자열에서 문자를 한글자씩 추출하려면
	// 전체 문자열의 길이를 알아내고
	// 그 길이만큼 반복해서 추출해준다.
	 
import javax.swing.*;

	// 할 일
	// 1) 문자열 입력 받아서 기억하기
	String str = JOptionPane.showInputDialog("문자열을 입력하세요!");
	
	// 2) 입력 받은 문자열의 길이 알아내기
	문장의 길이가 3.5 개는 아니니까 정수형
	int len = str.length();
	
	// 3) 길이만큼 반복해서 한글자씩 추출해서 출력하기
	for(int i = 0 ; i < len ; i++) {
		문자열에서 한글자 꺼내면 문자
		해당 위치의 문자를 꺼내주는 함수
		char ch = str.charAt(i); // 위치값이 계속 증가 / index는 0부터 시작하니까 길이에서 1 빼주면 index 값 나옴 / 이미 카운터변수 i가 ++1씩 하는 역할 중
		
		참고 ]
			
			문자를 문자열로 변환시키는 방법
			
				문자 + "";
				
		System.out.println((i + 1) + " 번째 문자 : [" + ch + "]");				
				
 */

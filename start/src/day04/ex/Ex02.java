package day04.ex;

/*
 	문제 2 ]
 		
 		문자를 임의로 랜덤하게 입력한 후
 		그 문자가 대문자이면 소문자로
 		소문자이면 대문자로 변환하고
 		만약 특수문자이면 그 문자 그대로 
 		출력하는 프로그램을 작성하세요.
 		
 	참고 ]
 		아스키 코드는
 			
 		특수문자 - 숫자(0-9) - 특수문자 - 영문대문자(A-Z) - 특수문자 - 영문소문자(a-z) - 특수문자
 		
 	참고 ]
 		문자열에서 문자를 추출하는 방법
 		
 			문자열.charAt(위치값)
 			
 		이 때 위치값은 0부터 시작
 		
 		ex ]
 			"abcd" 에서 두번째 문자를 추출하려면
 			
 			"abcd".charAt(1) ==> 'b'
 		
 			'J' -> 'j'
 			
 			(char)('J' + ('a' -'A'))
 			소문자가 대문자보다 크다
 */

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 메세지 출력
		System.out.print("문자 입력 : ");
		
		// 3) 입력 받은 문자열 저장
		String str = sc.nextLine();
		
		// 4) 문자열에서 문자 추출
		char ch = str.charAt(0);
		System.out.println("문자 : " + ch);
		
		// 5) 판별 (판별 결과는 변수에 담아서 처리)
		char result = (ch < 'A') ? (ch) : (ch <= 'Z') ? ((char)(ch + ('a' - 'A'))) : (ch < 'a') ? (ch) : (ch <= 'z') ? ((char)(ch - ('a' - 'A'))) : (ch);
		
		// 6) 최종 출력
		System.out.println("입력한 문자 : " + ch);
		System.out.println("변환된 문자 : " + result);
		
		// 대문자 - 소문자 변환
		// char ch2 = (char)((ch >= 'a' && ch <= 'z') ? ch - ('a' - 'A') : ch + ('a' - 'A') );

	}
}

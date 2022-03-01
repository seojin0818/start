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
			System.out.print("문자 입력 : ");
			// System.out.print(내용);
			// 내용 출력 + 줄 바꿈 x
			
			// 3) 입력 받은 문자열 저장
			String str = sc.nextLine();
			
			// 4) 문자열 길이 구하기
			int no = str.length();
			
			// 5) 문자열에서 문자 추출
			char ch = str.charAt(0);
			int ch1 = 0;
			for(int j = 0 ; j < ch1 ; j++) {
				
				for(int i = 0 ; i < no ; i++) {
				System.out.println(( i + 1) + " 번째 문자 추출 : " + (j + 1));
				}
			}
	}
}



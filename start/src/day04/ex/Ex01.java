package day04.ex;

/*
 	문제 1 ]
 	
 		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 		
 		단, 3항 연산자를 사용해서 처리하세요.
 */

import java.util.*;
// 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Ex01 {
	public static void main(String[] args) {
		
		// 할 일
		// 1) 1 ~ 25 의 숫자 3개를 랜덤으로 생성
		int no1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 2) 판별
		int max;
		max = (no1 > no2 && no1 > no3) ? no1 : (no2 > no3) ? no2 : no3;
		
		// 3) 최종 출력
		System.out.println("1 ~ 25 사이의 랜덤하게 발생된 숫자 중 가장 큰 수는 " + max + "입니다.");
		
		
	/* 강사님 풀이 ]

	 	1) 랜덤한 정수 3개 발생시키기
	 	int no1 = (int)(Math.random() * (25 - 1 + 1) + 1);
	 	
	 	// 보너스 문제 :  -100 ~ 100 사이의 정수를 랜덤하게 발생시켜보세요.
	 	 100 - (-100) + 1 + (-100)
	 	 
	 	int no2 = (int)(Math.random() * (25 - 1 + 1) + 1);
	 	int no3 = (int)(Math.random() * (25 - 1 + 1) + 1);
	 	
	 	2) 판별해서 변수에 담기
	 	int max = (no1 > no2) ? // (// no1 > no2 라는 전제하에서 실행
	 	 (no1 > no3) ? no1 : no3
	 	 	) : ( // no2 > no1 라는 전제하에서 실행
	 	  (no2 > no3) ? no2 : no3
			);
			
		3) 출력
		System.out.println("입력한 세 정수 \n\t" + no1 + "," + no2 + ", " + no3 + " \n 중 제일 큰 수는 " + max + 입니다.);
		
			참고 ] 
			
				문자열을 표현할 때 문자열 안에 " 기호를 출력하는 방법
				==> \"
				이 때 사용한 \를 이스케이프 문자 라고 함
				
				많이 사용하는 문자들
				
					\" - 문자열 내에 " 표현
					\n - 한 줄 내림 기호
					\r - 캐리지리턴
					\t - tab 을 표현
					\b - backspace
	 */
		
}
}

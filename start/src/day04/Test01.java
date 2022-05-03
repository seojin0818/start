package day04;

/*
	
	문제 ]  정수 하나를 입력 받아서
 			이 수가 0인지 홀수인지 짝수인지를 판별하세요.
 	
 	참고 ]
 	
 		조건문
 		
 		if(조건식) {
 			// 조건식이 참일 경우 실행하는 부분
 			실행내용
 		}
 		
 */

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 입력 도구 준비하기
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력하기
		System.out.print("정수 입력 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		
		// 3) 입력 받고 정수를 변수에 기억시키기
		int num = sc.nextInt();
		
		// 4) 조건에 따라 판별하기
		String soo = "[영]";
		
		// 홀수인 경우
		if(num % 2 != 0) { // 혹은 num % 2 == 1
			soo = "홀수";
		}
		
		// 짝수인 경우
		if(num != 0 && num % 2 == 0) { // & 하나만 써도 연산 가능
			soo = "짝수";
		}
		
		// 5) 최종 출력하기
		System.out.println("입력 받은 정수 : " + num + " 은 " + soo + "입니다.");
		// Systsem.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
	}
}

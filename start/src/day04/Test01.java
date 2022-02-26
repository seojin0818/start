package day04;

/*
	정수 하나를 입력 받아서
 	이 수가 0 인지 홀수인지 짝수인지를 판별하세요.
 	
 	참고 ]
 		조건문
 		
 		if(조건식) {
 			// 조건식이 참일 경우 실행하는 부분
 			실행내용
 		}
 */

import java.util.*;
// // 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Test01 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		// 2) 입력 받기 전에 입력 메세지 출력
		System.out.print("정수 입력 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		// 3) 입력 받고 정수를 변수에 기억 시킨다.
		int num = sc.nextInt();
		// 4) 조건에 따라서 판별한다.
		String soo = "[영]";
		
		// 홀수인 경우
		if(num % 2 != 0) { // != 피연산자들의 값이 같지 않다. 혹은 num % 2 == 1
			soo = "홀수";
		}
		
		// 짝수인 경우
		if(num != 0 && num % 2 == 0) { // == 피연산자들의 값이 같다. & 하나만 써도 연산 가능
			soo = "짝수";
		}
		
		// 5) 내용을 출력한다.
		System.out.println("입력 받은 정수 : " + num + " 은 " + soo + "입니다.");
		// Systsem.out.println(내용);
		// 내용 출력 + 줄 바꿈
		
	}
}

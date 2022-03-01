package day04;

/*
 
 	정수를 입력받아서
 	짝수인지 홀수인지를 판별하세요.
 	단, 0은 짝수로 간주한다.
 	
 */

import java.util.*;
// 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Test04 {
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("정수 입력 : ");
		// System.out.print(내용);
		// 내용 출력 + 줄 바꿈 x
		
		// 3) 입력 받아서 변수에 기억시키기
		int num = sc.nextInt();
		
		// 4) 짝수인지 홀수인지 판별
		String result = (num % 2 == 0) ? ("짝수") : ("홀수");
		// () ? () : ();
		
		// 5) 최종 출력
		System.out.println("입력 받은 숫자 [ " + num + " ] 은 ' " + result +  " ' 입니다.");
		// System.out.println(내용);
		// 내용 출력 + 줄 바꿈
	}
}

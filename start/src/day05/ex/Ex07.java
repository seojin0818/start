package day05.ex;

/*
	문제 7 ]
	
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
		
		힌트 ]
		
			***** % 10 ==> 마지막 자리만 꺼냄
			***** / 10 ==> ****
				<------
				
*/

import java.util.*;
// 이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 됨

public class Ex07 {

	public static void main(String[] args) {
	// 진입점 함수
		
			// 할 일
			// 1) 입력 도구 준비
			Scanner sc = new Scanner(System.in);
			
			// 2) 입력 받기 전 입력 메세지 출력
			System.out.print("5자리 정수 입력 : ");
			
			// 3) 입력 받은 데이터를 기억시키기
			int no = sc.nextInt();
			
			int sum = 0;
			int tmp = no; // 밖에서 선언해놓고
			
			// 4) 반복해서 합 구하기
			for(int i = 0 ; i < 5 ; i++) { // 안에서 변경해나감
				sum = sum + tmp % 10;
				tmp = tmp / 10;
			}
			
			// 5) 최종 출력
			System.out.println("입력한 수 " + no + " 의 각 자리수의 합은 " + sum + " 입니다.");

			}
			
			
			}



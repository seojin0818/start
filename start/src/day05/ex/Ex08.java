package day05.ex;

/*
	문제 8 ]
	
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
	
		문자열로 입력받아서 문자로 변환 후 처리하세요.
		
		힌트 ]
		
			'0'을 숫자로 변환하는 방법
				'0' - '0'
			'1'을 숫자로 변환하는 방법
				'1' - '0'
			'9'를 숫자로 변환하는 방법
				'9' - '0'
	
	
*/

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
	// 진입점 함수			
		
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("다섯자리 숫자 입력 : ");
		
		// 3) 입력 받은 데이터를 기억시키기
		String sno = sc.nextLine();
		
		// 전체 길이
		int len = sno.length();
		
		// 합 기억할 변수
		int sum = 0;
		for(int i = 0 ; i < len ; i++) {
			// 각 자릿수 문자로 꺼냄
			char ch = sno.charAt(i); // 숫자 형태의 문자 / "1에 대한 아스키 코드 값 - 0에 대한 아스키 코드 값 = 문자"
			
			// 문자를 숫자로 변환
			int num = ch - '0';
			
			// 합계 변수에 누적시킴
			sum += num;
			
			
			// 최종 출력
			System.out.println("입력한 숫자 [ " + sno + " ] 의 각 자리의 합은 " + sum + " 입니다.");
			}
		}

	}

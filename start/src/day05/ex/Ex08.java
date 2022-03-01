package day05.ex;

/*
	문제 8 ]
	
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
	
	문자열로 입력받아서 문자로 변환후 처리하세요.
	
*/

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
	// 진입점 함수			
		
		// 할 일
		// 1) 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 받기 전 입력 메세지 출력
		System.out.print("5자리 숫자 입력 : ");
		
		// 3) 입력 받은 데이터를 기억시키기
		int num = sc.nextInt();
		
		int no = 0;
		int sum = 0;
		
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		
		
		}

	}

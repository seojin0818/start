package day07;

/*

	10개의 문자를 기억할 배열을 만들고
	'A' - 'J' 까지 차례로 입력하고 출력하세요.
	
 */

import java.util.*;

public class Test03 {
	
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 배열 변수 선언 및 초기화
		char[] ch = new char[10];
		
		// 2) 각 방에 차례로 접근해서 하나씩 문자 채워주기
		for(int i = 0 ; i < ch.length ; i++) {
			char munja = (char)('A' + i);
			ch[i] = munja;
		}
		
		// 3) 내용 확인용 출력
		System.out.println(Arrays.toString(ch));
		
		// 4) 데이터를 하나씩 꺼내서 출력
		for(char munja : ch) {
			System.out.println(munja + " | ");
			
		}
	}
}
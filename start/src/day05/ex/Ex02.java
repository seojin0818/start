package day05.ex;

/*
 	
 	문제 2]
 	
 		'A' 부터 문자를 10개를 만들어서 출력하세요.
 		
 */

public class Ex02 {

	public static void main(String[] args) {
	// 진입점 함수

		// 할 일
		// 1) 'A' 부터 시작해서 문자 만들기
		char [] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		
		// 2) 배열 개수 알아내기
		int len = ch.length;
		
		// 3) for 명령문
		for(int i = 0 ; i < len ; i++) {
			System.out.println((i + 1) + " 번째 문자 : " + ch[i]);
			
		}
	}
}

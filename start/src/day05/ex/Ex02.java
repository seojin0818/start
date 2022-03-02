package day05.ex;

/*
 	
 	문제 2]
 	
 		'A' 부터 문자 10개를 만들어서 출력하세요.
 		
 */

public class Ex02 {

	public static void main(String[] args) {
	// 진입점 함수
			
		// 강사님 풀이 ]
		
		// 할 일
		// for문 만들기
		int i = 0;
		
		for(i = 0 ; i < 10 ; i++) {
			// 변수 만들기
			char ch = 'A';
		System.out.print((char)(ch + i) + " ");
		} // (ch + i) = 문자 + 정수 = 정수형이므로 char 강제 형변환
		
		System.out.println();
		System.out.println("### i : " + i);
		
		/* 
		 
		 혹은
		 
		 for(int i = 0 ; i < 10 ; i++) {
		 	System.out.println((char)('A' + 1) + " ");
		 					// ('A' + 1) = 문자 + 정수 = 정수형이므로 char 강제 형변환
		 	
		*/
		
		/* 
		 
		 문자를 랜덤으로 출력하는 방법
		 
		 for(int i = 0 ; i < 10 ; i++) {
		 	char ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		 		System.out.print(ch + " ");
		 }
		 
		 System.out.println();
		 
		 */
		
	}
}


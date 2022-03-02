package day05.ex;

/*
 	
 	문제 2]
 	
 		'A' 부터 문자 10개를 만들어서 출력하세요.
 		
 */

public class Ex02 {

	public static void main(String[] args) {
	// 진입점 함수

		/*
		
		// 할 일
		// 1) 'A' 부터 시작해서 문자 만들기
		char [] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		
		// 2) 배열 개수 알아내기
		int len = ch.length;
		
		// 3) for 명령문
		for(int i = 0 ; i < len ; i++) {
			System.out.println((i + 1) + " 번째 문자 : " + ch[i]);
			
			*/
			
		/* 강사님 풀이 ]
		
		 
		 for(int i = 0 ; i < 10 ; i++){
		 	char ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A'); // math.random 은 0.99999~까지라 double형
		 															 // true, false만 가능하므로 boolean 형변환은 안됨
		 															 // A부터 Z까지의 문자가 나올 것
		 	
		 	System.out.print(ch + " ");
		 	
		 // ==> 랜덤으로 문자 출력
		 
		 int i = 0; // 이렇게 블록 밖에서 변수 선언해주면 블록 상관 없이 변수 사용 가능
		 for(int i = 0 ; i < 10 ; i++){
		 	char ch = 'A';
		 System.out.print((char)(ch + i) + " "); // ch + i 는 정수형이므로 char로 강제 형변환
		 }
		 
		 // 혹은
		 
		 for(int i = 0 ; i < 10 ; i++){ // i가 9일 때, 10 < 10 이 되면 false 이므로 실행 안하게 되고 밑으로 내려감
		 	System.out.print((char)('A' + i) + " ");
		 
		 	System.out.println();
		 	System.out.println("### i : " + i); // 그래서 i 는 10이 됨
		
		*/
		}
	}

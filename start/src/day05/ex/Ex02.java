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
			
		/* 강사님 풀이 ]
		 for(int i = 0 ; i < 10 ; i++){
		 	char ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		 	math.random 은 0.99999~까지 나오니까 double형으로 나옴
		 	boolean 은 안됨 true, false만 가능하니까
		 	A부터 Z까지의 문자가 나올 것
		 	
		 	System.out.print(ch + " ");
		 ==> 이건 랜덤으로 나오는 것
		 
		 int i = 0; ==> 이렇게 블록 밖에서 변수 선언해주면 블록 상관 없이 쓸 수 있음
		 for(int i = 0 ; i < 10 ; i++){
		 	char ch = 'A';
		 System.out.print((char)(ch +i) + " ");
		 }
		 
		 System.out.println();
		 System.out.println(i);
		 
		 */
		
		}
	}
}

package day04.ex;

/*
 	문제 1 ]
 	
 		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 		
 		단, 3항 연산자를 사용해서 처리하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		// 할 일
		// 1) 1 ~ 25 의 숫자 3개 랜덤 발생시키기
		int no1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 3개 중 가장 큰 수만 출력하려면?
		// () ? () : ();
		
		// 출력
		System.out.println("1 ~ 25 사이의 랜덤하게 발생된 숫자 중 가장 큰 수는 " + "입니다.");
		
		
		
		
}
}

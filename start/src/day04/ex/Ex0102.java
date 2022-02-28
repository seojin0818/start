package day04.ex;

/*
 	문제 ]
 	
 		1 ~ 25 사이의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰 수, 중간 수, 작은 수를 구분해서 출력하는 프로그램을 작성하세요.
 		
 		단, 3항 연산자를 사용해서 처리하세요.
 		
 */
public class Ex0102 {
	public static void main(String[] args) {
	// 진입점 함수
			
			// 할 일
			// 1) 1 ~ 25 의 숫자 3개를 랜덤으로 생성
			int no1 = (int)(Math.random() * (25 - 1 + 1) + 1);
			int no2 = (int)(Math.random() * (25 - 1 + 1) + 1);
			int no3 = (int)(Math.random() * (25 - 1 + 1) + 1);
			
			// 2) 판별
			int max;
			max = (no1 > no2 && no1 > no3) ? no1 : (no2 > no3) ? no2 : no3;
			
			int mid;

			int min;
			min = (no1 < no2 && no1 < no3) ? no1 : (no2 < no3) ? no2 : no3;
			
			
			// 3) 출력
			System.out.println("가장 큰 수 : " + max);
			System.out.println("가장 작은 수 : " + min);
			
	}

}

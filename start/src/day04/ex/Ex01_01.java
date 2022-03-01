package day04.ex;

/*

 문제 1 ]
 	
 		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 		
 		단, if 문을 사용해서 처리하세요.
 		
 */

public class Ex01_01 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 1 ~ 25 사이의 숫자 3개를 랜덤으로 생성
		int no1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 2) 판별
		int result;
		if(no1 > no2 && no2 > no3) {
			result = no1;
		
		} else if(no1 < no2 && no2 > no3) {
			result = no2;
		
		} else {
				result = no3;
		
		// 3) 최종 출력
		System.out.println("1 ~ 25 사이의 랜덤하게 발생된 숫자 중 가장 큰 수는 " + result + " 입니다.");
		}
			}
}

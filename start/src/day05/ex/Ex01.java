package day05.ex;

/*
	문제 1 ]
	
		1 ~ 10까지의 합을 구해서 출력해주는 프로그램을 작성하세요.
	
	힌트 ]
		
		합은 결과값 변수로 만들어서 처리하세요.
 */

public class Ex01 {

	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
		// 1) 결과값 변수 만들기
		int hap = 0;
		
		// 2) 반복해서 누적 대입하기
		for(int i = 0 ; i < 10 ; i++) {
			hap = hap + (i + 1);
		}
		
		// 3) 최종 출력
		System.out.println("1 ~ 10 까지의 합은 " + hap + " 입니다.");
		
		/*
		
		int gop = 1;
		
		for(int i = 0 ; i < 10 ; i++) {
			gop = gop * (i + 1);
		}
		
		System.out.println("1 ~ 10 까지의 곱은 " + gop + " 입니다.");
		
		*/
	}
}
		

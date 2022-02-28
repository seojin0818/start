package day05;

public class Test11 {

	public static void main(String[] args) {
	// 진입점 함수
			
		// 구구단 5단을 출력하는데 곱이 5인 경우는 제외하고 출력하세요.
		
		int dan = 5;
		
		for(int i = 0 ; i < 9 ; i++) {
			int gop = (i + 1);
			
			if(gop == 5) {
				continue;
			/*
			 
			 continue 명령
			 반복문을 다음 회차로 다시 반복
			 가장 가까운 반복문을 다시 실행
			 continue 다음에 레이블이 붙을 경우 해당 레이블이 붙은 반복문의 다음회차로 진행
			 
			 */
			}
			
			System.out.println(dan + " x " + gop + " = " + (dan * gop));
			
		}

	}

}

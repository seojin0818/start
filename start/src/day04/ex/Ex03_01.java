package day04.ex;

public class Ex03_01 {
/*
  	
  	문제 3 ]
 	
 		게시물을 게시판에 출력하는데
 		하나의 페이지에 게시물을 15개를 출력할 예정이다.
 		게시물 수를 랜덤하게 발생시켜서
 		게시판의 페이지가 몇 페이지가 필요한지를 계산해서
 		출력해주는 프로그램을 작성하세요.
 		
 		참고 ]
 		
 			게시물이 없는 경우는
 			게시물이 없는 페이지가 적어도 1페이지는 필요하다.
 		
 		단, if 문을 사용해서 처리하세요.
 		
 */
	public static void main(String[] args) {
	// 진입점 함수
		
		// 할 일
					// 1) 랜덤으로 게시물 수 생성
					int no = (int)(Math.random() * (300 - 1 + 1) + 1);
					
					// 2) 변수 생성
					int no1 = no / 15;
					int no2 = (no / 15) + 1;
					// no % 15 == 0 이면 no / 15
					// no % 15 != 0 이면 (no / 15) + 1
					
					// 3) 판별
					int result;
					
					if(no % 15 == 0) {
						result = no1;
						
					} else {
						result = no2;
					}
					
					// 4) 최종 출력
					System.out.println("필요한 페이지 수는 " + result + " 입니다.");

	}

}

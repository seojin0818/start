package day05.ex;

/*
 
	문제 5 ]
	
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
	
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
	
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
	
*/

public class Ex05 {

	public static void main(String[] args) {
	// 진입점 함수

		// 할 일
		// 1) 1 ~ 3 사이의 숫자 랜덤으로 3개 생성
		int no1 = (int)(Math.random() * (3 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (3 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (3 - 1 + 1) + 1);
		
		// 최종 출력
		System.out.println();
	}

}
